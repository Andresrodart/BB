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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, SI=30, ES=31, O_SI=32, 
		SINO=33, NO=34, O=35, Y=36, ES_IGUAL=37, OP_LOGICO=38, PARENTESISapertura=39, 
		PARENTESIScierre=40, SUMA=41, RESTA=42, ASTERISRCO=43, DIVISION=44, ASIGNACION=45, 
		POTENCIA=46, TIPO=47, TEXTO=48, IDENTIFICADOR=49, ENTERO=50, DECIMAL=51, 
		COMENTARIO=52, TABULACION=53, SALTO_DE_LINEA=54, IGNORA_=55;
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
			"T__25", "T__26", "T__27", "T__28", "DIGITO", "MINÚSCULA", "EXPONENCIAL", 
			"MAYÚSCULA", "ESPACIOS", "ESC", "SI", "ES", "O_SI", "SINO", "NO", "O", 
			"Y", "ES_IGUAL", "OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", 
			"SUMA", "RESTA", "ASTERISRCO", "DIVISION", "ASIGNACION", "POTENCIA", 
			"TIPO", "TEXTO", "IDENTIFICADOR", "ENTERO", "DECIMAL", "COMENTARIO", 
			"TABULACION", "SALTO_DE_LINEA", "IGNORA_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'mientras'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'def'", "'lista'", "'['", "','", "']'", "'regresa'", "'+='", 
			"'-='", "'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='", "'**='", "'//='", "'imprime'", "'si'", "'es'", "'o si'", "'sino'", 
			"'no'", "'o'", "'y'", null, null, "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "SI", "ES", "O_SI", "SINO", "NO", 
			"O", "Y", "ES_IGUAL", "OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", 
			"SUMA", "RESTA", "ASTERISRCO", "DIVISION", "ASIGNACION", "POTENCIA", 
			"TIPO", "TEXTO", "IDENTIFICADOR", "ENTERO", "DECIMAL", "COMENTARIO", 
			"TABULACION", "SALTO_DE_LINEA", "IGNORA_"
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
		case 59:
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
		case 59:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3 \5 \u00e9\n \3!\3!\5!\u00ed\n!\3!\3!\3\"\5\"\u00f2\n\"\3"+
		"#\6#\u00f5\n#\r#\16#\u00f6\3$\3$\3$\3$\5$\u00fd\n$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\5,\u0119"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u012a\n-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0157"+
		"\n\66\3\67\3\67\3\67\7\67\u015c\n\67\f\67\16\67\u015f\13\67\3\67\3\67"+
		"\3\67\3\67\7\67\u0165\n\67\f\67\16\67\u0168\13\67\3\67\5\67\u016b\n\67"+
		"\38\38\38\68\u0170\n8\r8\168\u0171\38\38\38\38\78\u0178\n8\f8\168\u017b"+
		"\138\39\59\u017e\n9\39\69\u0181\n9\r9\169\u0182\3:\5:\u0186\n:\3:\7:\u0189"+
		"\n:\f:\16:\u018c\13:\3:\3:\6:\u0190\n:\r:\16:\u0191\3;\3;\3;\3;\7;\u0198"+
		"\n;\f;\16;\u019b\13;\3;\3;\3;\3;\3;\3<\6<\u01a3\n<\r<\16<\u01a4\3=\3="+
		"\3=\5=\u01aa\n=\3=\3=\5=\u01ae\n=\3=\5=\u01b1\n=\5=\u01b3\n=\3=\3=\3>"+
		"\3>\3>\3>\5\u015d\u0166\u0199\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2E\2G\2I K!M\"O#Q$S%U&W\'Y"+
		"([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67y8{9\3\2\n\3\2\62;\n\2"+
		"c|\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc"+
		"\u00fe\u00fe\4\2GGgg\4\2--//\t\2C\\\u00c3\u00c3\u00cb\u00cb\u00d3\u00d3"+
		"\u00d5\u00d5\u00dc\u00dc\u00de\u00de\4\2\13\13\"\"\4\2>>@@\3\2\13\13\2"+
		"\u01da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7\u0081\3\2\2\2\t\u008a"+
		"\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2\2\17\u0091\3\2\2\2\21\u0094\3"+
		"\2\2\2\23\u0097\3\2\2\2\25\u009a\3\2\2\2\27\u009e\3\2\2\2\31\u00a4\3\2"+
		"\2\2\33\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00aa\3\2\2\2!\u00b2\3\2\2\2"+
		"#\u00b5\3\2\2\2%\u00b8\3\2\2\2\'\u00bb\3\2\2\2)\u00be\3\2\2\2+\u00c1\3"+
		"\2\2\2-\u00c4\3\2\2\2/\u00c7\3\2\2\2\61\u00ca\3\2\2\2\63\u00cd\3\2\2\2"+
		"\65\u00d1\3\2\2\2\67\u00d5\3\2\2\29\u00d9\3\2\2\2;\u00dd\3\2\2\2=\u00e5"+
		"\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00f1\3\2\2\2E\u00f4\3\2\2\2G"+
		"\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0101\3\2\2\2M\u0104\3\2\2\2O\u0109\3\2"+
		"\2\2Q\u010e\3\2\2\2S\u0111\3\2\2\2U\u0113\3\2\2\2W\u0118\3\2\2\2Y\u0129"+
		"\3\2\2\2[\u012b\3\2\2\2]\u012d\3\2\2\2_\u012f\3\2\2\2a\u0131\3\2\2\2c"+
		"\u0133\3\2\2\2e\u0135\3\2\2\2g\u0137\3\2\2\2i\u0139\3\2\2\2k\u0156\3\2"+
		"\2\2m\u016a\3\2\2\2o\u016f\3\2\2\2q\u017d\3\2\2\2s\u0185\3\2\2\2u\u0193"+
		"\3\2\2\2w\u01a2\3\2\2\2y\u01b2\3\2\2\2{\u01b6\3\2\2\2}~\7=\2\2~\4\3\2"+
		"\2\2\177\u0080\7<\2\2\u0080\6\3\2\2\2\u0081\u0082\7o\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7t\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\b\3\2\2\2\u008a\u008b"+
		"\7>\2\2\u008b\n\3\2\2\2\u008c\u008d\7@\2\2\u008d\f\3\2\2\2\u008e\u008f"+
		"\7?\2\2\u008f\u0090\7?\2\2\u0090\16\3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093"+
		"\7?\2\2\u0093\20\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096\22"+
		"\3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099\24\3\2\2\2\u009a"+
		"\u009b\7f\2\2\u009b\u009c\7g\2\2\u009c\u009d\7h\2\2\u009d\26\3\2\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2"+
		"\u00a2\u00a3\7c\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5\32\3\2\2"+
		"\2\u00a6\u00a7\7.\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7_\2\2\u00a9\36\3\2"+
		"\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		" \3\2\2\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\7?\2\2\u00b4\"\3\2\2\2\u00b5"+
		"\u00b6\7/\2\2\u00b6\u00b7\7?\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\u00ba\7?\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7B\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"(\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\7?\2\2\u00c0*\3\2\2\2\u00c1"+
		"\u00c2\7\'\2\2\u00c2\u00c3\7?\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7(\2\2\u00c5"+
		"\u00c6\7?\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7~\2\2\u00c8\u00c9\7?\2\2\u00c9"+
		"\60\3\2\2\2\u00ca\u00cb\7`\2\2\u00cb\u00cc\7?\2\2\u00cc\62\3\2\2\2\u00cd"+
		"\u00ce\7>\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0\7?\2\2\u00d0\64\3\2\2\2\u00d1"+
		"\u00d2\7@\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7?\2\2\u00d4\66\3\2\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\7?\2\2\u00d88\3\2\2\2\u00d9"+
		"\u00da\7\61\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7?\2\2\u00dc:\3\2\2\2"+
		"\u00dd\u00de\7k\2\2\u00de\u00df\7o\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"<\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6>\3\2\2\2\u00e7\u00e9\t\3\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9@\3\2\2\2\u00ea\u00ec\t\4\2\2\u00eb\u00ed\t\5\2\2"+
		"\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\5=\37\2\u00efB\3\2\2\2\u00f0\u00f2\t\6\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"D\3\2\2\2\u00f3\u00f5\t\7\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7"+
		"^\2\2\u00f9\u00fd\7$\2\2\u00fa\u00fb\7^\2\2\u00fb\u00fd\7^\2\2\u00fc\u00f8"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100"+
		"\7k\2\2\u0100J\3\2\2\2\u0101\u0102\7g\2\2\u0102\u0103\7u\2\2\u0103L\3"+
		"\2\2\2\u0104\u0105\7q\2\2\u0105\u0106\7\"\2\2\u0106\u0107\7u\2\2\u0107"+
		"\u0108\7k\2\2\u0108N\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7q\2\2\u010dP\3\2\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7q\2\2\u0110R\3\2\2\2\u0111\u0112\7q\2\2\u0112T\3\2\2\2\u0113\u0114"+
		"\7{\2\2\u0114V\3\2\2\2\u0115\u0116\7?\2\2\u0116\u0119\7?\2\2\u0117\u0119"+
		"\5K&\2\u0118\u0115\3\2\2\2\u0118\u0117\3\2\2\2\u0119X\3\2\2\2\u011a\u012a"+
		"\t\b\2\2\u011b\u011c\7@\2\2\u011c\u012a\7?\2\2\u011d\u011e\7>\2\2\u011e"+
		"\u012a\7?\2\2\u011f\u0120\7#\2\2\u0120\u012a\7?\2\2\u0121\u012a\5Q)\2"+
		"\u0122\u012a\5S*\2\u0123\u012a\5U+\2\u0124\u012a\5W,\2\u0125\u0126\5Q"+
		")\2\u0126\u0127\7g\2\2\u0127\u0128\7u\2\2\u0128\u012a\3\2\2\2\u0129\u011a"+
		"\3\2\2\2\u0129\u011b\3\2\2\2\u0129\u011d\3\2\2\2\u0129\u011f\3\2\2\2\u0129"+
		"\u0121\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2"+
		"\2\2\u0129\u0125\3\2\2\2\u012aZ\3\2\2\2\u012b\u012c\7*\2\2\u012c\\\3\2"+
		"\2\2\u012d\u012e\7+\2\2\u012e^\3\2\2\2\u012f\u0130\7-\2\2\u0130`\3\2\2"+
		"\2\u0131\u0132\7/\2\2\u0132b\3\2\2\2\u0133\u0134\7,\2\2\u0134d\3\2\2\2"+
		"\u0135\u0136\7\61\2\2\u0136f\3\2\2\2\u0137\u0138\7?\2\2\u0138h\3\2\2\2"+
		"\u0139\u013a\7`\2\2\u013aj\3\2\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2"+
		"\2\u013d\u013e\7v\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0157"+
		"\7q\2\2\u0141\u0142\7v\2\2\u0142\u0143\7g\2\2\u0143\u0144\7z\2\2\u0144"+
		"\u0145\7v\2\2\u0145\u0157\7q\2\2\u0146\u0147\7f\2\2\u0147\u0148\7g\2\2"+
		"\u0148\u0149\7e\2\2\u0149\u014a\7k\2\2\u014a\u014b\7o\2\2\u014b\u014c"+
		"\7c\2\2\u014c\u0157\7n\2\2\u014d\u014e\7n\2\2\u014e\u014f\7k\2\2\u014f"+
		"\u0150\7u\2\2\u0150\u0151\7v\2\2\u0151\u0157\7c\2\2\u0152\u0153\7p\2\2"+
		"\u0153\u0154\7c\2\2\u0154\u0155\7f\2\2\u0155\u0157\7c\2\2\u0156\u013b"+
		"\3\2\2\2\u0156\u0141\3\2\2\2\u0156\u0146\3\2\2\2\u0156\u014d\3\2\2\2\u0156"+
		"\u0152\3\2\2\2\u0157l\3\2\2\2\u0158\u015d\7)\2\2\u0159\u015c\5G$\2\u015a"+
		"\u015c\13\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u016b\7)\2\2\u0161\u0166\7$\2\2\u0162\u0165\5G$\2"+
		"\u0163\u0165\13\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016b\7$\2\2\u016a\u0158\3\2\2\2\u016a\u0161\3\2"+
		"\2\2\u016bn\3\2\2\2\u016c\u0170\5? \2\u016d\u0170\5C\"\2\u016e\u0170\7"+
		"a\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0179\3\2"+
		"\2\2\u0173\u0178\5? \2\u0174\u0178\5C\"\2\u0175\u0178\5=\37\2\u0176\u0178"+
		"\7a\2\2\u0177\u0173\3\2\2\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017ap\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\7/\2\2\u017d\u017c"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0181\5=\37\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183r\3\2\2\2\u0184\u0186\7/\2\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u018a\3\2\2\2\u0187\u0189\5=\37\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u018f\7\60\2\2\u018e\u0190\5=\37\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192t\3\2\2\2\u0193\u0194\7\61\2\2\u0194\u0195\7,\2\2\u0195\u0199"+
		"\3\2\2\2\u0196\u0198\13\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u019d\7,\2\2\u019d\u019e\7\61\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\b;\2\2\u01a0v\3\2\2\2\u01a1\u01a3\t\t\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5x\3\2\2\2"+
		"\u01a6\u01a7\6=\2\2\u01a7\u01b3\5E#\2\u01a8\u01aa\7\17\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\7\f\2\2\u01ac"+
		"\u01ae\4\16\17\2\u01ad\u01a9\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b0\3"+
		"\2\2\2\u01af\u01b1\5E#\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01a6\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b5\b=\3\2\u01b5z\3\2\2\2\u01b6\u01b7\5E#\2\u01b7\u01b8\3"+
		"\2\2\2\u01b8\u01b9\b>\4\2\u01b9|\3\2\2\2\37\2\u00e8\u00ec\u00f1\u00f6"+
		"\u00fc\u0118\u0129\u0156\u015b\u015d\u0164\u0166\u016a\u016f\u0171\u0177"+
		"\u0179\u017d\u0182\u0185\u018a\u0191\u0199\u01a4\u01a9\u01ad\u01b0\u01b2"+
		"\5\2\3\2\3=\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}