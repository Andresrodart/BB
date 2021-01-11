// Generated from BB.g4 by ANTLR 4.9.1
package BBcompiler;
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, PUBLICO=29, PRIVADO=30, PROTEGIDO=31, 
		HEREDA=32, OBJETO=33, PARA=34, HASTA=35, INCREMENTANDO=36, SI=37, ES=38, 
		O_SI=39, SINO=40, NO=41, O=42, Y=43, ES_IGUAL=44, OP_LOGICO=45, PARENTESISapertura=46, 
		PARENTESIScierre=47, SUMA=48, RESTA=49, ASTERISRCO=50, DIVISION=51, ASIGNACION=52, 
		POTENCIA=53, ENTERO=54, DECIMAL=55, VERDAD=56, FALSO=57, TIPO=58, TEXTO=59, 
		IDENTIFICADOR=60, METODO=61, COMENTARIO=62, TABULACION=63, SALTO_DE_LINEA=64, 
		IGNORA_=65, INDENT=66, DEDENT=67;
	public static final int
		RULE_bb = 0, RULE_enunciado = 1, RULE_enunciado_simple = 2, RULE_enunciado_pequegno = 3, 
		RULE_enunciado_complejo = 4, RULE_enunciado_objeto = 5, RULE_enunciado_de_eleccion = 6, 
		RULE_caso_si = 7, RULE_caso_o_si = 8, RULE_caso_sino = 9, RULE_enunciado_mientras = 10, 
		RULE_caso_mientras = 11, RULE_enunciado_para = 12, RULE_enunciado_de_flujo = 13, 
		RULE_objeto = 14, RULE_bloque = 15, RULE_prueba = 16, RULE_prueba_o = 17, 
		RULE_prueba_y = 18, RULE_prueba_no = 19, RULE_comparacion = 20, RULE_pareja_de_comparacion = 21, 
		RULE_operador_de_comporacion = 22, RULE_declaracion_de_funcion = 23, RULE_declaracion_de_variable = 24, 
		RULE_declaracion_de_lista = 25, RULE_parametros = 26, RULE_parametro = 27, 
		RULE_retorno = 28, RULE_asignar_a_variable = 29, RULE_asignacion_con_operacion = 30, 
		RULE_operador_ternario = 31, RULE_identificador = 32, RULE_funcion_recibe = 33, 
		RULE_llamada_a_metodo = 34, RULE_metodo = 35, RULE_metodo_miembro = 36, 
		RULE_expresion = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"bb", "enunciado", "enunciado_simple", "enunciado_pequegno", "enunciado_complejo", 
			"enunciado_objeto", "enunciado_de_eleccion", "caso_si", "caso_o_si", 
			"caso_sino", "enunciado_mientras", "caso_mientras", "enunciado_para", 
			"enunciado_de_flujo", "objeto", "bloque", "prueba", "prueba_o", "prueba_y", 
			"prueba_no", "comparacion", "pareja_de_comparacion", "operador_de_comporacion", 
			"declaracion_de_funcion", "declaracion_de_variable", "declaracion_de_lista", 
			"parametros", "parametro", "retorno", "asignar_a_variable", "asignacion_con_operacion", 
			"operador_ternario", "identificador", "funcion_recibe", "llamada_a_metodo", 
			"metodo", "metodo_miembro", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'mientras'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'lista'", "'['", "','", "']'", "'regresa'", "'+='", "'-='", 
			"'*='", "'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", 
			"'**='", "'//='", "'recibe'", "'p\u00FAblico'", "'privado'", "'protegido'", 
			"'hereda'", "'objeto'", "'para'", "'hasta'", "'incrementando'", "'si'", 
			"'es'", "'o si'", "'sino'", "'no'", "'o'", "'y'", null, null, "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'", "'='", "'^'", null, null, "'verdad'", 
			"'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "PUBLICO", "PRIVADO", "PROTEGIDO", "HEREDA", 
			"OBJETO", "PARA", "HASTA", "INCREMENTANDO", "SI", "ES", "O_SI", "SINO", 
			"NO", "O", "Y", "ES_IGUAL", "OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", 
			"SUMA", "RESTA", "ASTERISRCO", "DIVISION", "ASIGNACION", "POTENCIA", 
			"ENTERO", "DECIMAL", "VERDAD", "FALSO", "TIPO", "TEXTO", "IDENTIFICADOR", 
			"METODO", "COMENTARIO", "TABULACION", "SALTO_DE_LINEA", "IGNORA_", "INDENT", 
			"DEDENT"
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__13 - 3)) | (1L << (PUBLICO - 3)) | (1L << (PRIVADO - 3)) | (1L << (PROTEGIDO - 3)) | (1L << (OBJETO - 3)) | (1L << (PARA - 3)) | (1L << (SI - 3)) | (1L << (PARENTESISapertura - 3)) | (1L << (RESTA - 3)) | (1L << (ENTERO - 3)) | (1L << (DECIMAL - 3)) | (1L << (VERDAD - 3)) | (1L << (FALSO - 3)) | (1L << (TIPO - 3)) | (1L << (TEXTO - 3)) | (1L << (IDENTIFICADOR - 3)) | (1L << (SALTO_DE_LINEA - 3)))) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SALTO_DE_LINEA:
					{
					setState(76);
					match(SALTO_DE_LINEA);
					}
					break;
				case T__2:
				case T__9:
				case T__13:
				case PUBLICO:
				case PRIVADO:
				case PROTEGIDO:
				case OBJETO:
				case PARA:
				case SI:
				case PARENTESISapertura:
				case RESTA:
				case ENTERO:
				case DECIMAL:
				case VERDAD:
				case FALSO:
				case TIPO:
				case TEXTO:
				case IDENTIFICADOR:
					{
					setState(77);
					enunciado();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
		public Enunciado_simpleContext enunciado_simple() {
			return getRuleContext(Enunciado_simpleContext.class,0);
		}
		public Enunciado_complejoContext enunciado_complejo() {
			return getRuleContext(Enunciado_complejoContext.class,0);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				enunciado_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				enunciado_complejo();
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
			setState(89);
			enunciado_pequegno();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__0);
					setState(91);
					enunciado_pequegno();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(97);
				match(T__0);
				}
			}

			setState(100);
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
		public Funcion_recibeContext funcion_recibe() {
			return getRuleContext(Funcion_recibeContext.class,0);
		}
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				funcion_recibe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				expresion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				enunciado_de_flujo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				asignar_a_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				asignacion_con_operacion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				declaracion_de_variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
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
		public Enunciado_objetoContext enunciado_objeto() {
			return getRuleContext(Enunciado_objetoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public Enunciado_de_eleccionContext enunciado_de_eleccion() {
			return getRuleContext(Enunciado_de_eleccionContext.class,0);
		}
		public Enunciado_mientrasContext enunciado_mientras() {
			return getRuleContext(Enunciado_mientrasContext.class,0);
		}
		public Enunciado_paraContext enunciado_para() {
			return getRuleContext(Enunciado_paraContext.class,0);
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
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLICO:
			case PRIVADO:
			case PROTEGIDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				enunciado_objeto();
				}
				break;
			case OBJETO:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				objeto();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				enunciado_de_eleccion();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				enunciado_mientras();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				enunciado_para();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
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

	public static class Enunciado_objetoContext extends ParserRuleContext {
		public Token tipo;
		public TerminalNode SALTO_DE_LINEA() { return getToken(BBParser.SALTO_DE_LINEA, 0); }
		public TerminalNode INDENT() { return getToken(BBParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(BBParser.DEDENT, 0); }
		public TerminalNode PUBLICO() { return getToken(BBParser.PUBLICO, 0); }
		public TerminalNode PRIVADO() { return getToken(BBParser.PRIVADO, 0); }
		public TerminalNode PROTEGIDO() { return getToken(BBParser.PROTEGIDO, 0); }
		public List<EnunciadoContext> enunciado() {
			return getRuleContexts(EnunciadoContext.class);
		}
		public EnunciadoContext enunciado(int i) {
			return getRuleContext(EnunciadoContext.class,i);
		}
		public Enunciado_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_objeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_objeto(this);
		}
	}

	public final Enunciado_objetoContext enunciado_objeto() throws RecognitionException {
		Enunciado_objetoContext _localctx = new Enunciado_objetoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enunciado_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((Enunciado_objetoContext)_localctx).tipo = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO))) != 0)) ) {
				((Enunciado_objetoContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			match(T__1);
			setState(121);
			match(SALTO_DE_LINEA);
			setState(122);
			match(INDENT);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				enunciado();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO) | (1L << OBJETO) | (1L << PARA) | (1L << SI) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0) );
			setState(128);
			match(DEDENT);
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
		enterRule(_localctx, 12, RULE_enunciado_de_eleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			caso_si();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O_SI) {
				{
				{
				setState(131);
				caso_o_si();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(137);
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
		enterRule(_localctx, 14, RULE_caso_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(SI);
			setState(141);
			prueba();
			setState(142);
			match(T__1);
			setState(143);
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
		enterRule(_localctx, 16, RULE_caso_o_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(O_SI);
			setState(146);
			prueba();
			setState(147);
			match(T__1);
			setState(148);
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
		enterRule(_localctx, 18, RULE_caso_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SINO);
			setState(151);
			match(T__1);
			setState(152);
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
		enterRule(_localctx, 20, RULE_enunciado_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			caso_mientras();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(155);
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
		enterRule(_localctx, 22, RULE_caso_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__2);
			setState(159);
			prueba();
			setState(160);
			match(T__1);
			setState(161);
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

	public static class Enunciado_paraContext extends ParserRuleContext {
		public Enunciado_pequegnoContext iterador;
		public ExpresionContext incremento;
		public TerminalNode PARA() { return getToken(BBParser.PARA, 0); }
		public TerminalNode HASTA() { return getToken(BBParser.HASTA, 0); }
		public PruebaContext prueba() {
			return getRuleContext(PruebaContext.class,0);
		}
		public TerminalNode INCREMENTANDO() { return getToken(BBParser.INCREMENTANDO, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Enunciado_pequegnoContext enunciado_pequegno() {
			return getRuleContext(Enunciado_pequegnoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Enunciado_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEnunciado_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEnunciado_para(this);
		}
	}

	public final Enunciado_paraContext enunciado_para() throws RecognitionException {
		Enunciado_paraContext _localctx = new Enunciado_paraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enunciado_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PARA);
			setState(164);
			((Enunciado_paraContext)_localctx).iterador = enunciado_pequegno();
			setState(165);
			match(HASTA);
			setState(166);
			prueba();
			setState(167);
			match(INCREMENTANDO);
			setState(168);
			((Enunciado_paraContext)_localctx).incremento = expresion(0);
			setState(169);
			match(T__1);
			setState(170);
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
		enterRule(_localctx, 26, RULE_enunciado_de_flujo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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

	public static class ObjetoContext extends ParserRuleContext {
		public IdentificadorContext id;
		public IdentificadorContext id_h;
		public TerminalNode OBJETO() { return getToken(BBParser.OBJETO, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode HEREDA() { return getToken(BBParser.HEREDA, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitObjeto(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(OBJETO);
			setState(175);
			((ObjetoContext)_localctx).id = identificador();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEREDA) {
				{
				setState(176);
				match(HEREDA);
				setState(177);
				((ObjetoContext)_localctx).id_h = identificador();
				}
			}

			setState(180);
			match(T__1);
			setState(181);
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
		enterRule(_localctx, 30, RULE_bloque);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SALTO_DE_LINEA:
				_localctx = new Etiqueta_bloque_complejoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(SALTO_DE_LINEA);
				setState(184);
				match(INDENT);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					enunciado();
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO) | (1L << OBJETO) | (1L << PARA) | (1L << SI) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0) );
				setState(190);
				match(DEDENT);
				}
				break;
			case T__9:
			case T__13:
			case PARENTESISapertura:
			case RESTA:
			case ENTERO:
			case DECIMAL:
			case VERDAD:
			case FALSO:
			case TIPO:
			case TEXTO:
			case IDENTIFICADOR:
				_localctx = new Etiqueta_bloque_simpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				enunciado_simple();
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
		enterRule(_localctx, 32, RULE_prueba);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			prueba_o();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI) {
				{
				setState(196);
				match(SI);
				setState(197);
				((PruebaContext)_localctx).prueba_ternaria = prueba_o();
				setState(198);
				match(SINO);
				setState(199);
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
		enterRule(_localctx, 34, RULE_prueba_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			prueba_y();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O) {
				{
				{
				setState(204);
				match(O);
				setState(205);
				prueba_y();
				}
				}
				setState(210);
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
		enterRule(_localctx, 36, RULE_prueba_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			prueba_no();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(212);
				match(Y);
				setState(213);
				prueba_no();
				}
				}
				setState(218);
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
		enterRule(_localctx, 38, RULE_prueba_no);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				_localctx = new Etiqueta_prueba_noContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(NO);
				setState(220);
				prueba_no();
				}
				break;
			case PARENTESISapertura:
			case RESTA:
			case ENTERO:
			case DECIMAL:
			case VERDAD:
			case FALSO:
			case TEXTO:
			case IDENTIFICADOR:
				_localctx = new Etiqueta_prueba_no_comparacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
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
		enterRule(_localctx, 40, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expresion(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(225);
				pareja_de_comparacion();
				}
				}
				setState(230);
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
		enterRule(_localctx, 42, RULE_pareja_de_comparacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			operador_de_comporacion();
			setState(232);
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
		enterRule(_localctx, 44, RULE_operador_de_comporacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 46, RULE_declaracion_de_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((Declaracion_de_funcionContext)_localctx).tipo = match(TIPO);
			setState(237);
			((Declaracion_de_funcionContext)_localctx).id = identificador();
			setState(238);
			match(PARENTESISapertura);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(239);
				parametros();
				}
			}

			setState(242);
			match(PARENTESIScierre);
			setState(243);
			match(T__1);
			setState(244);
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
		enterRule(_localctx, 48, RULE_declaracion_de_variable);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Declaracion_de_variable_con_asignacionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((Declaracion_de_variable_con_asignacionContext)_localctx).tipo = match(TIPO);
				setState(247);
				asignar_a_variable();
				}
				break;
			case 2:
				_localctx = new Declaracion_de_variable_sin_asignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((Declaracion_de_variable_sin_asignacionContext)_localctx).tipo = match(TIPO);
				setState(249);
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
		enterRule(_localctx, 50, RULE_declaracion_de_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__9);
			setState(253);
			match(T__3);
			setState(254);
			((Declaracion_de_listaContext)_localctx).tipo = match(TIPO);
			setState(255);
			match(T__4);
			setState(256);
			((Declaracion_de_listaContext)_localctx).id = identificador();
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(257);
				match(ASIGNACION);
				setState(258);
				match(T__10);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					setState(259);
					expresion(0);
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(260);
						match(T__11);
						setState(261);
						expresion(0);
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(269);
				match(T__12);
				}
				break;
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
		enterRule(_localctx, 52, RULE_parametros);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			parametro();
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					match(T__11);
					setState(274);
					parametro();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(280);
				match(T__11);
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
	public static class Parametro_listaContext extends ParametroContext {
		public Declaracion_de_listaContext declaracion_de_lista() {
			return getRuleContext(Declaracion_de_listaContext.class,0);
		}
		public Parametro_listaContext(ParametroContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterParametro_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitParametro_lista(this);
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
		enterRule(_localctx, 54, RULE_parametro);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				_localctx = new Parametro_funcionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				declaracion_de_variable();
				}
				break;
			case T__9:
				_localctx = new Parametro_listaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				declaracion_de_lista();
				}
				break;
			case PARENTESISapertura:
			case RESTA:
			case ENTERO:
			case DECIMAL:
			case VERDAD:
			case FALSO:
			case TEXTO:
			case IDENTIFICADOR:
				_localctx = new Parametro_llamadaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
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
		enterRule(_localctx, 56, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__13);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(289);
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
		enterRule(_localctx, 58, RULE_asignar_a_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((Asignar_a_variableContext)_localctx).id = identificador();
			setState(293);
			match(ASIGNACION);
			setState(294);
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
		enterRule(_localctx, 60, RULE_asignacion_con_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((Asignacion_con_operacionContext)_localctx).id = identificador();
			setState(297);
			((Asignacion_con_operacionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				((Asignacion_con_operacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(298);
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
		enterRule(_localctx, 62, RULE_operador_ternario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			expresion(0);
			setState(301);
			match(SI);
			setState(302);
			((Operador_ternarioContext)_localctx).prueba_ternaria = expresion(0);
			setState(303);
			match(SINO);
			setState(304);
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
		enterRule(_localctx, 64, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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

	public static class Funcion_recibeContext extends ParserRuleContext {
		public Token mensaje;
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(BBParser.ASIGNACION, 0); }
		public List<TerminalNode> PARENTESISapertura() { return getTokens(BBParser.PARENTESISapertura); }
		public TerminalNode PARENTESISapertura(int i) {
			return getToken(BBParser.PARENTESISapertura, i);
		}
		public List<TerminalNode> PARENTESIScierre() { return getTokens(BBParser.PARENTESIScierre); }
		public TerminalNode PARENTESIScierre(int i) {
			return getToken(BBParser.PARENTESIScierre, i);
		}
		public TerminalNode TEXTO() { return getToken(BBParser.TEXTO, 0); }
		public Funcion_recibeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_recibe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterFuncion_recibe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitFuncion_recibe(this);
		}
	}

	public final Funcion_recibeContext funcion_recibe() throws RecognitionException {
		Funcion_recibeContext _localctx = new Funcion_recibeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcion_recibe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(308);
				match(PARENTESISapertura);
				}
				break;
			}
			setState(311);
			parametros();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTESIScierre) {
				{
				setState(312);
				match(PARENTESIScierre);
				}
			}

			setState(315);
			match(ASIGNACION);
			setState(316);
			match(T__27);
			setState(317);
			match(PARENTESISapertura);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO) {
				{
				setState(318);
				((Funcion_recibeContext)_localctx).mensaje = match(TEXTO);
				}
			}

			setState(321);
			match(PARENTESIScierre);
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

	public static class Llamada_a_metodoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(BBParser.IDENTIFICADOR, 0); }
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public Llamada_a_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_a_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterLlamada_a_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitLlamada_a_metodo(this);
		}
	}

	public final Llamada_a_metodoContext llamada_a_metodo() throws RecognitionException {
		Llamada_a_metodoContext _localctx = new Llamada_a_metodoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_llamada_a_metodo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IDENTIFICADOR);
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(324);
					metodo();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MetodoContext extends ParserRuleContext {
		public TerminalNode METODO() { return getToken(BBParser.METODO, 0); }
		public Metodo_miembroContext metodo_miembro() {
			return getRuleContext(Metodo_miembroContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(METODO);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(330);
				metodo_miembro();
				}
				break;
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

	public static class Metodo_miembroContext extends ParserRuleContext {
		public TerminalNode PARENTESISapertura() { return getToken(BBParser.PARENTESISapertura, 0); }
		public TerminalNode PARENTESIScierre() { return getToken(BBParser.PARENTESIScierre, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Metodo_miembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo_miembro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterMetodo_miembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitMetodo_miembro(this);
		}
	}

	public final Metodo_miembroContext metodo_miembro() throws RecognitionException {
		Metodo_miembroContext _localctx = new Metodo_miembroContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_metodo_miembro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(PARENTESISapertura);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(334);
				parametros();
				}
			}

			setState(337);
			match(PARENTESIScierre);
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
	public static class Etiqueta_valor_atomico_falsoContext extends ExpresionContext {
		public TerminalNode FALSO() { return getToken(BBParser.FALSO, 0); }
		public Etiqueta_valor_atomico_falsoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_valor_atomico_falso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_valor_atomico_falso(this);
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
	public static class Etiqueta_valor_atomico_verdadContext extends ExpresionContext {
		public TerminalNode VERDAD() { return getToken(BBParser.VERDAD, 0); }
		public Etiqueta_valor_atomico_verdadContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_valor_atomico_verdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_valor_atomico_verdad(this);
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
	public static class Etiqueta_de_llamada_a_metodoContext extends ExpresionContext {
		public Llamada_a_metodoContext llamada_a_metodo() {
			return getRuleContext(Llamada_a_metodoContext.class,0);
		}
		public Etiqueta_de_llamada_a_metodoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_de_llamada_a_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_de_llamada_a_metodo(this);
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
		public TerminalNode PARENTESIScierre() { return getToken(BBParser.PARENTESIScierre, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new Etiqueta_de_llamada_a_metodoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(340);
				llamada_a_metodo();
				}
				break;
			case 2:
				{
				_localctx = new Etiqueta_de_llamada_a_funcionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				identificador();
				setState(342);
				match(PARENTESISapertura);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					setState(343);
					parametros();
					}
				}

				setState(346);
				match(PARENTESIScierre);
				}
				break;
			case 3:
				{
				_localctx = new Etiqueta_parentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(PARENTESISapertura);
				setState(349);
				expresion(0);
				setState(350);
				match(PARENTESIScierre);
				}
				break;
			case 4:
				{
				_localctx = new Etiqueta_complemento_negativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				match(RESTA);
				setState(353);
				expresion(7);
				}
				break;
			case 5:
				{
				_localctx = new Etiqueta_valor_atomico_verdadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(VERDAD);
				}
				break;
			case 6:
				{
				_localctx = new Etiqueta_valor_atomico_falsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(FALSO);
				}
				break;
			case 7:
				{
				_localctx = new Etiqueta_identificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				identificador();
				}
				break;
			case 8:
				{
				_localctx = new Etiqueta_valor_textoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				match(TEXTO);
				}
				break;
			case 9:
				{
				_localctx = new Etiqueta_valor_atomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				match(ENTERO);
				}
				break;
			case 10:
				{
				_localctx = new Etiqueta_valor_atomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(DECIMAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Etiqueta_multiplicacion_divisionContext(new ExpresionContext(_parentctx, _parentState));
						((Etiqueta_multiplicacion_divisionContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(362);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(363);
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
						setState(364);
						((Etiqueta_multiplicacion_divisionContext)_localctx).derecha = expresion(11);
						}
						break;
					case 2:
						{
						_localctx = new Etiqueta_suma__restaContext(new ExpresionContext(_parentctx, _parentState));
						((Etiqueta_suma__restaContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(365);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(366);
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
						setState(367);
						((Etiqueta_suma__restaContext)_localctx).derecha = expresion(10);
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		case 37:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\3\2\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3"+
		"\4\5\4e\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3\7\6\7\177\n\7\r\7\16\7\u0080\3\7"+
		"\3\7\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\5\b\u008d\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u009f"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\6\21\u00bd\n\21\r\21\16\21\u00be\3\21\3\21\3\21\5\21\u00c4\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\23\3\23\3\23\7\23\u00d1"+
		"\n\23\f\23\16\23\u00d4\13\23\3\24\3\24\3\24\7\24\u00d9\n\24\f\24\16\24"+
		"\u00dc\13\24\3\25\3\25\3\25\5\25\u00e1\n\25\3\26\3\26\7\26\u00e5\n\26"+
		"\f\26\16\26\u00e8\13\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5"+
		"\31\u00f3\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00fd\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0109\n\33\f\33"+
		"\16\33\u010c\13\33\5\33\u010e\n\33\3\33\5\33\u0111\n\33\3\34\3\34\3\34"+
		"\7\34\u0116\n\34\f\34\16\34\u0119\13\34\3\34\5\34\u011c\n\34\3\35\3\35"+
		"\3\35\5\35\u0121\n\35\3\36\3\36\5\36\u0125\n\36\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\5#\u0138\n#\3#\3#\5#\u013c\n#"+
		"\3#\3#\3#\3#\5#\u0142\n#\3#\3#\3$\3$\6$\u0148\n$\r$\16$\u0149\3%\3%\5"+
		"%\u014e\n%\3&\3&\5&\u0152\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u015b\n\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016b\n\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\7\'\u0173\n\'\f\'\16\'\u0176\13\'\3\'\2\3L(\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2"+
		"\7\3\2\37!\3\2\6\13\3\2\21\35\3\2\64\65\3\2\62\63\2\u0189\2R\3\2\2\2\4"+
		"Y\3\2\2\2\6[\3\2\2\2\bo\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16\u0084\3\2\2\2"+
		"\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u0098\3\2\2\2\26\u009c\3\2\2\2\30"+
		"\u00a0\3\2\2\2\32\u00a5\3\2\2\2\34\u00ae\3\2\2\2\36\u00b0\3\2\2\2 \u00c3"+
		"\3\2\2\2\"\u00c5\3\2\2\2$\u00cd\3\2\2\2&\u00d5\3\2\2\2(\u00e0\3\2\2\2"+
		"*\u00e2\3\2\2\2,\u00e9\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2\62\u00fc"+
		"\3\2\2\2\64\u00fe\3\2\2\2\66\u0112\3\2\2\28\u0120\3\2\2\2:\u0122\3\2\2"+
		"\2<\u0126\3\2\2\2>\u012a\3\2\2\2@\u012e\3\2\2\2B\u0134\3\2\2\2D\u0137"+
		"\3\2\2\2F\u0145\3\2\2\2H\u014b\3\2\2\2J\u014f\3\2\2\2L\u016a\3\2\2\2N"+
		"Q\7B\2\2OQ\5\4\3\2PN\3\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S"+
		"U\3\2\2\2TR\3\2\2\2UV\7\2\2\3V\3\3\2\2\2WZ\5\6\4\2XZ\5\n\6\2YW\3\2\2\2"+
		"YX\3\2\2\2Z\5\3\2\2\2[`\5\b\5\2\\]\7\3\2\2]_\5\b\5\2^\\\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2ce\7\3\2\2dc\3\2\2\2de\3\2"+
		"\2\2ef\3\2\2\2fg\7B\2\2g\7\3\2\2\2hp\5D#\2ip\5L\'\2jp\5\34\17\2kp\5<\37"+
		"\2lp\5> \2mp\5\62\32\2np\5\64\33\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2"+
		"\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qx\5\f\7\2rx\5\36\20\2sx"+
		"\5\16\b\2tx\5\26\f\2ux\5\32\16\2vx\5\60\31\2wq\3\2\2\2wr\3\2\2\2ws\3\2"+
		"\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\13\3\2\2\2yz\t\2\2\2z{\7\4\2\2{|\7"+
		"B\2\2|~\7D\2\2}\177\5\4\3\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7E\2\2\u0083\r\3"+
		"\2\2\2\u0084\u0088\5\20\t\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008d\5\24\13\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e\u008f\7\'\2\2\u008f\u0090\5\"\22"+
		"\2\u0090\u0091\7\4\2\2\u0091\u0092\5 \21\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\7)\2\2\u0094\u0095\5\"\22\2\u0095\u0096\7\4\2\2\u0096\u0097\5 \21\2\u0097"+
		"\23\3\2\2\2\u0098\u0099\7*\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5 \21\2"+
		"\u009b\25\3\2\2\2\u009c\u009e\5\30\r\2\u009d\u009f\5\24\13\2\u009e\u009d"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1"+
		"\u00a2\5\"\22\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5 \21\2\u00a4\31\3\2\2"+
		"\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\7%\2\2\u00a8\u00a9"+
		"\5\"\22\2\u00a9\u00aa\7&\2\2\u00aa\u00ab\5L\'\2\u00ab\u00ac\7\4\2\2\u00ac"+
		"\u00ad\5 \21\2\u00ad\33\3\2\2\2\u00ae\u00af\5:\36\2\u00af\35\3\2\2\2\u00b0"+
		"\u00b1\7#\2\2\u00b1\u00b4\5B\"\2\u00b2\u00b3\7\"\2\2\u00b3\u00b5\5B\""+
		"\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\7\4\2\2\u00b7\u00b8\5 \21\2\u00b8\37\3\2\2\2\u00b9\u00ba\7B\2\2\u00ba"+
		"\u00bc\7D\2\2\u00bb\u00bd\5\4\3\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7E\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4\5\6\4\2\u00c3\u00b9\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00cb\5$\23\2\u00c6\u00c7"+
		"\7\'\2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9\7*\2\2\u00c9\u00ca\5\"\22\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2"+
		"\u00cd\u00d2\5&\24\2\u00ce\u00cf\7,\2\2\u00cf\u00d1\5&\24\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"%\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5(\25\2\u00d6\u00d7\7-\2\2\u00d7"+
		"\u00d9\5(\25\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\7+\2\2\u00de\u00e1\5(\25\2\u00df\u00e1\5*\26\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e6\5L\'\2\u00e3\u00e5\5,\27\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7+\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5.\30\2\u00ea\u00eb"+
		"\5L\'\2\u00eb-\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed/\3\2\2\2\u00ee\u00ef"+
		"\7<\2\2\u00ef\u00f0\5B\"\2\u00f0\u00f2\7\60\2\2\u00f1\u00f3\5\66\34\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\7\61\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\5 \21\2\u00f7\61\3\2\2\2\u00f8"+
		"\u00f9\7<\2\2\u00f9\u00fd\5<\37\2\u00fa\u00fb\7<\2\2\u00fb\u00fd\5B\""+
		"\2\u00fc\u00f8\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\63\3\2\2\2\u00fe\u00ff"+
		"\7\f\2\2\u00ff\u0100\7\6\2\2\u0100\u0101\7<\2\2\u0101\u0102\7\7\2\2\u0102"+
		"\u0110\5B\"\2\u0103\u0104\7\66\2\2\u0104\u010d\7\r\2\2\u0105\u010a\5L"+
		"\'\2\u0106\u0107\7\16\2\2\u0107\u0109\5L\'\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\7\17\2\2\u0110\u0103\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\65\3\2\2\2\u0112\u0117\58\35\2\u0113\u0114\7\16\2\2\u0114"+
		"\u0116\58\35\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011c\7\16\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\67\3\2\2"+
		"\2\u011d\u0121\5\62\32\2\u011e\u0121\5\64\33\2\u011f\u0121\5L\'\2\u0120"+
		"\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u01219\3\2\2\2"+
		"\u0122\u0124\7\20\2\2\u0123\u0125\5L\'\2\u0124\u0123\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125;\3\2\2\2\u0126\u0127\5B\"\2\u0127\u0128\7\66\2\2\u0128"+
		"\u0129\5L\'\2\u0129=\3\2\2\2\u012a\u012b\5B\"\2\u012b\u012c\t\4\2\2\u012c"+
		"\u012d\5L\'\2\u012d?\3\2\2\2\u012e\u012f\5L\'\2\u012f\u0130\7\'\2\2\u0130"+
		"\u0131\5L\'\2\u0131\u0132\7*\2\2\u0132\u0133\5L\'\2\u0133A\3\2\2\2\u0134"+
		"\u0135\7>\2\2\u0135C\3\2\2\2\u0136\u0138\7\60\2\2\u0137\u0136\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\5\66\34\2\u013a\u013c"+
		"\7\61\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2"+
		"\u013d\u013e\7\66\2\2\u013e\u013f\7\36\2\2\u013f\u0141\7\60\2\2\u0140"+
		"\u0142\7=\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\7\61\2\2\u0144E\3\2\2\2\u0145\u0147\7>\2\2\u0146\u0148"+
		"\5H%\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014aG\3\2\2\2\u014b\u014d\7?\2\2\u014c\u014e\5J&\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014eI\3\2\2\2\u014f\u0151\7\60\2\2"+
		"\u0150\u0152\5\66\34\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0154\7\61\2\2\u0154K\3\2\2\2\u0155\u0156\b\'\1\2\u0156"+
		"\u016b\5F$\2\u0157\u0158\5B\"\2\u0158\u015a\7\60\2\2\u0159\u015b\5\66"+
		"\34\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\7\61\2\2\u015d\u016b\3\2\2\2\u015e\u015f\7\60\2\2\u015f\u0160\5"+
		"L\'\2\u0160\u0161\7\61\2\2\u0161\u016b\3\2\2\2\u0162\u0163\7\63\2\2\u0163"+
		"\u016b\5L\'\t\u0164\u016b\7:\2\2\u0165\u016b\7;\2\2\u0166\u016b\5B\"\2"+
		"\u0167\u016b\7=\2\2\u0168\u016b\78\2\2\u0169\u016b\79\2\2\u016a\u0155"+
		"\3\2\2\2\u016a\u0157\3\2\2\2\u016a\u015e\3\2\2\2\u016a\u0162\3\2\2\2\u016a"+
		"\u0164\3\2\2\2\u016a\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b\u0174\3\2\2\2\u016c"+
		"\u016d\f\f\2\2\u016d\u016e\t\5\2\2\u016e\u0173\5L\'\r\u016f\u0170\f\13"+
		"\2\2\u0170\u0171\t\6\2\2\u0171\u0173\5L\'\f\u0172\u016c\3\2\2\2\u0172"+
		"\u016f\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175M\3\2\2\2\u0176\u0174\3\2\2\2(PRY`dow\u0080\u0088\u008c\u009e"+
		"\u00b4\u00be\u00c3\u00cb\u00d2\u00da\u00e0\u00e6\u00f2\u00fc\u010a\u010d"+
		"\u0110\u0117\u011b\u0120\u0124\u0137\u013b\u0141\u0149\u014d\u0151\u015a"+
		"\u016a\u0172\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}