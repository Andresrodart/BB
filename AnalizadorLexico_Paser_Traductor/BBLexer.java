// Generated from .\BB.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, PUBLICO=29, PRIVADO=30, PROTEGIDO=31, 
		HEREDA=32, OBJETO=33, SI=34, ES=35, O_SI=36, SINO=37, NO=38, O=39, Y=40, 
		ES_IGUAL=41, OP_LOGICO=42, PARENTESISapertura=43, PARENTESIScierre=44, 
		SUMA=45, RESTA=46, ASTERISRCO=47, DIVISION=48, ASIGNACION=49, POTENCIA=50, 
		TIPO=51, TEXTO=52, IDENTIFICADOR=53, METODO=54, ENTERO=55, DECIMAL=56, 
		COMENTARIO=57, TABULACION=58, SALTO_DE_LINEA=59, IGNORA_=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "DIGITO", "EXPONENCIAL", "MINÚSCULA", "MAYÚSCULA", 
			"ESPACIOS", "ESC", "PUBLICO", "PRIVADO", "PROTEGIDO", "HEREDA", "OBJETO", 
			"SI", "ES", "O_SI", "SINO", "NO", "O", "Y", "ES_IGUAL", "OP_LOGICO", 
			"PARENTESISapertura", "PARENTESIScierre", "SUMA", "RESTA", "ASTERISRCO", 
			"DIVISION", "ASIGNACION", "POTENCIA", "TIPO", "TEXTO", "IDENTIFICADOR", 
			"METODO", "ENTERO", "DECIMAL", "COMENTARIO", "TABULACION", "SALTO_DE_LINEA", 
			"IGNORA_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'mientras'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'lista'", "'['", "','", "']'", "'regresa'", "'+='", "'-='", 
			"'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", 
			"'**='", "'//='", "'recibe'", "'p\u00FAblico'", "'privado'", "'protegido'", 
			"'hereda'", "'objeto'", "'si'", "'es'", "'o si'", "'sino'", "'no'", "'o'", 
			"'y'", null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "PUBLICO", "PRIVADO", "PROTEGIDO", "HEREDA", 
			"OBJETO", "SI", "ES", "O_SI", "SINO", "NO", "O", "Y", "ES_IGUAL", "OP_LOGICO", 
			"PARENTESISapertura", "PARENTESIScierre", "SUMA", "RESTA", "ASTERISRCO", 
			"DIVISION", "ASIGNACION", "POTENCIA", "TIPO", "TEXTO", "IDENTIFICADOR", 
			"METODO", "ENTERO", "DECIMAL", "COMENTARIO", "TABULACION", "SALTO_DE_LINEA", 
			"IGNORA_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		// Una cola donde se almacenarán los tokens extra (ver la deinición de SALTO_DE_LINEA).
		private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
		// La pila que lleva el registro del nivel de identación
		private java.util.Stack<Integer> indents = new java.util.Stack<>();
		// The amount of opened braces, brackets and parenthesis.
		private int opened = 0;
		// The most recently produced token.
		private Token lastToken = null;
		@Override
		public void emit(Token t) {
			super.setToken(t);
			tokens.offer(t);
		}

	  	@Override
	  	public Token nextToken() {
			// Checa si el EOF sigue y además faltan desidentaciones (DEDENTs)
			if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
		  		// Quita todos los tokens de EOF del buffer.
		  		for (int i = tokens.size() - 1; i >= 0; i--) {
					if (tokens.get(i).getType() == EOF) {
			  			tokens.remove(i);
					}
		  		}

		  		// Primero emite un salto de linea extra que sirva como el final del enunciado.
		  		this.emit(commonToken(BBParser.SALTO_DE_LINEA, "\n"));

				// Ahora emite todos los tokens de DEDENT necesarios.
		  		while (!indents.isEmpty()) {
					this.emit(createDedent());
					indents.pop();
		  		}

		  		// Pon el EOF de regreso en el flujo de token.
		  		this.emit(commonToken(BBParser.EOF, "<EOF>"));
			}

			Token next = super.nextToken();

			if (next.getChannel() == Token.DEFAULT_CHANNEL) {
				// Keep track of the last token on the default channel.
				this.lastToken = next;
			}

			return tokens.isEmpty() ? next : tokens.poll();
	  	}

		private Token createDedent() {
			CommonToken dedent = commonToken(BBParser.DEDENT, "");
			dedent.setLine(this.lastToken.getLine());
			return dedent;
		}

		private CommonToken commonToken(int type, String text) {
			int stop = this.getCharIndex() - 1;
			int start = text.isEmpty() ? stop : stop - text.length() + 1;
			return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
		}

		//  Calcula la identación de los espacios que se proporcionaron
		// 	sigueindo las siguientes reglas:
		// 		"Las tabulaciones don reemplazadas (de izquierda a derecha)
		//		 por uno a 8 espacios de forma tal que el número de caracteres, 
		//		 inlcluido el reemplazo, sea multiplo de 8 [...]"
		//  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
		static int getIndentationCount(String spaces) {
			int count = 0;
			for (char ch : spaces.toCharArray()) {
				switch (ch) {
						case '\t':
							count += 8 - (count % 8);
							break;
						default:
							// A normal space char.
							count++;
					}
				}

				return count;
			}

	  	boolean atStartOfInput(){
			return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  	}


	public BBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 64:
			SALTO_DE_LINEA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SALTO_DE_LINEA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

													String newLine = getText().replaceAll("[^\r\n\f]+", "");
													String spaces = getText().replaceAll("[\r\n\f]+", "");
					
													// Quita los saltos de linea dentro de clausulas, exepto si estamos cerca del EOF. 
													// Mantenemos los SALTO_DE_LINEAs ceerca del EOF para
													// satisfacer el salto de linea final necesario por la regla de una única instrucción 
													// usado por el REPL.
													int next = _input.LA(1);
													int nextnext = _input.LA(2);
													if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
														// Si estamos dentro de una lista o un espacio en blanco, ignora todas las identaciones,
														// deidentaciones y saltos de linea.
														skip();
													}
													else {
														emit(commonToken(SALTO_DE_LINEA, newLine));
														int indent = getIndentationCount(spaces);
														int previous = indents.isEmpty() ? 0 : indents.peek();
														if (indent == previous) {
															// Salta las identaciones de un tamaño igual al nivel de identacion actual
															skip();
														}
														else if (indent > previous) {
															indents.push(indent);
															emit(commonToken(BBParser.INDENT, spaces));
														}
														else {
															// Posiblemente emite mas de un token DEDENT.
															while(!indents.isEmpty() && indents.peek() > indent) {
																this.emit(createDedent());
																indents.pop();
															}
														}
													}
												
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 64:
			return SALTO_DE_LINEA_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SALTO_DE_LINEA_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\5\37\u00ef\n\37\3\37\3\37\3 \5 \u00f4\n "+
		"\3!\5!\u00f7\n!\3\"\6\"\u00fa\n\"\r\"\16\"\u00fb\3#\3#\3#\3#\5#\u0102"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\60\5\60\u0146\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u0157\n\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u018f\n:\3;\3;\3;\7;\u0194\n;\f;\16;\u0197\13;\3"+
		";\3;\3;\3;\7;\u019d\n;\f;\16;\u01a0\13;\3;\5;\u01a3\n;\3<\3<\3<\6<\u01a8"+
		"\n<\r<\16<\u01a9\3<\3<\3<\3<\7<\u01b0\n<\f<\16<\u01b3\13<\3=\3=\3=\3>"+
		"\5>\u01b9\n>\3>\6>\u01bc\n>\r>\16>\u01bd\3?\5?\u01c1\n?\3?\7?\u01c4\n"+
		"?\f?\16?\u01c7\13?\3?\3?\6?\u01cb\n?\r?\16?\u01cc\3@\3@\3@\3@\7@\u01d3"+
		"\n@\f@\16@\u01d6\13@\3@\3@\3@\3@\3@\3A\6A\u01de\nA\rA\16A\u01df\3B\3B"+
		"\3B\5B\u01e5\nB\3B\3B\5B\u01e9\nB\3B\5B\u01ec\nB\5B\u01ee\nB\3B\3B\3C"+
		"\3C\3C\3C\5\u0195\u019e\u01d4\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\2=\2?\2A\2C\2E\2G\37I K!M\"O#Q$S%U&W\'Y"+
		"([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67y8{9}:\177;\u0081<\u0083"+
		"=\u0085>\3\2\n\3\2\62;\4\2GGgg\4\2--//\n\2c|\u00e3\u00e3\u00eb\u00eb\u00ef"+
		"\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc\u00fe\u00fe\t\2C\\\u00c3\u00c3"+
		"\u00cb\u00cb\u00d3\u00d3\u00d5\u00d5\u00dc\u00dc\u00de\u00de\4\2\13\13"+
		"\"\"\4\2>>@@\3\2\13\13\2\u0216\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089"+
		"\3\2\2\2\7\u008b\3\2\2\2\t\u0094\3\2\2\2\13\u0096\3\2\2\2\r\u0098\3\2"+
		"\2\2\17\u009b\3\2\2\2\21\u009e\3\2\2\2\23\u00a1\3\2\2\2\25\u00a4\3\2\2"+
		"\2\27\u00aa\3\2\2\2\31\u00ac\3\2\2\2\33\u00ae\3\2\2\2\35\u00b0\3\2\2\2"+
		"\37\u00b8\3\2\2\2!\u00bb\3\2\2\2#\u00be\3\2\2\2%\u00c1\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c7\3\2\2\2+\u00ca\3\2\2\2-\u00cd\3\2\2\2/\u00d0\3\2\2\2\61"+
		"\u00d3\3\2\2\2\63\u00d7\3\2\2\2\65\u00db\3\2\2\2\67\u00df\3\2\2\29\u00e3"+
		"\3\2\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00f3\3\2\2\2A\u00f6\3\2\2\2C"+
		"\u00f9\3\2\2\2E\u0101\3\2\2\2G\u0103\3\2\2\2I\u010b\3\2\2\2K\u0113\3\2"+
		"\2\2M\u011d\3\2\2\2O\u0124\3\2\2\2Q\u012b\3\2\2\2S\u012e\3\2\2\2U\u0131"+
		"\3\2\2\2W\u0136\3\2\2\2Y\u013b\3\2\2\2[\u013e\3\2\2\2]\u0140\3\2\2\2_"+
		"\u0145\3\2\2\2a\u0156\3\2\2\2c\u0158\3\2\2\2e\u015a\3\2\2\2g\u015c\3\2"+
		"\2\2i\u015e\3\2\2\2k\u0160\3\2\2\2m\u0162\3\2\2\2o\u0164\3\2\2\2q\u0166"+
		"\3\2\2\2s\u018e\3\2\2\2u\u01a2\3\2\2\2w\u01a7\3\2\2\2y\u01b4\3\2\2\2{"+
		"\u01b8\3\2\2\2}\u01c0\3\2\2\2\177\u01ce\3\2\2\2\u0081\u01dd\3\2\2\2\u0083"+
		"\u01ed\3\2\2\2\u0085\u01f1\3\2\2\2\u0087\u0088\7=\2\2\u0088\4\3\2\2\2"+
		"\u0089\u008a\7<\2\2\u008a\6\3\2\2\2\u008b\u008c\7o\2\2\u008c\u008d\7k"+
		"\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091"+
		"\7t\2\2\u0091\u0092\7c\2\2\u0092\u0093\7u\2\2\u0093\b\3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\n\3\2\2\2\u0096\u0097\7@\2\2\u0097\f\3\2\2\2\u0098\u0099"+
		"\7?\2\2\u0099\u009a\7?\2\2\u009a\16\3\2\2\2\u009b\u009c\7@\2\2\u009c\u009d"+
		"\7?\2\2\u009d\20\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7?\2\2\u00a0\22"+
		"\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\7?\2\2\u00a3\24\3\2\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v\2\2"+
		"\u00a8\u00a9\7c\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab\30\3\2\2"+
		"\2\u00ac\u00ad\7.\2\2\u00ad\32\3\2\2\2\u00ae\u00af\7_\2\2\u00af\34\3\2"+
		"\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\36\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9\u00ba\7?\2\2\u00ba \3\2\2\2\u00bb"+
		"\u00bc\7/\2\2\u00bc\u00bd\7?\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7,\2\2\u00bf"+
		"\u00c0\7?\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7B\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7?\2\2\u00c6(\3\2\2\2\u00c7"+
		"\u00c8\7\'\2\2\u00c8\u00c9\7?\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb"+
		"\u00cc\7?\2\2\u00cc,\3\2\2\2\u00cd\u00ce\7~\2\2\u00ce\u00cf\7?\2\2\u00cf"+
		".\3\2\2\2\u00d0\u00d1\7`\2\2\u00d1\u00d2\7?\2\2\u00d2\60\3\2\2\2\u00d3"+
		"\u00d4\7>\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d6\62\3\2\2\2\u00d7"+
		"\u00d8\7@\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\7?\2\2\u00da\64\3\2\2\2\u00db"+
		"\u00dc\7,\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7?\2\2\u00de\66\3\2\2\2\u00df"+
		"\u00e0\7\61\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7?\2\2\u00e28\3\2\2\2"+
		"\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7g\2\2\u00e9:\3\2\2\2\u00ea\u00eb"+
		"\t\2\2\2\u00eb<\3\2\2\2\u00ec\u00ee\t\3\2\2\u00ed\u00ef\t\4\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5;"+
		"\36\2\u00f1>\3\2\2\2\u00f2\u00f4\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f4@\3"+
		"\2\2\2\u00f5\u00f7\t\6\2\2\u00f6\u00f5\3\2\2\2\u00f7B\3\2\2\2\u00f8\u00fa"+
		"\t\7\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7^\2\2\u00fe\u0102\7$\2\2\u00ff"+
		"\u0100\7^\2\2\u0100\u0102\7^\2\2\u0101\u00fd\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0102F\3\2\2\2\u0103\u0104\7r\2\2\u0104\u0105\7\u00fc\2\2\u0105\u0106"+
		"\7d\2\2\u0106\u0107\7n\2\2\u0107\u0108\7k\2\2\u0108\u0109\7e\2\2\u0109"+
		"\u010a\7q\2\2\u010aH\3\2\2\2\u010b\u010c\7r\2\2\u010c\u010d\7t\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7x\2\2\u010f\u0110\7c\2\2\u0110\u0111\7f\2\2"+
		"\u0111\u0112\7q\2\2\u0112J\3\2\2\2\u0113\u0114\7r\2\2\u0114\u0115\7t\2"+
		"\2\u0115\u0116\7q\2\2\u0116\u0117\7v\2\2\u0117\u0118\7g\2\2\u0118\u0119"+
		"\7i\2\2\u0119\u011a\7k\2\2\u011a\u011b\7f\2\2\u011b\u011c\7q\2\2\u011c"+
		"L\3\2\2\2\u011d\u011e\7j\2\2\u011e\u011f\7g\2\2\u011f\u0120\7t\2\2\u0120"+
		"\u0121\7g\2\2\u0121\u0122\7f\2\2\u0122\u0123\7c\2\2\u0123N\3\2\2\2\u0124"+
		"\u0125\7q\2\2\u0125\u0126\7d\2\2\u0126\u0127\7l\2\2\u0127\u0128\7g\2\2"+
		"\u0128\u0129\7v\2\2\u0129\u012a\7q\2\2\u012aP\3\2\2\2\u012b\u012c\7u\2"+
		"\2\u012c\u012d\7k\2\2\u012dR\3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130\7"+
		"u\2\2\u0130T\3\2\2\2\u0131\u0132\7q\2\2\u0132\u0133\7\"\2\2\u0133\u0134"+
		"\7u\2\2\u0134\u0135\7k\2\2\u0135V\3\2\2\2\u0136\u0137\7u\2\2\u0137\u0138"+
		"\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a\7q\2\2\u013aX\3\2\2\2\u013b\u013c"+
		"\7p\2\2\u013c\u013d\7q\2\2\u013dZ\3\2\2\2\u013e\u013f\7q\2\2\u013f\\\3"+
		"\2\2\2\u0140\u0141\7{\2\2\u0141^\3\2\2\2\u0142\u0143\7?\2\2\u0143\u0146"+
		"\7?\2\2\u0144\u0146\5S*\2\u0145\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"`\3\2\2\2\u0147\u0157\t\b\2\2\u0148\u0149\7@\2\2\u0149\u0157\7?\2\2\u014a"+
		"\u014b\7>\2\2\u014b\u0157\7?\2\2\u014c\u014d\7#\2\2\u014d\u0157\7?\2\2"+
		"\u014e\u0157\5Y-\2\u014f\u0157\5[.\2\u0150\u0157\5]/\2\u0151\u0157\5_"+
		"\60\2\u0152\u0153\5Y-\2\u0153\u0154\7g\2\2\u0154\u0155\7u\2\2\u0155\u0157"+
		"\3\2\2\2\u0156\u0147\3\2\2\2\u0156\u0148\3\2\2\2\u0156\u014a\3\2\2\2\u0156"+
		"\u014c\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u014f\3\2\2\2\u0156\u0150\3\2"+
		"\2\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2\2\2\u0157b\3\2\2\2\u0158\u0159"+
		"\7*\2\2\u0159d\3\2\2\2\u015a\u015b\7+\2\2\u015bf\3\2\2\2\u015c\u015d\7"+
		"-\2\2\u015dh\3\2\2\2\u015e\u015f\7/\2\2\u015fj\3\2\2\2\u0160\u0161\7,"+
		"\2\2\u0161l\3\2\2\2\u0162\u0163\7\61\2\2\u0163n\3\2\2\2\u0164\u0165\7"+
		"?\2\2\u0165p\3\2\2\2\u0166\u0167\7`\2\2\u0167r\3\2\2\2\u0168\u0169\7g"+
		"\2\2\u0169\u016a\7p\2\2\u016a\u016b\7v\2\2\u016b\u016c\7g\2\2\u016c\u016d"+
		"\7t\2\2\u016d\u018f\7q\2\2\u016e\u016f\7v\2\2\u016f\u0170\7g\2\2\u0170"+
		"\u0171\7z\2\2\u0171\u0172\7v\2\2\u0172\u018f\7q\2\2\u0173\u0174\7f\2\2"+
		"\u0174\u0175\7g\2\2\u0175\u0176\7e\2\2\u0176\u0177\7k\2\2\u0177\u0178"+
		"\7o\2\2\u0178\u0179\7c\2\2\u0179\u018f\7n\2\2\u017a\u017b\7n\2\2\u017b"+
		"\u017c\7k\2\2\u017c\u017d\7u\2\2\u017d\u017e\7v\2\2\u017e\u018f\7c\2\2"+
		"\u017f\u0180\7p\2\2\u0180\u0181\7c\2\2\u0181\u0182\7f\2\2\u0182\u018f"+
		"\7c\2\2\u0183\u0184\7e\2\2\u0184\u0185\7q\2\2\u0185\u0186\7p\2\2\u0186"+
		"\u0187\7u\2\2\u0187\u0188\7v\2\2\u0188\u0189\7t\2\2\u0189\u018a\7w\2\2"+
		"\u018a\u018b\7e\2\2\u018b\u018c\7v\2\2\u018c\u018d\7q\2\2\u018d\u018f"+
		"\7t\2\2\u018e\u0168\3\2\2\2\u018e\u016e\3\2\2\2\u018e\u0173\3\2\2\2\u018e"+
		"\u017a\3\2\2\2\u018e\u017f\3\2\2\2\u018e\u0183\3\2\2\2\u018ft\3\2\2\2"+
		"\u0190\u0195\7)\2\2\u0191\u0194\5E#\2\u0192\u0194\13\2\2\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0196\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u01a3\7)"+
		"\2\2\u0199\u019e\7$\2\2\u019a\u019d\5E#\2\u019b\u019d\13\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019f\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\7$"+
		"\2\2\u01a2\u0190\3\2\2\2\u01a2\u0199\3\2\2\2\u01a3v\3\2\2\2\u01a4\u01a8"+
		"\5? \2\u01a5\u01a8\5A!\2\u01a6\u01a8\7a\2\2\u01a7\u01a4\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01b1\3\2\2\2\u01ab\u01b0\5? \2\u01ac\u01b0"+
		"\5A!\2\u01ad\u01b0\5;\36\2\u01ae\u01b0\7a\2\2\u01af\u01ab\3\2\2\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2x\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b4\u01b5\7\60\2\2\u01b5\u01b6\5w<\2\u01b6z\3\2\2\2\u01b7\u01b9"+
		"\7/\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01bc\5;\36\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be|\3\2\2\2\u01bf\u01c1\7/\2\2\u01c0\u01bf"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c5\3\2\2\2\u01c2\u01c4\5;\36\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\7\60\2\2\u01c9"+
		"\u01cb\5;\36\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd~\3\2\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d0"+
		"\7,\2\2\u01d0\u01d4\3\2\2\2\u01d1\u01d3\13\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\7,\2\2\u01d8\u01d9\7\61\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\b@\2\2\u01db\u0080\3\2\2\2\u01dc\u01de\t\t"+
		"\2\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u0082\3\2\2\2\u01e1\u01e2\6B\2\2\u01e2\u01ee\5C\""+
		"\2\u01e3\u01e5\7\17\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e9\7\f\2\2\u01e7\u01e9\4\16\17\2\u01e8\u01e4\3"+
		"\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\5C\"\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01e1\3\2"+
		"\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\bB\3\2\u01f0"+
		"\u0084\3\2\2\2\u01f1\u01f2\5C\"\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\bC\4"+
		"\2\u01f4\u0086\3\2\2\2\37\2\u00ee\u00f3\u00f6\u00fb\u0101\u0145\u0156"+
		"\u018e\u0193\u0195\u019c\u019e\u01a2\u01a7\u01a9\u01af\u01b1\u01b8\u01bd"+
		"\u01c0\u01c5\u01cc\u01d4\u01df\u01e4\u01e8\u01eb\u01ed\5\2\3\2\3B\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}