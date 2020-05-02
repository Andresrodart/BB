import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.StringJoiner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.*;

/**
 * BB2CPP
 */
public class BB2CPP {
	public static class EmisorCPP extends BBBaseListener{
		ParseTreeProperty<String> cpp = new ParseTreeProperty<String>();
		String getSTR(ParseTree ctx) { return cpp.get(ctx); }
		void setSTR(ParseTree ctx, String s) { cpp.put(ctx, s); }
		String tab(String s){
			int identLevel = 0;
			StringBuilder res = new StringBuilder();
			String tab = "\t";
			for (int i = 0; i < s.length() - 1; i++) {
				res.append(s.charAt(i));
				if (s.charAt(i) == '{') identLevel++;
				else if (s.charAt(i + 1) == '}') identLevel--;
				if (s.charAt(i) == '\n') res.append(tab.repeat(identLevel));
			}
			return res.toString();
		}
		String getTipo(String tipo){
			switch (tipo) {
				case "entero":
					return "int64_t";
				case "texto":
					return "std::string";
				case "decimal":
					return "double";
				case "nada":
					return "void";
				default:
					break;
			}
			return "err";
		}
		public void exitBb(BBParser.BbContext ctx){
			StringJoiner buf =  new StringJoiner(""); 
			for(BBParser.EnunciadoContext ectx: ctx.enunciado())
				buf.add(getSTR(ectx));
			setSTR(ctx, tab(buf.toString()));
		}
		public void exitEnunciado(BBParser.EnunciadoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)) + '\n');
		}
		public void exitEnunciado_simple(BBParser.Enunciado_simpleContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)) + ";");
		}
		public void exitEnunciado_pequegno(BBParser.Enunciado_pequegnoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEnunciado_complejo(BBParser.Enunciado_complejoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEnunciado_de_eleccion(BBParser.Enunciado_de_eleccionContext ctx) {
			StringJoiner buf =  new StringJoiner(""); 
			for (int i = 0; i < ctx.getChildCount(); i++)
				buf.add(getSTR(ctx.getChild(i)));
			setSTR(ctx, buf.toString());
		}
		public void exitCaso_si(BBParser.Caso_siContext ctx) {
			BBParser.PruebaContext pctx = ctx.prueba();
			BBParser.BloqueContext bctx = ctx.bloque();
			String res = "if(" + getSTR(pctx)  + ')' + getSTR(bctx);
			setSTR(ctx, res);
		}
		public void exitCaso_o_si(BBParser.Caso_o_siContext ctx) {
			BBParser.PruebaContext pctx = ctx.prueba();
			BBParser.BloqueContext bctx = ctx.bloque();
			String res = "else if(" + getSTR(pctx)  + ')' + getSTR(bctx);
			setSTR(ctx, res);
		}
		public void exitCaso_sino(BBParser.Caso_sinoContext ctx) {
			BBParser.BloqueContext bctx = ctx.bloque();
			String res = "else" + getSTR(bctx);
			setSTR(ctx, res);
		}
		public void exitEnunciado_mientras(BBParser.Enunciado_mientrasContext ctx) {
			StringJoiner buf =  new StringJoiner(""); 
			for (int i = 0; i < ctx.getChildCount(); i++)
				buf.add(getSTR(ctx.getChild(i)));
			setSTR(ctx, buf.toString());
		}
		public void exitCaso_mientras(BBParser.Caso_mientrasContext ctx) {
			BBParser.PruebaContext pctx = ctx.prueba();
			BBParser.BloqueContext bctx = ctx.bloque();
			String res = "while(" + getSTR(pctx)  + ')' + getSTR(bctx);
			setSTR(ctx, res);
		}
		public void exitEnunciado_de_flujo(BBParser.Enunciado_de_flujoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEtiqueta_bloque_simple(BBParser.Etiqueta_bloque_simpleContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEtiqueta_bloque_complejo(BBParser.Etiqueta_bloque_complejoContext ctx) {
			StringJoiner buf =  new StringJoiner("");
			buf.add("{\n");
			for(BBParser.EnunciadoContext ectx: ctx.enunciado())
				buf.add(getSTR(ectx));
			buf.add("}");
			setSTR(ctx, buf.toString());
		}
		public void exitPrueba(BBParser.PruebaContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				String res = '(' + getSTR(ctx.prueba_ternaria) + ")?" + 
					getSTR(ctx.getChild(0)) + ":" + 
					getSTR(ctx.respuesta_ternaria);
				setSTR(ctx, res);
			}
		}
		public void exitPrueba_o(BBParser.Prueba_oContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				StringJoiner buf =  new StringJoiner(" || ");
				for(BBParser.Prueba_yContext pctx: ctx.prueba_y())
					buf.add(getSTR(pctx));
				setSTR(ctx, buf.toString());
			}
		}
		public void exitPrueba_y(BBParser.Prueba_yContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				StringJoiner buf =  new StringJoiner(" && ");
				for(BBParser.Prueba_noContext pctx: ctx.prueba_no())
					buf.add(getSTR(pctx));
				setSTR(ctx, buf.toString());
			}
		}
		public void exitEtiqueta_prueba_no(BBParser.Etiqueta_prueba_noContext ctx) {
			String res = "!(" + getSTR(ctx.prueba_no()) + ")";
			setSTR(ctx, res);
		}
		public void exitEtiqueta_prueba_no_comparacion(BBParser.Etiqueta_prueba_no_comparacionContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitComparacion(BBParser.ComparacionContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				StringJoiner buf =  new StringJoiner(" ");
				buf.add(getSTR(ctx.expresion()));
				for(BBParser.Pareja_de_comparacionContext pctx: ctx.pareja_de_comparacion())
					buf.add(getSTR(pctx));
				setSTR(ctx, buf.toString());
			}
		}
		public void exitPareja_de_comparacion(BBParser.Pareja_de_comparacionContext ctx) {
			String res = getSTR(ctx.operador_de_comporacion()) + " " +  getSTR(ctx.expresion());
			setSTR(ctx, res);
		}
		public void exitOperador_de_comporacion(BBParser.Operador_de_comporacionContext ctx) {
			setSTR(ctx, ctx.getText());
		}
		public void exitDeclaracion_de_funcion(BBParser.Declaracion_de_funcionContext ctx) {
			BBParser.BloqueContext bctx = ctx.bloque();
			StringJoiner buf =  new StringJoiner(" ");
			String tipo = getTipo(ctx.tipo.getText());
			if(getSTR(ctx.identificador()).equalsIgnoreCase("main")) buf.add("int");
			else buf.add(tipo);
			buf.add(getSTR(ctx.identificador()));
			buf.add("(");
			try {
				String parametros = getSTR(ctx.parametros());
				if(getSTR(ctx.identificador()).equalsIgnoreCase("main"))
					buf.add("int argc, char const *argv[]");
				else if(parametros.equalsIgnoreCase("null")) buf.add(parametros);
			} catch (Exception e) {
				//TODO: handle exception
			}
			buf.add(")");
			buf.add(getSTR(bctx));
			setSTR(ctx, buf.toString());
		}
		public void exitDeclaracion_de_variable_con_asignacion(BBParser.Declaracion_de_variable_con_asignacionContext ctx) {
			String tipo = getTipo(ctx.tipo.getText());
			String res = tipo + " " +  getSTR(ctx.asignar_a_variable());
			setSTR(ctx, res);
		}
		public void exitDeclaracion_de_variable_sin_asignacion(BBParser.Declaracion_de_variable_sin_asignacionContext ctx) {
			String tipo = getTipo(ctx.tipo.getText());
			String res = tipo + " " +  getSTR(ctx.identificador());
			setSTR(ctx, res);
		}
		public void exitDeclaracion_de_lista(BBParser.Declaracion_de_listaContext ctx) {
			StringJoiner buf =  new StringJoiner(" ");
			String tipo = getTipo(ctx.tipo.getText());
			buf.add("std::vector<" + tipo + "> " +  getSTR(ctx.identificador()));
			if(ctx.getChildCount() > 5){
				buf.add("{");
				StringJoiner par =  new StringJoiner(", ");
				for(BBParser.ExpresionContext ectx: ctx.expresion())
					par.add(getSTR(ectx));
				buf.add(par.toString());
				buf.add("}");
			}
			setSTR(ctx, buf.toString());
		}
		public void exitParametros(BBParser.ParametrosContext ctx) {
			StringJoiner buf =  new StringJoiner(", ");
			for(BBParser.ParametroContext pctx: ctx.parametro())
				buf.add(getSTR(pctx));
			setSTR(ctx, buf.toString());
		}
		public void exitParametro_funcion(BBParser.Parametro_funcionContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitParametro_llamada(BBParser.Parametro_llamadaContext ctx) {
			setSTR(ctx, ctx.getText());
		}
		public void exitParametro_imprime(BBParser.Parametro_imprimeContext ctx) {
			StringJoiner buf =  new StringJoiner(", ");
			for (int i = 0; i < ctx.getChildCount(); i++)
				if(ctx.getChild(i).getText().contains(",")) buf.add("\"  \"");
				else buf.add(getSTR(ctx.getChild(i)));
			setSTR(ctx, buf.toString());
		}
		public void exitRetorno(BBParser.RetornoContext ctx) {
			BBParser.ExpresionContext ectx = ctx.expresion();
			String res = "return " +  getSTR(ectx);
			setSTR(ctx, res);
		}
		public void exitAsignar_a_variable(BBParser.Asignar_a_variableContext ctx) {
			BBParser.ExpresionContext ectx = ctx.expresion();
			String res = getSTR(ctx.identificador()) + " = " + getSTR(ectx);
			setSTR(ctx, res);
		}
		public void exitAsignacion_con_operacion(BBParser.Asignacion_con_operacionContext ctx) {
			BBParser.ExpresionContext ectx = ctx.expresion();
			String res = getSTR(ctx.identificador()) + ctx.op.getText() + getSTR(ectx);
			setSTR(ctx, res);
		}
		public void exitOperador_ternario(BBParser.Operador_ternarioContext ctx) {
			String res = '(' + getSTR(ctx.prueba_ternaria) + ")?" + 
				getSTR(ctx.getChild(0)) + ":" + 
				getSTR(ctx.respuesta_ternaria) + ';';
			setSTR(ctx, res);
		}
		public void exitEtiqueta_multiplicacion_division(BBParser.Etiqueta_multiplicacion_divisionContext ctx) {
			String res = getSTR(ctx.izquierda) + ctx.operador.getText() + getSTR(ctx.derecha);
			setSTR(ctx, res);
		}
		public void exitEtiqueta_suma__resta(BBParser.Etiqueta_suma__restaContext ctx){
			String res = getSTR(ctx.izquierda) + ctx.operador.getText() + getSTR(ctx.derecha);
			setSTR(ctx, res);
		}
		public void exitEtiqueta_imprime(BBParser.Etiqueta_imprimeContext ctx) {
			StringJoiner buf =  new StringJoiner(" ");
			buf.add("std::cout << ");
			buf.add(getSTR(ctx.parametro_imprime()).replaceAll(",", " << "));
			buf.add(" << std::endl");
			setSTR(ctx, buf.toString());
		}
		public void exitEtiqueta_parentesis(BBParser.Etiqueta_parentesisContext ctx) {
			String res = "(" + getSTR(ctx.expresion()) + ")";
			setSTR(ctx, res);
		}
		public void exitEtiqueta_identificador(BBParser.Etiqueta_identificadorContext ctx) {
			setSTR(ctx, ctx.getText().replaceAll("[^a-zA-Z0-9]", "_"));
		}
		public void exitIdentificador(BBParser.IdentificadorContext ctx) {
			if(ctx.getText().compareTo("principal") == 0) setSTR(ctx, "main");
			else setSTR(ctx, ctx.getText().replaceAll("[^a-zA-Z0-9]", "_"));
		}
		public void exitEtiqueta_complemento_negativo(BBParser.Etiqueta_complemento_negativoContext ctx) {
			setSTR(ctx, ctx.getText());
		}
		public void exitEtiqueta_de_llamada_a_funcion(BBParser.Etiqueta_de_llamada_a_funcionContext ctx) {
			BBParser.ParametrosContext pctx = ctx.parametros();
			String res = getSTR(ctx.identificador()) + getSTR(pctx);
			setSTR(ctx, res);
		}
		public void exitEtiqueta_valor_atomico(BBParser.Etiqueta_valor_atomicoContext ctx) {
			setSTR(ctx, ctx.getText());
		}
		public void exitEtiqueta_valor_texto(BBParser.Etiqueta_valor_textoContext ctx) {
			setSTR(ctx, ctx.getText().replaceAll("'", "\""));
		}
	}	

	public static void main(String[] args) throws Exception {
        boolean output = false;
		if ( args.length < 0 ) System.err.println("Falta archivo");
		for (int i = 0; i < args.length; i++)
			if(args[i].equals("-output"))
				output = true;
        String inputFile = args[0];
        InputStream is  = new FileInputStream(inputFile);
        CharStream  input = CharStreams.fromFileName(inputFile);
        BBLexer lexer = new BBLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BBParser parser = new BBParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.bb();

        ParseTreeWalker walker = new ParseTreeWalker();
        EmisorCPP converter = new EmisorCPP();
        walker.walk(converter, tree);
		try {
			FileWriter myWriter = new FileWriter("BB.cpp");
			myWriter.write("#include <bits/stdc++.h>\n");
			myWriter.write(converter.getSTR(tree));
			myWriter.close();
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
		//System.out.println(converter.getSTR(tree));
    }
}