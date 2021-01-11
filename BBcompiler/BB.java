package BBcompiler;

import java.io.*;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.charset.Charset;
/**
 * BB2CPP
 */
public class BB{
	public static void main(String[] args) throws Exception {
		boolean output = false;
		if ( args.length <= 0 ) System.err.println("Falta archivo");
		for (int i = 0; i < args.length; i++)
			if(args[i].equals("-output")) output = true;
		
		String inputFile = args[0];
		CharStream  input = CharStreams.fromFileName(inputFile, Charset.forName("utf-8"));
		BBLexer lexer = new BBLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		BBParser parser = new BBParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.bb();

		ParseTreeWalker walker = new ParseTreeWalker();
		Emisor converter = new Emisor();
		walker.walk(converter, tree);
		try {
			Writer out = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("BB.cpp"), "UTF-8"));
			out.write("#include <bits/stdc++.h>\n#if !defined(True)\n#define True  (1==1)\n#endif\n#if !defined(False)\n#define False (!True)\n#endif\n#ifdef _WIN32\n#include <fcntl.h>\n#endif\n\n");
			out.write(converter.getSTR(tree));
			out.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		if(output) {
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "g++ \"./BB.cpp\"");
			builder.redirectErrorStream(true);
			Process p = builder.start();
			BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;
			while (true) {
				line = r.readLine();
				if (line == null) { break; }
				System.out.println(line);
			}	
		}
	}
}