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
		T__24=25, T__25=26, T__26=27, SI=28, ES=29, O_SI=30, SINO=31, NO=32, O=33, 
		Y=34, ES_IGUAL=35, OP_LOGICO=36, PARENTESISapertura=37, PARENTESIScierre=38, 
		SUMA=39, RESTA=40, ASTERISRCO=41, DIVISION=42, ASIGNACION=43, POTENCIA=44, 
		TIPO=45, TEXTO=46, IDENTIFICADOR=47, ENTERO=48, DECIMAL=49, COMENTARIO=50, 
		TABULACION=51, SALTO_DE_LINEA=52, IGNORA_=53;
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
			"T__25", "T__26", "DIGITO", "MINÚSCULA", "EXPONENCIAL", "MAYÚSCULA", 
			"ESPACIOS", "ESC", "SI", "ES", "O_SI", "SINO", "NO", "O", "Y", "ES_IGUAL", 
			"OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", "SUMA", "RESTA", 
			"ASTERISRCO", "DIVISION", "ASIGNACION", "POTENCIA", "TIPO", "TEXTO", 
			"IDENTIFICADOR", "ENTERO", "DECIMAL", "COMENTARIO", "TABULACION", "SALTO_DE_LINEA", 
			"IGNORA_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'mientras'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'lista'", "'['", "','", "']'", "'regresa'", "'+='", "'-='", 
			"'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", 
			"'**='", "'//='", "'si'", "'es'", "'o si'", "'sino'", "'no'", "'o'", 
			"'y'", null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "SI", "ES", "O_SI", "SINO", "NO", "O", "Y", "ES_IGUAL", 
			"OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", "SUMA", "RESTA", 
			"ASTERISRCO", "DIVISION", "ASIGNACION", "POTENCIA", "TIPO", "TEXTO", 
			"IDENTIFICADOR", "ENTERO", "DECIMAL", "COMENTARIO", "TABULACION", "SALTO_DE_LINEA", 
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
		case 57:
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
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\5\36\u00d9\n\36\3\37\3\37\5\37\u00dd\n\37\3\37\3"+
		"\37\3 \5 \u00e2\n \3!\6!\u00e5\n!\r!\16!\u00e6\3\"\3\"\3\"\3\"\5\"\u00ed"+
		"\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3*\5*\u0109\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\5+\u011a\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0147\n\64\3\65\3\65\3\65\7\65\u014c\n\65\f\65\16\65\u014f"+
		"\13\65\3\65\3\65\3\65\3\65\7\65\u0155\n\65\f\65\16\65\u0158\13\65\3\65"+
		"\5\65\u015b\n\65\3\66\3\66\3\66\6\66\u0160\n\66\r\66\16\66\u0161\3\66"+
		"\3\66\3\66\3\66\7\66\u0168\n\66\f\66\16\66\u016b\13\66\3\67\5\67\u016e"+
		"\n\67\3\67\6\67\u0171\n\67\r\67\16\67\u0172\38\58\u0176\n8\38\78\u0179"+
		"\n8\f8\168\u017c\138\38\38\68\u0180\n8\r8\168\u0181\39\39\39\39\79\u0188"+
		"\n9\f9\169\u018b\139\39\39\39\39\39\3:\6:\u0193\n:\r:\16:\u0194\3;\3;"+
		"\3;\5;\u019a\n;\3;\3;\5;\u019e\n;\3;\5;\u01a1\n;\5;\u01a3\n;\3;\3;\3<"+
		"\3<\3<\3<\5\u014d\u0156\u0189\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\2;\2=\2?\2A\2C\2E\36G\37I K!M\"O#Q$S%U&W\'Y"+
		"([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67\3\2\n\3\2\62;\n\2c|\u00e3"+
		"\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc\u00fe"+
		"\u00fe\4\2GGgg\4\2--//\t\2C\\\u00c3\u00c3\u00cb\u00cb\u00d3\u00d3\u00d5"+
		"\u00d5\u00dc\u00dc\u00de\u00de\4\2\13\13\"\"\4\2>>@@\3\2\13\13\2\u01ca"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2"+
		"\2\5{\3\2\2\2\7}\3\2\2\2\t\u0086\3\2\2\2\13\u0088\3\2\2\2\r\u008a\3\2"+
		"\2\2\17\u008d\3\2\2\2\21\u0090\3\2\2\2\23\u0093\3\2\2\2\25\u0096\3\2\2"+
		"\2\27\u009c\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3\2\2\2"+
		"\37\u00aa\3\2\2\2!\u00ad\3\2\2\2#\u00b0\3\2\2\2%\u00b3\3\2\2\2\'\u00b6"+
		"\3\2\2\2)\u00b9\3\2\2\2+\u00bc\3\2\2\2-\u00bf\3\2\2\2/\u00c2\3\2\2\2\61"+
		"\u00c5\3\2\2\2\63\u00c9\3\2\2\2\65\u00cd\3\2\2\2\67\u00d1\3\2\2\29\u00d5"+
		"\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2?\u00e1\3\2\2\2A\u00e4\3\2\2\2C"+
		"\u00ec\3\2\2\2E\u00ee\3\2\2\2G\u00f1\3\2\2\2I\u00f4\3\2\2\2K\u00f9\3\2"+
		"\2\2M\u00fe\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0108\3\2\2\2U\u0119"+
		"\3\2\2\2W\u011b\3\2\2\2Y\u011d\3\2\2\2[\u011f\3\2\2\2]\u0121\3\2\2\2_"+
		"\u0123\3\2\2\2a\u0125\3\2\2\2c\u0127\3\2\2\2e\u0129\3\2\2\2g\u0146\3\2"+
		"\2\2i\u015a\3\2\2\2k\u015f\3\2\2\2m\u016d\3\2\2\2o\u0175\3\2\2\2q\u0183"+
		"\3\2\2\2s\u0192\3\2\2\2u\u01a2\3\2\2\2w\u01a6\3\2\2\2yz\7=\2\2z\4\3\2"+
		"\2\2{|\7<\2\2|\6\3\2\2\2}~\7o\2\2~\177\7k\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7p\2\2\u0081\u0082\7v\2\2\u0082\u0083\7t\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7u\2\2\u0085\b\3\2\2\2\u0086\u0087\7>\2\2\u0087\n\3\2\2\2\u0088"+
		"\u0089\7@\2\2\u0089\f\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c\7?\2\2\u008c"+
		"\16\3\2\2\2\u008d\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f\20\3\2\2\2\u0090"+
		"\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092\22\3\2\2\2\u0093\u0094\7#\2\2\u0094"+
		"\u0095\7?\2\2\u0095\24\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\u009b\7c\2\2\u009b\26\3\2\2\2\u009c"+
		"\u009d\7]\2\2\u009d\30\3\2\2\2\u009e\u009f\7.\2\2\u009f\32\3\2\2\2\u00a0"+
		"\u00a1\7_\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7i\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2"+
		"\u00a8\u00a9\7c\2\2\u00a9\36\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\7"+
		"?\2\2\u00ac \3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7?\2\2\u00af\"\3\2"+
		"\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\7?\2\2\u00b2$\3\2\2\2\u00b3\u00b4"+
		"\7B\2\2\u00b4\u00b5\7?\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bb\7?\2\2\u00bb*\3"+
		"\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be\7?\2\2\u00be,\3\2\2\2\u00bf\u00c0"+
		"\7~\2\2\u00c0\u00c1\7?\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7`\2\2\u00c3\u00c4"+
		"\7?\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb\7@\2\2\u00cb\u00cc"+
		"\7?\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0"+
		"\7?\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2\2\u00d3"+
		"\u00d4\7?\2\2\u00d48\3\2\2\2\u00d5\u00d6\t\2\2\2\u00d6:\3\2\2\2\u00d7"+
		"\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9<\3\2\2\2\u00da\u00dc\t\4\2\2"+
		"\u00db\u00dd\t\5\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\59\35\2\u00df>\3\2\2\2\u00e0\u00e2\t\6\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2@\3\2\2\2\u00e3\u00e5\t\7\2\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7B\3"+
		"\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ed\7$\2\2\u00ea\u00eb\7^\2\2\u00eb"+
		"\u00ed\7^\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00edD\3\2\2\2\u00ee"+
		"\u00ef\7u\2\2\u00ef\u00f0\7k\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7\"\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7\u00f8\7k\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa"+
		"\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7q\2\2\u00fdL\3\2\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7q\2\2\u0100N\3\2\2\2\u0101\u0102\7q\2\2\u0102"+
		"P\3\2\2\2\u0103\u0104\7{\2\2\u0104R\3\2\2\2\u0105\u0106\7?\2\2\u0106\u0109"+
		"\7?\2\2\u0107\u0109\5G$\2\u0108\u0105\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"T\3\2\2\2\u010a\u011a\t\b\2\2\u010b\u010c\7@\2\2\u010c\u011a\7?\2\2\u010d"+
		"\u010e\7>\2\2\u010e\u011a\7?\2\2\u010f\u0110\7#\2\2\u0110\u011a\7?\2\2"+
		"\u0111\u011a\5M\'\2\u0112\u011a\5O(\2\u0113\u011a\5Q)\2\u0114\u011a\5"+
		"S*\2\u0115\u0116\5M\'\2\u0116\u0117\7g\2\2\u0117\u0118\7u\2\2\u0118\u011a"+
		"\3\2\2\2\u0119\u010a\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u010d\3\2\2\2\u0119"+
		"\u010f\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113\3\2"+
		"\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u011aV\3\2\2\2\u011b\u011c"+
		"\7*\2\2\u011cX\3\2\2\2\u011d\u011e\7+\2\2\u011eZ\3\2\2\2\u011f\u0120\7"+
		"-\2\2\u0120\\\3\2\2\2\u0121\u0122\7/\2\2\u0122^\3\2\2\2\u0123\u0124\7"+
		",\2\2\u0124`\3\2\2\2\u0125\u0126\7\61\2\2\u0126b\3\2\2\2\u0127\u0128\7"+
		"?\2\2\u0128d\3\2\2\2\u0129\u012a\7`\2\2\u012af\3\2\2\2\u012b\u012c\7g"+
		"\2\2\u012c\u012d\7p\2\2\u012d\u012e\7v\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7t\2\2\u0130\u0147\7q\2\2\u0131\u0132\7v\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7z\2\2\u0134\u0135\7v\2\2\u0135\u0147\7q\2\2\u0136\u0137\7f\2\2"+
		"\u0137\u0138\7g\2\2\u0138\u0139\7e\2\2\u0139\u013a\7k\2\2\u013a\u013b"+
		"\7o\2\2\u013b\u013c\7c\2\2\u013c\u0147\7n\2\2\u013d\u013e\7n\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7u\2\2\u0140\u0141\7v\2\2\u0141\u0147\7c\2\2"+
		"\u0142\u0143\7p\2\2\u0143\u0144\7c\2\2\u0144\u0145\7f\2\2\u0145\u0147"+
		"\7c\2\2\u0146\u012b\3\2\2\2\u0146\u0131\3\2\2\2\u0146\u0136\3\2\2\2\u0146"+
		"\u013d\3\2\2\2\u0146\u0142\3\2\2\2\u0147h\3\2\2\2\u0148\u014d\7)\2\2\u0149"+
		"\u014c\5C\"\2\u014a\u014c\13\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u015b\7)\2\2\u0151\u0156\7$\2"+
		"\2\u0152\u0155\5C\"\2\u0153\u0155\13\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\7$\2\2\u015a\u0148\3\2"+
		"\2\2\u015a\u0151\3\2\2\2\u015bj\3\2\2\2\u015c\u0160\5;\36\2\u015d\u0160"+
		"\5? \2\u015e\u0160\7a\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0169\3\2\2\2\u0163\u0168\5;\36\2\u0164\u0168\5? \2\u0165\u0168"+
		"\59\35\2\u0166\u0168\7a\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016al\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e"+
		"\7/\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u0171\59\35\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173n\3\2\2\2\u0174\u0176\7/\2\2\u0175\u0174"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017a\3\2\2\2\u0177\u0179\59\35\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\7\60\2\2\u017e"+
		"\u0180\59\35\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182p\3\2\2\2\u0183\u0184\7\61\2\2\u0184\u0185"+
		"\7,\2\2\u0185\u0189\3\2\2\2\u0186\u0188\13\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7,\2\2\u018d\u018e\7\61\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\b9\2\2\u0190r\3\2\2\2\u0191\u0193\t\t\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195t\3\2\2\2\u0196\u0197\6;\2\2\u0197\u01a3\5A!\2\u0198\u019a\7"+
		"\17\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019e\7\f\2\2\u019c\u019e\4\16\17\2\u019d\u0199\3\2\2\2\u019d\u019c\3"+
		"\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5A!\2\u01a0\u019f\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u0196\3\2\2\2\u01a2\u019d\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b;\3\2\u01a5v\3\2\2\2\u01a6\u01a7"+
		"\5A!\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\b<\4\2\u01a9x\3\2\2\2\37\2\u00d8"+
		"\u00dc\u00e1\u00e6\u00ec\u0108\u0119\u0146\u014b\u014d\u0154\u0156\u015a"+
		"\u015f\u0161\u0167\u0169\u016d\u0172\u0175\u017a\u0181\u0189\u0194\u0199"+
		"\u019d\u01a0\u01a2\5\2\3\2\3;\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}