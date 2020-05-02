// Generated from .\BB.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, SI=29, ES=30, O_SI=31, SINO=32, 
		NO=33, O=34, Y=35, ES_IGUAL=36, OP_LOGICO=37, PARENTESISapertura=38, PARENTESIScierre=39, 
		SUMA=40, RESTA=41, ASTERISRCO=42, DIVISION=43, ASIGNACION=44, POTENCIA=45, 
		TIPO=46, TEXTO=47, IDENTIFICADOR=48, ENTERO=49, DECIMAL=50, COMENTARIO=51, 
		TABULACION=52, SALTO_DE_LINEA=53, IGNORA_=54, INDENT=55, DEDENT=56;
	public static final int
		RULE_bb = 0, RULE_enunciado = 1, RULE_enunciado_simple = 2, RULE_enunciado_pequegno = 3, 
		RULE_enunciado_complejo = 4, RULE_enunciado_de_eleccion = 5, RULE_caso_si = 6, 
		RULE_caso_o_si = 7, RULE_caso_sino = 8, RULE_enunciado_mientras = 9, RULE_caso_mientras = 10, 
		RULE_enunciado_de_flujo = 11, RULE_bloque = 12, RULE_prueba = 13, RULE_prueba_o = 14, 
		RULE_prueba_y = 15, RULE_prueba_no = 16, RULE_comparacion = 17, RULE_pareja_de_comparacion = 18, 
		RULE_operador_de_comporacion = 19, RULE_declaracion_de_funcion = 20, RULE_declaracion_de_variable = 21, 
		RULE_declaracion_de_lista = 22, RULE_parametros = 23, RULE_parametro = 24, 
		RULE_retorno = 25, RULE_asignar_a_variable = 26, RULE_asignacion_con_operacion = 27, 
		RULE_operador_ternario = 28, RULE_identificador = 29, RULE_expresion = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"bb", "enunciado", "enunciado_simple", "enunciado_pequegno", "enunciado_complejo", 
			"enunciado_de_eleccion", "caso_si", "caso_o_si", "caso_sino", "enunciado_mientras", 
			"caso_mientras", "enunciado_de_flujo", "bloque", "prueba", "prueba_o", 
			"prueba_y", "prueba_no", "comparacion", "pareja_de_comparacion", "operador_de_comporacion", 
			"declaracion_de_funcion", "declaracion_de_variable", "declaracion_de_lista", 
			"parametros", "parametro", "retorno", "asignar_a_variable", "asignacion_con_operacion", 
			"operador_ternario", "identificador", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'mientras'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'def'", "'lista'", "'['", "','", "']'", "'regresa'", "'+='", 
			"'-='", "'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='", "'**='", "'//='", "'si'", "'es'", "'o si'", "'sino'", "'no'", 
			"'o'", "'y'", null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "SI", "ES", "O_SI", "SINO", "NO", "O", 
			"Y", "ES_IGUAL", "OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", 
			"SUMA", "RESTA", "ASTERISRCO", "DIVISION", "ASIGNACION", "POTENCIA", 
			"TIPO", "TEXTO", "IDENTIFICADOR", "ENTERO", "DECIMAL", "COMENTARIO", 
			"TABULACION", "SALTO_DE_LINEA", "IGNORA_", "INDENT", "DEDENT"
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

	@Override
	public String getGrammarFileName() { return "BB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BbContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BBParser.EOF, 0); }
		public List<TerminalNode> SALTO_DE_LINEA() { return getTokens(BBParser.SALTO_DE_LINEA); }
		public TerminalNode SALTO_DE_LINEA(int i) {
			return getToken(BBParser.SALTO_DE_LINEA, i);
		}
		public List<EnunciadoContext> enunciado() {
			return getRuleContexts(EnunciadoContext.class);
		}
		public EnunciadoContext enunciado(int i) {
			return getRuleContext(EnunciadoContext.class,i);
		}
		public BbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterBb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitBb(this);
		}
	}

	public final BbContext bb() throws RecognitionException {
		BbContext _localctx = new BbContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << SI) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << DECIMAL) | (1L << SALTO_DE_LINEA))) != 0)) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SALTO_DE_LINEA:
					{
					setState(62);
					match(SALTO_DE_LINEA);
					}
					break;
				case T__2:
				case T__10:
				case T__14:
				case SI:
				case PARENTESISapertura:
				case RESTA:
				case TIPO:
				case TEXTO:
				case IDENTIFICADOR:
				case ENTERO:
				case DECIMAL:
					{
					setState(63);
					enunciado();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnunciadoContext extends ParserRuleContext {
		public Enunciado_complejoContext enunciado_complejo() {
			return getRuleContext(Enunciado_complejoContext.class,0);
		}
		public Enunciado_simpleContext enunciado_simple() {
			return getRuleContext(Enunciado_simpleContext.class,0);
		}
		public EnunciadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado(this);
		}
	}

	public final EnunciadoContext enunciado() throws RecognitionException {
		EnunciadoContext _localctx = new EnunciadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enunciado);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				enunciado_complejo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				enunciado_simple();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enunciado_simpleContext extends ParserRuleContext {
		public List<Enunciado_pequegnoContext> enunciado_pequegno() {
			return getRuleContexts(Enunciado_pequegnoContext.class);
		}
		public Enunciado_pequegnoContext enunciado_pequegno(int i) {
			return getRuleContext(Enunciado_pequegnoContext.class,i);
		}
		public TerminalNode SALTO_DE_LINEA() { return getToken(BBParser.SALTO_DE_LINEA, 0); }
		public Enunciado_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_simple(this);
		}
	}

	public final Enunciado_simpleContext enunciado_simple() throws RecognitionException {
		Enunciado_simpleContext _localctx = new Enunciado_simpleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enunciado_simple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			enunciado_pequegno();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(T__0);
					setState(77);
					enunciado_pequegno();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(83);
				match(T__0);
				}
			}

			setState(86);
			match(SALTO_DE_LINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enunciado_pequegnoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Enunciado_de_flujoContext enunciado_de_flujo() {
			return getRuleContext(Enunciado_de_flujoContext.class,0);
		}
		public Asignar_a_variableContext asignar_a_variable() {
			return getRuleContext(Asignar_a_variableContext.class,0);
		}
		public Asignacion_con_operacionContext asignacion_con_operacion() {
			return getRuleContext(Asignacion_con_operacionContext.class,0);
		}
		public Declaracion_de_variableContext declaracion_de_variable() {
			return getRuleContext(Declaracion_de_variableContext.class,0);
		}
		public Declaracion_de_listaContext declaracion_de_lista() {
			return getRuleContext(Declaracion_de_listaContext.class,0);
		}
		public Enunciado_pequegnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_pequegno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_pequegno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_pequegno(this);
		}
	}

	public final Enunciado_pequegnoContext enunciado_pequegno() throws RecognitionException {
		Enunciado_pequegnoContext _localctx = new Enunciado_pequegnoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enunciado_pequegno);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				expresion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				enunciado_de_flujo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				asignar_a_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				asignacion_con_operacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				declaracion_de_variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				declaracion_de_lista();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enunciado_complejoContext extends ParserRuleContext {
		public Enunciado_de_eleccionContext enunciado_de_eleccion() {
			return getRuleContext(Enunciado_de_eleccionContext.class,0);
		}
		public Enunciado_mientrasContext enunciado_mientras() {
			return getRuleContext(Enunciado_mientrasContext.class,0);
		}
		public Declaracion_de_funcionContext declaracion_de_funcion() {
			return getRuleContext(Declaracion_de_funcionContext.class,0);
		}
		public Enunciado_complejoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_complejo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_complejo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_complejo(this);
		}
	}

	public final Enunciado_complejoContext enunciado_complejo() throws RecognitionException {
		Enunciado_complejoContext _localctx = new Enunciado_complejoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enunciado_complejo);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				enunciado_de_eleccion();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				enunciado_mientras();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				declaracion_de_funcion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enunciado_de_eleccionContext extends ParserRuleContext {
		public Caso_siContext caso_si() {
			return getRuleContext(Caso_siContext.class,0);
		}
		public List<Caso_o_siContext> caso_o_si() {
			return getRuleContexts(Caso_o_siContext.class);
		}
		public Caso_o_siContext caso_o_si(int i) {
			return getRuleContext(Caso_o_siContext.class,i);
		}
		public Caso_sinoContext caso_sino() {
			return getRuleContext(Caso_sinoContext.class,0);
		}
		public Enunciado_de_eleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_de_eleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_de_eleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_de_eleccion(this);
		}
	}

	public final Enunciado_de_eleccionContext enunciado_de_eleccion() throws RecognitionException {
		Enunciado_de_eleccionContext _localctx = new Enunciado_de_eleccionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enunciado_de_eleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			caso_si();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O_SI) {
				{
				{
				setState(102);
				caso_o_si();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(108);
				caso_sino();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Caso_siContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(BBParser.SI, 0); }
		public PruebaContext prueba() {
			return getRuleContext(PruebaContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Caso_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterCaso_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitCaso_si(this);
		}
	}

	public final Caso_siContext caso_si() throws RecognitionException {
		Caso_siContext _localctx = new Caso_siContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caso_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SI);
			setState(112);
			prueba();
			setState(113);
			match(T__1);
			setState(114);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Caso_o_siContext extends ParserRuleContext {
		public TerminalNode O_SI() { return getToken(BBParser.O_SI, 0); }
		public PruebaContext prueba() {
			return getRuleContext(PruebaContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Caso_o_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_o_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterCaso_o_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitCaso_o_si(this);
		}
	}

	public final Caso_o_siContext caso_o_si() throws RecognitionException {
		Caso_o_siContext _localctx = new Caso_o_siContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_caso_o_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(O_SI);
			setState(117);
			prueba();
			setState(118);
			match(T__1);
			setState(119);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Caso_sinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(BBParser.SINO, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Caso_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterCaso_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitCaso_sino(this);
		}
	}

	public final Caso_sinoContext caso_sino() throws RecognitionException {
		Caso_sinoContext _localctx = new Caso_sinoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caso_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SINO);
			setState(122);
			match(T__1);
			setState(123);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enunciado_mientrasContext extends ParserRuleContext {
		public Caso_mientrasContext caso_mientras() {
			return getRuleContext(Caso_mientrasContext.class,0);
		}
		public Caso_sinoContext caso_sino() {
			return getRuleContext(Caso_sinoContext.class,0);
		}
		public Enunciado_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_mientras(this);
		}
	}

	public final Enunciado_mientrasContext enunciado_mientras() throws RecognitionException {
		Enunciado_mientrasContext _localctx = new Enunciado_mientrasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enunciado_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			caso_mientras();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(126);
				caso_sino();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Caso_mientrasContext extends ParserRuleContext {
		public PruebaContext prueba() {
			return getRuleContext(PruebaContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Caso_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterCaso_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitCaso_mientras(this);
		}
	}

	public final Caso_mientrasContext caso_mientras() throws RecognitionException {
		Caso_mientrasContext _localctx = new Caso_mientrasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caso_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__2);
			setState(130);
			prueba();
			setState(131);
			match(T__1);
			setState(132);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enunciado_de_flujoContext extends ParserRuleContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public Enunciado_de_flujoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_de_flujo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_de_flujo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_de_flujo(this);
		}
	}

	public final Enunciado_de_flujoContext enunciado_de_flujo() throws RecognitionException {
		Enunciado_de_flujoContext _localctx = new Enunciado_de_flujoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enunciado_de_flujo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			retorno();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	 
		public BloqueContext() { }
		public void copyFrom(BloqueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Etiqueta_bloque_complejoContext extends BloqueContext {
		public TerminalNode SALTO_DE_LINEA() { return getToken(BBParser.SALTO_DE_LINEA, 0); }
		public TerminalNode INDENT() { return getToken(BBParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(BBParser.DEDENT, 0); }
		public List<EnunciadoContext> enunciado() {
			return getRuleContexts(EnunciadoContext.class);
		}
		public EnunciadoContext enunciado(int i) {
			return getRuleContext(EnunciadoContext.class,i);
		}
		public Etiqueta_bloque_complejoContext(BloqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_bloque_complejo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_bloque_complejo(this);
		}
	}
	public static class Etiqueta_bloque_simpleContext extends BloqueContext {
		public Enunciado_simpleContext enunciado_simple() {
			return getRuleContext(Enunciado_simpleContext.class,0);
		}
		public Etiqueta_bloque_simpleContext(BloqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_bloque_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_bloque_simple(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloque);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__14:
			case PARENTESISapertura:
			case RESTA:
			case TIPO:
			case TEXTO:
			case IDENTIFICADOR:
			case ENTERO:
			case DECIMAL:
				_localctx = new Etiqueta_bloque_simpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				enunciado_simple();
				}
				break;
			case SALTO_DE_LINEA:
				_localctx = new Etiqueta_bloque_complejoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(SALTO_DE_LINEA);
				setState(138);
				match(INDENT);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					enunciado();
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__10) | (1L << T__14) | (1L << SI) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << DECIMAL))) != 0) );
				setState(144);
				match(DEDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PruebaContext extends ParserRuleContext {
		public Prueba_oContext prueba_ternaria;
		public PruebaContext respuesta_ternaria;
		public List<Prueba_oContext> prueba_o() {
			return getRuleContexts(Prueba_oContext.class);
		}
		public Prueba_oContext prueba_o(int i) {
			return getRuleContext(Prueba_oContext.class,i);
		}
		public TerminalNode SI() { return getToken(BBParser.SI, 0); }
		public TerminalNode SINO() { return getToken(BBParser.SINO, 0); }
		public PruebaContext prueba() {
			return getRuleContext(PruebaContext.class,0);
		}
		public PruebaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prueba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterPrueba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitPrueba(this);
		}
	}

	public final PruebaContext prueba() throws RecognitionException {
		PruebaContext _localctx = new PruebaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prueba);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			prueba_o();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI) {
				{
				setState(149);
				match(SI);
				setState(150);
				((PruebaContext)_localctx).prueba_ternaria = prueba_o();
				setState(151);
				match(SINO);
				setState(152);
				((PruebaContext)_localctx).respuesta_ternaria = prueba();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prueba_oContext extends ParserRuleContext {
		public List<Prueba_yContext> prueba_y() {
			return getRuleContexts(Prueba_yContext.class);
		}
		public Prueba_yContext prueba_y(int i) {
			return getRuleContext(Prueba_yContext.class,i);
		}
		public List<TerminalNode> O() { return getTokens(BBParser.O); }
		public TerminalNode O(int i) {
			return getToken(BBParser.O, i);
		}
		public Prueba_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prueba_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterPrueba_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitPrueba_o(this);
		}
	}

	public final Prueba_oContext prueba_o() throws RecognitionException {
		Prueba_oContext _localctx = new Prueba_oContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prueba_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			prueba_y();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O) {
				{
				{
				setState(157);
				match(O);
				setState(158);
				prueba_y();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prueba_yContext extends ParserRuleContext {
		public List<Prueba_noContext> prueba_no() {
			return getRuleContexts(Prueba_noContext.class);
		}
		public Prueba_noContext prueba_no(int i) {
			return getRuleContext(Prueba_noContext.class,i);
		}
		public List<TerminalNode> Y() { return getTokens(BBParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(BBParser.Y, i);
		}
		public Prueba_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prueba_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterPrueba_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitPrueba_y(this);
		}
	}

	public final Prueba_yContext prueba_y() throws RecognitionException {
		Prueba_yContext _localctx = new Prueba_yContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_prueba_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			prueba_no();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(165);
				match(Y);
				setState(166);
				prueba_no();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prueba_noContext extends ParserRuleContext {
		public Prueba_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prueba_no; }
	 
		public Prueba_noContext() { }
		public void copyFrom(Prueba_noContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Etiqueta_prueba_noContext extends Prueba_noContext {
		public TerminalNode NO() { return getToken(BBParser.NO, 0); }
		public Prueba_noContext prueba_no() {
			return getRuleContext(Prueba_noContext.class,0);
		}
		public Etiqueta_prueba_noContext(Prueba_noContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_prueba_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_prueba_no(this);
		}
	}
	public static class Etiqueta_prueba_no_comparacionContext extends Prueba_noContext {
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Etiqueta_prueba_no_comparacionContext(Prueba_noContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_prueba_no_comparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_prueba_no_comparacion(this);
		}
	}

	public final Prueba_noContext prueba_no() throws RecognitionException {
		Prueba_noContext _localctx = new Prueba_noContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_prueba_no);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				_localctx = new Etiqueta_prueba_noContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(NO);
				setState(173);
				prueba_no();
				}
				break;
			case PARENTESISapertura:
			case RESTA:
			case TEXTO:
			case IDENTIFICADOR:
			case ENTERO:
			case DECIMAL:
				_localctx = new Etiqueta_prueba_no_comparacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				comparacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<Pareja_de_comparacionContext> pareja_de_comparacion() {
			return getRuleContexts(Pareja_de_comparacionContext.class);
		}
		public Pareja_de_comparacionContext pareja_de_comparacion(int i) {
			return getRuleContext(Pareja_de_comparacionContext.class,i);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expresion(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(178);
				pareja_de_comparacion();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pareja_de_comparacionContext extends ParserRuleContext {
		public Operador_de_comporacionContext operador_de_comporacion() {
			return getRuleContext(Operador_de_comporacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Pareja_de_comparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pareja_de_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterPareja_de_comparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitPareja_de_comparacion(this);
		}
	}

	public final Pareja_de_comparacionContext pareja_de_comparacion() throws RecognitionException {
		Pareja_de_comparacionContext _localctx = new Pareja_de_comparacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pareja_de_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			operador_de_comporacion();
			setState(185);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_de_comporacionContext extends ParserRuleContext {
		public Operador_de_comporacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_de_comporacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterOperador_de_comporacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitOperador_de_comporacion(this);
		}
	}

	public final Operador_de_comporacionContext operador_de_comporacion() throws RecognitionException {
		Operador_de_comporacionContext _localctx = new Operador_de_comporacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operador_de_comporacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_de_funcionContext extends ParserRuleContext {
		public Token tipo;
		public IdentificadorContext id;
		public TerminalNode PARENTESISapertura() { return getToken(BBParser.PARENTESISapertura, 0); }
		public TerminalNode PARENTESIScierre() { return getToken(BBParser.PARENTESIScierre, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(BBParser.TIPO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Declaracion_de_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterDeclaracion_de_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitDeclaracion_de_funcion(this);
		}
	}

	public final Declaracion_de_funcionContext declaracion_de_funcion() throws RecognitionException {
		Declaracion_de_funcionContext _localctx = new Declaracion_de_funcionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracion_de_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((Declaracion_de_funcionContext)_localctx).tipo = match(TIPO);
			setState(190);
			match(T__9);
			setState(191);
			((Declaracion_de_funcionContext)_localctx).id = identificador();
			setState(192);
			match(PARENTESISapertura);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << DECIMAL))) != 0)) {
				{
				setState(193);
				parametros();
				}
			}

			setState(196);
			match(PARENTESIScierre);
			setState(197);
			match(T__1);
			setState(198);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_de_variableContext extends ParserRuleContext {
		public Declaracion_de_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_variable; }
	 
		public Declaracion_de_variableContext() { }
		public void copyFrom(Declaracion_de_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaracion_de_variable_con_asignacionContext extends Declaracion_de_variableContext {
		public Token tipo;
		public Asignar_a_variableContext asignar_a_variable() {
			return getRuleContext(Asignar_a_variableContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(BBParser.TIPO, 0); }
		public Declaracion_de_variable_con_asignacionContext(Declaracion_de_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterDeclaracion_de_variable_con_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitDeclaracion_de_variable_con_asignacion(this);
		}
	}
	public static class Declaracion_de_variable_sin_asignacionContext extends Declaracion_de_variableContext {
		public Token tipo;
		public IdentificadorContext id;
		public TerminalNode TIPO() { return getToken(BBParser.TIPO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Declaracion_de_variable_sin_asignacionContext(Declaracion_de_variableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterDeclaracion_de_variable_sin_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitDeclaracion_de_variable_sin_asignacion(this);
		}
	}

	public final Declaracion_de_variableContext declaracion_de_variable() throws RecognitionException {
		Declaracion_de_variableContext _localctx = new Declaracion_de_variableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaracion_de_variable);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Declaracion_de_variable_con_asignacionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((Declaracion_de_variable_con_asignacionContext)_localctx).tipo = match(TIPO);
				setState(201);
				asignar_a_variable();
				}
				break;
			case 2:
				_localctx = new Declaracion_de_variable_sin_asignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((Declaracion_de_variable_sin_asignacionContext)_localctx).tipo = match(TIPO);
				setState(203);
				((Declaracion_de_variable_sin_asignacionContext)_localctx).id = identificador();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracion_de_listaContext extends ParserRuleContext {
		public Token tipo;
		public IdentificadorContext id;
		public TerminalNode TIPO() { return getToken(BBParser.TIPO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(BBParser.ASIGNACION, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Declaracion_de_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_de_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterDeclaracion_de_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitDeclaracion_de_lista(this);
		}
	}

	public final Declaracion_de_listaContext declaracion_de_lista() throws RecognitionException {
		Declaracion_de_listaContext _localctx = new Declaracion_de_listaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracion_de_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__10);
			setState(207);
			match(T__3);
			setState(208);
			((Declaracion_de_listaContext)_localctx).tipo = match(TIPO);
			setState(209);
			match(T__4);
			setState(210);
			((Declaracion_de_listaContext)_localctx).id = identificador();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNACION) {
				{
				setState(211);
				match(ASIGNACION);
				setState(212);
				match(T__11);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << TEXTO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << DECIMAL))) != 0)) {
					{
					setState(213);
					expresion(0);
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(214);
						match(T__12);
						setState(215);
						expresion(0);
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(223);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametros);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			parametro();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					match(T__12);
					setState(228);
					parametro();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(234);
				match(T__12);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	 
		public ParametroContext() { }
		public void copyFrom(ParametroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Parametro_llamadaContext extends ParametroContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Parametro_llamadaContext(ParametroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterParametro_llamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitParametro_llamada(this);
		}
	}
	public static class Parametro_funcionContext extends ParametroContext {
		public Declaracion_de_variableContext declaracion_de_variable() {
			return getRuleContext(Declaracion_de_variableContext.class,0);
		}
		public Parametro_funcionContext(ParametroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterParametro_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitParametro_funcion(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parametro);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				_localctx = new Parametro_funcionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				declaracion_de_variable();
				}
				break;
			case PARENTESISapertura:
			case RESTA:
			case TEXTO:
			case IDENTIFICADOR:
			case ENTERO:
			case DECIMAL:
				_localctx = new Parametro_llamadaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				expresion(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__14);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << TEXTO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << DECIMAL))) != 0)) {
				{
				setState(242);
				expresion(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asignar_a_variableContext extends ParserRuleContext {
		public IdentificadorContext id;
		public TerminalNode ASIGNACION() { return getToken(BBParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Asignar_a_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignar_a_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterAsignar_a_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitAsignar_a_variable(this);
		}
	}

	public final Asignar_a_variableContext asignar_a_variable() throws RecognitionException {
		Asignar_a_variableContext _localctx = new Asignar_a_variableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_asignar_a_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((Asignar_a_variableContext)_localctx).id = identificador();
			setState(246);
			match(ASIGNACION);
			setState(247);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asignacion_con_operacionContext extends ParserRuleContext {
		public IdentificadorContext id;
		public Token op;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Asignacion_con_operacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_con_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterAsignacion_con_operacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitAsignacion_con_operacion(this);
		}
	}

	public final Asignacion_con_operacionContext asignacion_con_operacion() throws RecognitionException {
		Asignacion_con_operacionContext _localctx = new Asignacion_con_operacionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_asignacion_con_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((Asignacion_con_operacionContext)_localctx).id = identificador();
			setState(250);
			((Asignacion_con_operacionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				((Asignacion_con_operacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(251);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_ternarioContext extends ParserRuleContext {
		public ExpresionContext prueba_ternaria;
		public ExpresionContext respuesta_ternaria;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SI() { return getToken(BBParser.SI, 0); }
		public TerminalNode SINO() { return getToken(BBParser.SINO, 0); }
		public Operador_ternarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_ternario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterOperador_ternario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitOperador_ternario(this);
		}
	}

	public final Operador_ternarioContext operador_ternario() throws RecognitionException {
		Operador_ternarioContext _localctx = new Operador_ternarioContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_operador_ternario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expresion(0);
			setState(254);
			match(SI);
			setState(255);
			((Operador_ternarioContext)_localctx).prueba_ternaria = expresion(0);
			setState(256);
			match(SINO);
			setState(257);
			((Operador_ternarioContext)_localctx).respuesta_ternaria = expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(BBParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Etiqueta_multiplicacion_divisionContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public Token operador;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(BBParser.DIVISION, 0); }
		public TerminalNode ASTERISRCO() { return getToken(BBParser.ASTERISRCO, 0); }
		public Etiqueta_multiplicacion_divisionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_multiplicacion_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_multiplicacion_division(this);
		}
	}
	public static class Etiqueta_valor_textoContext extends ExpresionContext {
		public TerminalNode TEXTO() { return getToken(BBParser.TEXTO, 0); }
		public Etiqueta_valor_textoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_valor_texto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_valor_texto(this);
		}
	}
	public static class Etiqueta_suma__restaContext extends ExpresionContext {
		public ExpresionContext izquierda;
		public Token operador;
		public ExpresionContext derecha;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(BBParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(BBParser.RESTA, 0); }
		public Etiqueta_suma__restaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_suma__resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_suma__resta(this);
		}
	}
	public static class Etiqueta_parentesisContext extends ExpresionContext {
		public TerminalNode PARENTESISapertura() { return getToken(BBParser.PARENTESISapertura, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIScierre() { return getToken(BBParser.PARENTESIScierre, 0); }
		public Etiqueta_parentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_parentesis(this);
		}
	}
	public static class Etiqueta_identificadorContext extends ExpresionContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Etiqueta_identificadorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_identificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_identificador(this);
		}
	}
	public static class Etiqueta_complemento_negativoContext extends ExpresionContext {
		public TerminalNode RESTA() { return getToken(BBParser.RESTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Etiqueta_complemento_negativoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_complemento_negativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_complemento_negativo(this);
		}
	}
	public static class Etiqueta_de_llamada_a_funcionContext extends ExpresionContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PARENTESISapertura() { return getToken(BBParser.PARENTESISapertura, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESIScierre() { return getToken(BBParser.PARENTESIScierre, 0); }
		public Etiqueta_de_llamada_a_funcionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_de_llamada_a_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_de_llamada_a_funcion(this);
		}
	}
	public static class Etiqueta_valor_atomicoContext extends ExpresionContext {
		public TerminalNode ENTERO() { return getToken(BBParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(BBParser.DECIMAL, 0); }
		public Etiqueta_valor_atomicoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_valor_atomico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_valor_atomico(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new Etiqueta_de_llamada_a_funcionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(262);
				identificador();
				setState(263);
				match(PARENTESISapertura);
				setState(264);
				parametros();
				setState(265);
				match(PARENTESIScierre);
				}
				break;
			case 2:
				{
				_localctx = new Etiqueta_parentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(PARENTESISapertura);
				setState(268);
				expresion(0);
				setState(269);
				match(PARENTESIScierre);
				}
				break;
			case 3:
				{
				_localctx = new Etiqueta_complemento_negativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(RESTA);
				setState(272);
				expresion(5);
				}
				break;
			case 4:
				{
				_localctx = new Etiqueta_identificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				identificador();
				}
				break;
			case 5:
				{
				_localctx = new Etiqueta_valor_textoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(TEXTO);
				}
				break;
			case 6:
				{
				_localctx = new Etiqueta_valor_atomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(ENTERO);
				}
				break;
			case 7:
				{
				_localctx = new Etiqueta_valor_atomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(DECIMAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new Etiqueta_multiplicacion_divisionContext(new ExpresionContext(_parentctx, _parentState));
						((Etiqueta_multiplicacion_divisionContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(279);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(280);
						((Etiqueta_multiplicacion_divisionContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTERISRCO || _la==DIVISION) ) {
							((Etiqueta_multiplicacion_divisionContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((Etiqueta_multiplicacion_divisionContext)_localctx).derecha = expresion(9);
						}
						break;
					case 2:
						{
						_localctx = new Etiqueta_suma__restaContext(new ExpresionContext(_parentctx, _parentState));
						((Etiqueta_suma__restaContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(282);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(283);
						((Etiqueta_suma__restaContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
							((Etiqueta_suma__restaContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						((Etiqueta_suma__restaContext)_localctx).derecha = expresion(8);
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\7\4"+
		"Q\n\4\f\4\16\4T\13\4\3\4\5\4W\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"a\n\5\3\6\3\6\3\6\5\6f\n\6\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\7\5\7p\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5"+
		"\13\u0082\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u008f"+
		"\n\16\r\16\16\16\u0090\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u009d\n\17\3\20\3\20\3\20\7\20\u00a2\n\20\f\20\16\20\u00a5"+
		"\13\20\3\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21\3\22\3\22"+
		"\3\22\5\22\u00b2\n\22\3\23\3\23\7\23\u00b6\n\23\f\23\16\23\u00b9\13\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00c5\n\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00cf\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00db\n\30\f\30\16\30\u00de\13\30"+
		"\5\30\u00e0\n\30\3\30\5\30\u00e3\n\30\3\31\3\31\3\31\7\31\u00e8\n\31\f"+
		"\31\16\31\u00eb\13\31\3\31\5\31\u00ee\n\31\3\32\3\32\5\32\u00f2\n\32\3"+
		"\33\3\33\5\33\u00f6\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0118\n \3 \3 \3 \3 \3 \3 \7 \u0120\n \f \16 \u0123\13"+
		" \3 \2\3>!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>\2\6\3\2\6\13\3\2\22\36\3\2,-\3\2*+\2\u012c\2D\3\2\2\2\4K\3\2\2\2"+
		"\6M\3\2\2\2\b`\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16q\3\2\2\2\20v\3\2\2\2\22"+
		"{\3\2\2\2\24\177\3\2\2\2\26\u0083\3\2\2\2\30\u0088\3\2\2\2\32\u0094\3"+
		"\2\2\2\34\u0096\3\2\2\2\36\u009e\3\2\2\2 \u00a6\3\2\2\2\"\u00b1\3\2\2"+
		"\2$\u00b3\3\2\2\2&\u00ba\3\2\2\2(\u00bd\3\2\2\2*\u00bf\3\2\2\2,\u00ce"+
		"\3\2\2\2.\u00d0\3\2\2\2\60\u00e4\3\2\2\2\62\u00f1\3\2\2\2\64\u00f3\3\2"+
		"\2\2\66\u00f7\3\2\2\28\u00fb\3\2\2\2:\u00ff\3\2\2\2<\u0105\3\2\2\2>\u0117"+
		"\3\2\2\2@C\7\67\2\2AC\5\4\3\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\2\2\3H\3\3\2\2\2IL\5\n\6\2JL\5\6\4"+
		"\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MR\5\b\5\2NO\7\3\2\2OQ\5\b\5\2PN\3\2"+
		"\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UW\7\3\2\2VU\3\2"+
		"\2\2VW\3\2\2\2WX\3\2\2\2XY\7\67\2\2Y\7\3\2\2\2Za\5> \2[a\5\30\r\2\\a\5"+
		"\66\34\2]a\58\35\2^a\5,\27\2_a\5.\30\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2"+
		"`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bf\5\f\7\2cf\5\24\13\2df\5*\26"+
		"\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\13\3\2\2\2gk\5\16\b\2hj\5\20\t\2ih\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5\22\n\2on"+
		"\3\2\2\2op\3\2\2\2p\r\3\2\2\2qr\7\37\2\2rs\5\34\17\2st\7\4\2\2tu\5\32"+
		"\16\2u\17\3\2\2\2vw\7!\2\2wx\5\34\17\2xy\7\4\2\2yz\5\32\16\2z\21\3\2\2"+
		"\2{|\7\"\2\2|}\7\4\2\2}~\5\32\16\2~\23\3\2\2\2\177\u0081\5\26\f\2\u0080"+
		"\u0082\5\22\n\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\25\3\2\2"+
		"\2\u0083\u0084\7\5\2\2\u0084\u0085\5\34\17\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0087\5\32\16\2\u0087\27\3\2\2\2\u0088\u0089\5\64\33\2\u0089\31\3\2\2"+
		"\2\u008a\u0095\5\6\4\2\u008b\u008c\7\67\2\2\u008c\u008e\79\2\2\u008d\u008f"+
		"\5\4\3\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7:\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u008a\3\2\2\2\u0094\u008b\3\2\2\2\u0095\33\3\2\2\2\u0096\u009c"+
		"\5\36\20\2\u0097\u0098\7\37\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7\""+
		"\2\2\u009a\u009b\5\34\17\2\u009b\u009d\3\2\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e\u00a3\5 \21\2\u009f\u00a0\7$\2\2"+
		"\u00a0\u00a2\5 \21\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\37\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00ab\5\"\22\2\u00a7\u00a8\7%\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00a7\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"!\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b2\5\"\22\2"+
		"\u00b0\u00b2\5$\23\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2#\3"+
		"\2\2\2\u00b3\u00b7\5> \2\u00b4\u00b6\5&\24\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8%\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\5> \2\u00bc\'\3\2"+
		"\2\2\u00bd\u00be\t\2\2\2\u00be)\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\u00c2\5<\37\2\u00c2\u00c4\7(\2\2\u00c3\u00c5\5\60\31\2"+
		"\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\7)\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\5\32\16\2\u00c9+\3\2\2\2\u00ca"+
		"\u00cb\7\60\2\2\u00cb\u00cf\5\66\34\2\u00cc\u00cd\7\60\2\2\u00cd\u00cf"+
		"\5<\37\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf-\3\2\2\2\u00d0"+
		"\u00d1\7\r\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7"+
		"\7\2\2\u00d4\u00e2\5<\37\2\u00d5\u00d6\7.\2\2\u00d6\u00df\7\16\2\2\u00d7"+
		"\u00dc\5> \2\u00d8\u00d9\7\17\2\2\u00d9\u00db\5> \2\u00da\u00d8\3\2\2"+
		"\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\7\20\2\2\u00e2\u00d5\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3/\3\2\2\2\u00e4\u00e9\5\62\32\2\u00e5\u00e6\7\17\2\2\u00e6"+
		"\u00e8\5\62\32\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ee\7\17\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\61\3\2\2"+
		"\2\u00ef\u00f2\5,\27\2\u00f0\u00f2\5> \2\u00f1\u00ef\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\63\3\2\2\2\u00f3\u00f5\7\21\2\2\u00f4\u00f6\5> \2\u00f5"+
		"\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\65\3\2\2\2\u00f7\u00f8\5<\37"+
		"\2\u00f8\u00f9\7.\2\2\u00f9\u00fa\5> \2\u00fa\67\3\2\2\2\u00fb\u00fc\5"+
		"<\37\2\u00fc\u00fd\t\3\2\2\u00fd\u00fe\5> \2\u00fe9\3\2\2\2\u00ff\u0100"+
		"\5> \2\u0100\u0101\7\37\2\2\u0101\u0102\5> \2\u0102\u0103\7\"\2\2\u0103"+
		"\u0104\5> \2\u0104;\3\2\2\2\u0105\u0106\7\62\2\2\u0106=\3\2\2\2\u0107"+
		"\u0108\b \1\2\u0108\u0109\5<\37\2\u0109\u010a\7(\2\2\u010a\u010b\5\60"+
		"\31\2\u010b\u010c\7)\2\2\u010c\u0118\3\2\2\2\u010d\u010e\7(\2\2\u010e"+
		"\u010f\5> \2\u010f\u0110\7)\2\2\u0110\u0118\3\2\2\2\u0111\u0112\7+\2\2"+
		"\u0112\u0118\5> \7\u0113\u0118\5<\37\2\u0114\u0118\7\61\2\2\u0115\u0118"+
		"\7\63\2\2\u0116\u0118\7\64\2\2\u0117\u0107\3\2\2\2\u0117\u010d\3\2\2\2"+
		"\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0121\3\2\2\2\u0119\u011a\f\n\2\2\u011a"+
		"\u011b\t\4\2\2\u011b\u0120\5> \13\u011c\u011d\f\t\2\2\u011d\u011e\t\5"+
		"\2\2\u011e\u0120\5> \n\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122?\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\37BDKRV`eko\u0081\u0090\u0094\u009c\u00a3\u00ab\u00b1\u00b7"+
		"\u00c4\u00ce\u00dc\u00df\u00e2\u00e9\u00ed\u00f1\u00f5\u0117\u011f\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}