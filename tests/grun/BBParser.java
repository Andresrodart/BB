// Generated from BB.g4 by ANTLR 4.9.1
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
		T__24=25, T__25=26, PUBLICO=27, PRIVADO=28, PROTEGIDO=29, HEREDA=30, OBJETO=31, 
		PARA=32, HASTA=33, INCREMENTANDO=34, SI=35, ES=36, O_SI=37, SINO=38, NO=39, 
		O=40, Y=41, ES_IGUAL=42, OP_LOGICO=43, PARENTESISapertura=44, PARENTESIScierre=45, 
		CORCHETE_APERTURA=46, CORCHETE_CIERRE=47, SUMA=48, RESTA=49, ASTERISRCO=50, 
		DIVISION=51, ASIGNACION=52, POTENCIA=53, ENTERO=54, DECIMAL=55, VERDAD=56, 
		FALSO=57, TIPO=58, TEXTO=59, IDENTIFICADOR=60, METODO=61, COMENTARIO=62, 
		TABULACION=63, SALTO_DE_LINEA=64, IGNORA_=65, INDENT=66, DEDENT=67;
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
		RULE_llamada_a_metodo = 34, RULE_acceso_arreglo = 35, RULE_metodo = 36, 
		RULE_metodo_miembro = 37, RULE_expresion = 38;
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
			"acceso_arreglo", "metodo", "metodo_miembro", "expresion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'mientras'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", "'lista'", "','", "'regresa'", "'+='", "'-='", "'*='", "'@='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='", 
			"'recibe'", "'p\u00FAblico'", "'privado'", "'protegido'", "'hereda'", 
			"'objeto'", "'para'", "'hasta'", "'incrementando'", "'si'", "'es'", "'o si'", 
			"'sino'", "'no'", "'o'", "'y'", null, null, "'('", "')'", "'['", "']'", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'^'", null, null, "'verdad'", "'falso'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PUBLICO", "PRIVADO", "PROTEGIDO", "HEREDA", "OBJETO", 
			"PARA", "HASTA", "INCREMENTANDO", "SI", "ES", "O_SI", "SINO", "NO", "O", 
			"Y", "ES_IGUAL", "OP_LOGICO", "PARENTESISapertura", "PARENTESIScierre", 
			"CORCHETE_APERTURA", "CORCHETE_CIERRE", "SUMA", "RESTA", "ASTERISRCO", 
			"DIVISION", "ASIGNACION", "POTENCIA", "ENTERO", "DECIMAL", "VERDAD", 
			"FALSO", "TIPO", "TEXTO", "IDENTIFICADOR", "METODO", "COMENTARIO", "TABULACION", 
			"SALTO_DE_LINEA", "IGNORA_", "INDENT", "DEDENT"
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__9 - 3)) | (1L << (T__11 - 3)) | (1L << (PUBLICO - 3)) | (1L << (PRIVADO - 3)) | (1L << (PROTEGIDO - 3)) | (1L << (OBJETO - 3)) | (1L << (PARA - 3)) | (1L << (SI - 3)) | (1L << (PARENTESISapertura - 3)) | (1L << (RESTA - 3)) | (1L << (ENTERO - 3)) | (1L << (DECIMAL - 3)) | (1L << (VERDAD - 3)) | (1L << (FALSO - 3)) | (1L << (TIPO - 3)) | (1L << (TEXTO - 3)) | (1L << (IDENTIFICADOR - 3)) | (1L << (SALTO_DE_LINEA - 3)))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SALTO_DE_LINEA:
					{
					setState(78);
					match(SALTO_DE_LINEA);
					}
					break;
				case T__2:
				case T__9:
				case T__11:
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
					setState(79);
					enunciado();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				enunciado_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
			setState(91);
			enunciado_pequegno();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(T__0);
					setState(93);
					enunciado_pequegno();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(99);
				match(T__0);
				}
			}

			setState(102);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				funcion_recibe();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				expresion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				enunciado_de_flujo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				asignar_a_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				asignacion_con_operacion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				declaracion_de_variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLICO:
			case PRIVADO:
			case PROTEGIDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				enunciado_objeto();
				}
				break;
			case OBJETO:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				objeto();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				enunciado_de_eleccion();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				enunciado_mientras();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				enunciado_para();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
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
			setState(121);
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
			setState(122);
			match(T__1);
			setState(123);
			match(SALTO_DE_LINEA);
			setState(124);
			match(INDENT);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				enunciado();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO) | (1L << OBJETO) | (1L << PARA) | (1L << SI) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0) );
			setState(130);
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
			setState(132);
			caso_si();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O_SI) {
				{
				{
				setState(133);
				caso_o_si();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(139);
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
			setState(142);
			match(SI);
			setState(143);
			prueba();
			setState(144);
			match(T__1);
			setState(145);
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
			setState(147);
			match(O_SI);
			setState(148);
			prueba();
			setState(149);
			match(T__1);
			setState(150);
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
			setState(152);
			match(SINO);
			setState(153);
			match(T__1);
			setState(154);
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
			setState(156);
			caso_mientras();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(157);
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
			setState(160);
			match(T__2);
			setState(161);
			prueba();
			setState(162);
			match(T__1);
			setState(163);
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
			setState(165);
			match(PARA);
			setState(166);
			((Enunciado_paraContext)_localctx).iterador = enunciado_pequegno();
			setState(167);
			match(HASTA);
			setState(168);
			prueba();
			setState(169);
			match(INCREMENTANDO);
			setState(170);
			((Enunciado_paraContext)_localctx).incremento = expresion(0);
			setState(171);
			match(T__1);
			setState(172);
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
			setState(174);
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
			setState(176);
			match(OBJETO);
			setState(177);
			((ObjetoContext)_localctx).id = identificador();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEREDA) {
				{
				setState(178);
				match(HEREDA);
				setState(179);
				((ObjetoContext)_localctx).id_h = identificador();
				}
			}

			setState(182);
			match(T__1);
			setState(183);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SALTO_DE_LINEA:
				_localctx = new Etiqueta_bloque_complejoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(SALTO_DE_LINEA);
				setState(186);
				match(INDENT);
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187);
					enunciado();
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << PUBLICO) | (1L << PRIVADO) | (1L << PROTEGIDO) | (1L << OBJETO) | (1L << PARA) | (1L << SI) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0) );
				setState(192);
				match(DEDENT);
				}
				break;
			case T__9:
			case T__11:
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
				setState(194);
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
			setState(197);
			prueba_o();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI) {
				{
				setState(198);
				match(SI);
				setState(199);
				((PruebaContext)_localctx).prueba_ternaria = prueba_o();
				setState(200);
				match(SINO);
				setState(201);
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
			setState(205);
			prueba_y();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==O) {
				{
				{
				setState(206);
				match(O);
				setState(207);
				prueba_y();
				}
				}
				setState(212);
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
			setState(213);
			prueba_no();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(214);
				match(Y);
				setState(215);
				prueba_no();
				}
				}
				setState(220);
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
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				_localctx = new Etiqueta_prueba_noContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(NO);
				setState(222);
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
				setState(223);
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
			setState(226);
			expresion(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(227);
				pareja_de_comparacion();
				}
				}
				setState(232);
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
			setState(233);
			operador_de_comporacion();
			setState(234);
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
			setState(236);
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
			setState(238);
			((Declaracion_de_funcionContext)_localctx).tipo = match(TIPO);
			setState(239);
			((Declaracion_de_funcionContext)_localctx).id = identificador();
			setState(240);
			match(PARENTESISapertura);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(241);
				parametros();
				}
			}

			setState(244);
			match(PARENTESIScierre);
			setState(245);
			match(T__1);
			setState(246);
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Declaracion_de_variable_con_asignacionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				((Declaracion_de_variable_con_asignacionContext)_localctx).tipo = match(TIPO);
				setState(249);
				asignar_a_variable();
				}
				break;
			case 2:
				_localctx = new Declaracion_de_variable_sin_asignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((Declaracion_de_variable_sin_asignacionContext)_localctx).tipo = match(TIPO);
				setState(251);
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
		public TerminalNode CORCHETE_APERTURA() { return getToken(BBParser.CORCHETE_APERTURA, 0); }
		public TerminalNode CORCHETE_CIERRE() { return getToken(BBParser.CORCHETE_CIERRE, 0); }
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
			setState(254);
			match(T__9);
			setState(255);
			match(T__3);
			setState(256);
			((Declaracion_de_listaContext)_localctx).tipo = match(TIPO);
			setState(257);
			match(T__4);
			setState(258);
			((Declaracion_de_listaContext)_localctx).id = identificador();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(259);
				match(ASIGNACION);
				setState(260);
				match(CORCHETE_APERTURA);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					setState(261);
					expresion(0);
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(262);
						match(T__10);
						setState(263);
						expresion(0);
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(271);
				match(CORCHETE_CIERRE);
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
			setState(274);
			parametro();
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					match(T__10);
					setState(276);
					parametro();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(282);
				match(T__10);
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
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				_localctx = new Parametro_funcionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				declaracion_de_variable();
				}
				break;
			case T__9:
				_localctx = new Parametro_listaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
				setState(287);
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
			setState(290);
			match(T__11);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(291);
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
			setState(294);
			((Asignar_a_variableContext)_localctx).id = identificador();
			setState(295);
			match(ASIGNACION);
			setState(296);
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
			setState(298);
			((Asignacion_con_operacionContext)_localctx).id = identificador();
			setState(299);
			((Asignacion_con_operacionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				((Asignacion_con_operacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(300);
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
			setState(302);
			expresion(0);
			setState(303);
			match(SI);
			setState(304);
			((Operador_ternarioContext)_localctx).prueba_ternaria = expresion(0);
			setState(305);
			match(SINO);
			setState(306);
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
			setState(308);
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
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(310);
				match(PARENTESISapertura);
				}
				break;
			}
			setState(313);
			parametros();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTESIScierre) {
				{
				setState(314);
				match(PARENTESIScierre);
				}
			}

			setState(317);
			match(ASIGNACION);
			setState(318);
			match(T__25);
			setState(319);
			match(PARENTESISapertura);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO) {
				{
				setState(320);
				((Funcion_recibeContext)_localctx).mensaje = match(TEXTO);
				}
			}

			setState(323);
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
			setState(325);
			match(IDENTIFICADOR);
			setState(327); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(326);
					metodo();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329); 
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

	public static class Acceso_arregloContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(BBParser.IDENTIFICADOR, 0); }
		public TerminalNode CORCHETE_APERTURA() { return getToken(BBParser.CORCHETE_APERTURA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CORCHETE_CIERRE() { return getToken(BBParser.CORCHETE_CIERRE, 0); }
		public Acceso_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterAcceso_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitAcceso_arreglo(this);
		}
	}

	public final Acceso_arregloContext acceso_arreglo() throws RecognitionException {
		Acceso_arregloContext _localctx = new Acceso_arregloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_acceso_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IDENTIFICADOR);
			setState(332);
			match(CORCHETE_APERTURA);
			setState(333);
			expresion(0);
			setState(334);
			match(CORCHETE_CIERRE);
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
		enterRule(_localctx, 72, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(METODO);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(337);
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
		enterRule(_localctx, 74, RULE_metodo_miembro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(PARENTESISapertura);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				setState(341);
				parametros();
				}
			}

			setState(344);
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
	public static class Etiqueta_de_acceso_arregloContext extends ExpresionContext {
		public Acceso_arregloContext acceso_arreglo() {
			return getRuleContext(Acceso_arregloContext.class,0);
		}
		public Etiqueta_de_acceso_arregloContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).enterEtiqueta_de_acceso_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BBListener ) ((BBListener)listener).exitEtiqueta_de_acceso_arreglo(this);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new Etiqueta_de_llamada_a_metodoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(347);
				llamada_a_metodo();
				}
				break;
			case 2:
				{
				_localctx = new Etiqueta_de_acceso_arregloContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				acceso_arreglo();
				}
				break;
			case 3:
				{
				_localctx = new Etiqueta_de_llamada_a_funcionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				identificador();
				setState(350);
				match(PARENTESISapertura);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << PARENTESISapertura) | (1L << RESTA) | (1L << ENTERO) | (1L << DECIMAL) | (1L << VERDAD) | (1L << FALSO) | (1L << TIPO) | (1L << TEXTO) | (1L << IDENTIFICADOR))) != 0)) {
					{
					setState(351);
					parametros();
					}
				}

				setState(354);
				match(PARENTESIScierre);
				}
				break;
			case 4:
				{
				_localctx = new Etiqueta_parentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				match(PARENTESISapertura);
				setState(357);
				expresion(0);
				setState(358);
				match(PARENTESIScierre);
				}
				break;
			case 5:
				{
				_localctx = new Etiqueta_complemento_negativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(RESTA);
				setState(361);
				expresion(7);
				}
				break;
			case 6:
				{
				_localctx = new Etiqueta_valor_atomico_verdadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				match(VERDAD);
				}
				break;
			case 7:
				{
				_localctx = new Etiqueta_valor_atomico_falsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				match(FALSO);
				}
				break;
			case 8:
				{
				_localctx = new Etiqueta_identificadorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				identificador();
				}
				break;
			case 9:
				{
				_localctx = new Etiqueta_valor_textoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				match(TEXTO);
				}
				break;
			case 10:
				{
				_localctx = new Etiqueta_valor_atomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(ENTERO);
				}
				break;
			case 11:
				{
				_localctx = new Etiqueta_valor_atomicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(DECIMAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Etiqueta_multiplicacion_divisionContext(new ExpresionContext(_parentctx, _parentState));
						((Etiqueta_multiplicacion_divisionContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(370);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(371);
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
						setState(372);
						((Etiqueta_multiplicacion_divisionContext)_localctx).derecha = expresion(11);
						}
						break;
					case 2:
						{
						_localctx = new Etiqueta_suma__restaContext(new ExpresionContext(_parentctx, _parentState));
						((Etiqueta_suma__restaContext)_localctx).izquierda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(373);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(374);
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
						setState(375);
						((Etiqueta_suma__restaContext)_localctx).derecha = expresion(10);
						}
						break;
					}
					} 
				}
				setState(380);
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
		case 38:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\7\2S\n\2\f\2"+
		"\16\2V\13\2\3\2\3\2\3\3\3\3\5\3\\\n\3\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d\13"+
		"\4\3\4\5\4g\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\7\6\7\u0081\n\7\r\7\16\7\u0082"+
		"\3\7\3\7\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b\5\b\u008f\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\6\21\u00bf\n\21\r\21\16\21\u00c0\3\21\3\21\3\21\5\21\u00c6"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ce\n\22\3\23\3\23\3\23\7\23"+
		"\u00d3\n\23\f\23\16\23\u00d6\13\23\3\24\3\24\3\24\7\24\u00db\n\24\f\24"+
		"\16\24\u00de\13\24\3\25\3\25\3\25\5\25\u00e3\n\25\3\26\3\26\7\26\u00e7"+
		"\n\26\f\26\16\26\u00ea\13\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\5\31\u00f5\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00ff"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u010b\n\33"+
		"\f\33\16\33\u010e\13\33\5\33\u0110\n\33\3\33\5\33\u0113\n\33\3\34\3\34"+
		"\3\34\7\34\u0118\n\34\f\34\16\34\u011b\13\34\3\34\5\34\u011e\n\34\3\35"+
		"\3\35\3\35\5\35\u0123\n\35\3\36\3\36\5\36\u0127\n\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3#\5#\u013a\n#\3#\3#\5#\u013e"+
		"\n#\3#\3#\3#\3#\5#\u0144\n#\3#\3#\3$\3$\6$\u014a\n$\r$\16$\u014b\3%\3"+
		"%\3%\3%\3%\3&\3&\5&\u0155\n&\3\'\3\'\5\'\u0159\n\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\5(\u0163\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0173"+
		"\n(\3(\3(\3(\3(\3(\3(\7(\u017b\n(\f(\16(\u017e\13(\3(\2\3N)\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\7\3\2"+
		"\35\37\3\2\6\13\3\2\17\33\3\2\64\65\3\2\62\63\2\u0191\2T\3\2\2\2\4[\3"+
		"\2\2\2\6]\3\2\2\2\bq\3\2\2\2\ny\3\2\2\2\f{\3\2\2\2\16\u0086\3\2\2\2\20"+
		"\u0090\3\2\2\2\22\u0095\3\2\2\2\24\u009a\3\2\2\2\26\u009e\3\2\2\2\30\u00a2"+
		"\3\2\2\2\32\u00a7\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00c5\3\2"+
		"\2\2\"\u00c7\3\2\2\2$\u00cf\3\2\2\2&\u00d7\3\2\2\2(\u00e2\3\2\2\2*\u00e4"+
		"\3\2\2\2,\u00eb\3\2\2\2.\u00ee\3\2\2\2\60\u00f0\3\2\2\2\62\u00fe\3\2\2"+
		"\2\64\u0100\3\2\2\2\66\u0114\3\2\2\28\u0122\3\2\2\2:\u0124\3\2\2\2<\u0128"+
		"\3\2\2\2>\u012c\3\2\2\2@\u0130\3\2\2\2B\u0136\3\2\2\2D\u0139\3\2\2\2F"+
		"\u0147\3\2\2\2H\u014d\3\2\2\2J\u0152\3\2\2\2L\u0156\3\2\2\2N\u0172\3\2"+
		"\2\2PS\7B\2\2QS\5\4\3\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2UW\3\2\2\2VT\3\2\2\2WX\7\2\2\3X\3\3\2\2\2Y\\\5\6\4\2Z\\\5\n\6\2[Y"+
		"\3\2\2\2[Z\3\2\2\2\\\5\3\2\2\2]b\5\b\5\2^_\7\3\2\2_a\5\b\5\2`^\3\2\2\2"+
		"ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eg\7\3\2\2fe\3\2\2\2"+
		"fg\3\2\2\2gh\3\2\2\2hi\7B\2\2i\7\3\2\2\2jr\5D#\2kr\5N(\2lr\5\34\17\2m"+
		"r\5<\37\2nr\5> \2or\5\62\32\2pr\5\64\33\2qj\3\2\2\2qk\3\2\2\2ql\3\2\2"+
		"\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\t\3\2\2\2sz\5\f\7\2tz\5\36"+
		"\20\2uz\5\16\b\2vz\5\26\f\2wz\5\32\16\2xz\5\60\31\2ys\3\2\2\2yt\3\2\2"+
		"\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\13\3\2\2\2{|\t\2\2\2|}\7\4"+
		"\2\2}~\7B\2\2~\u0080\7D\2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\7E\2\2\u0085\r\3\2\2\2\u0086\u008a\5\20\t\2\u0087\u0089"+
		"\5\22\n\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f"+
		"\5\24\13\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\17\3\2\2\2\u0090"+
		"\u0091\7%\2\2\u0091\u0092\5\"\22\2\u0092\u0093\7\4\2\2\u0093\u0094\5 "+
		"\21\2\u0094\21\3\2\2\2\u0095\u0096\7\'\2\2\u0096\u0097\5\"\22\2\u0097"+
		"\u0098\7\4\2\2\u0098\u0099\5 \21\2\u0099\23\3\2\2\2\u009a\u009b\7(\2\2"+
		"\u009b\u009c\7\4\2\2\u009c\u009d\5 \21\2\u009d\25\3\2\2\2\u009e\u00a0"+
		"\5\30\r\2\u009f\u00a1\5\24\13\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2"+
		"\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5"+
		"\7\4\2\2\u00a5\u00a6\5 \21\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\u00a9\5\b\5\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7$"+
		"\2\2\u00ac\u00ad\5N(\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5 \21\2\u00af\33"+
		"\3\2\2\2\u00b0\u00b1\5:\36\2\u00b1\35\3\2\2\2\u00b2\u00b3\7!\2\2\u00b3"+
		"\u00b6\5B\"\2\u00b4\u00b5\7 \2\2\u00b5\u00b7\5B\"\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba"+
		"\5 \21\2\u00ba\37\3\2\2\2\u00bb\u00bc\7B\2\2\u00bc\u00be\7D\2\2\u00bd"+
		"\u00bf\5\4\3\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7E\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00bb\3\2\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6!\3\2\2\2\u00c7\u00cd\5$\23\2\u00c8\u00c9\7%\2\2\u00c9\u00ca"+
		"\5$\23\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c8\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce#\3\2\2\2\u00cf\u00d4\5&\24\2"+
		"\u00d0\u00d1\7*\2\2\u00d1\u00d3\5&\24\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00dc\5(\25\2\u00d8\u00d9\7+\2\2\u00d9\u00db\5(\25"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7)\2\2\u00e0"+
		"\u00e3\5(\25\2\u00e1\u00e3\5*\26\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3)\3\2\2\2\u00e4\u00e8\5N(\2\u00e5\u00e7\5,\27\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"+\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\5N(\2\u00ed"+
		"-\3\2\2\2\u00ee\u00ef\t\3\2\2\u00ef/\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1"+
		"\u00f2\5B\"\2\u00f2\u00f4\7.\2\2\u00f3\u00f5\5\66\34\2\u00f4\u00f3\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7"+
		"\u00f8\7\4\2\2\u00f8\u00f9\5 \21\2\u00f9\61\3\2\2\2\u00fa\u00fb\7<\2\2"+
		"\u00fb\u00ff\5<\37\2\u00fc\u00fd\7<\2\2\u00fd\u00ff\5B\"\2\u00fe\u00fa"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\63\3\2\2\2\u0100\u0101\7\f\2\2\u0101"+
		"\u0102\7\6\2\2\u0102\u0103\7<\2\2\u0103\u0104\7\7\2\2\u0104\u0112\5B\""+
		"\2\u0105\u0106\7\66\2\2\u0106\u010f\7\60\2\2\u0107\u010c\5N(\2\u0108\u0109"+
		"\7\r\2\2\u0109\u010b\5N(\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0107\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\7\61\2\2\u0112\u0105\3\2\2\2\u0112\u0113\3\2\2\2\u0113\65\3\2\2"+
		"\2\u0114\u0119\58\35\2\u0115\u0116\7\r\2\2\u0116\u0118\58\35\2\u0117\u0115"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7\r\2\2\u011d\u011c\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\67\3\2\2\2\u011f\u0123\5\62\32\2\u0120"+
		"\u0123\5\64\33\2\u0121\u0123\5N(\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0121\3\2\2\2\u01239\3\2\2\2\u0124\u0126\7\16\2\2\u0125\u0127"+
		"\5N(\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127;\3\2\2\2\u0128\u0129"+
		"\5B\"\2\u0129\u012a\7\66\2\2\u012a\u012b\5N(\2\u012b=\3\2\2\2\u012c\u012d"+
		"\5B\"\2\u012d\u012e\t\4\2\2\u012e\u012f\5N(\2\u012f?\3\2\2\2\u0130\u0131"+
		"\5N(\2\u0131\u0132\7%\2\2\u0132\u0133\5N(\2\u0133\u0134\7(\2\2\u0134\u0135"+
		"\5N(\2\u0135A\3\2\2\2\u0136\u0137\7>\2\2\u0137C\3\2\2\2\u0138\u013a\7"+
		".\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\5\66\34\2\u013c\u013e\7/\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\66\2\2\u0140\u0141\7\34\2\2\u0141"+
		"\u0143\7.\2\2\u0142\u0144\7=\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2"+
		"\2\u0144\u0145\3\2\2\2\u0145\u0146\7/\2\2\u0146E\3\2\2\2\u0147\u0149\7"+
		">\2\2\u0148\u014a\5J&\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cG\3\2\2\2\u014d\u014e\7>\2\2\u014e"+
		"\u014f\7\60\2\2\u014f\u0150\5N(\2\u0150\u0151\7\61\2\2\u0151I\3\2\2\2"+
		"\u0152\u0154\7?\2\2\u0153\u0155\5L\'\2\u0154\u0153\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155K\3\2\2\2\u0156\u0158\7.\2\2\u0157\u0159\5\66\34\2\u0158"+
		"\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7/"+
		"\2\2\u015bM\3\2\2\2\u015c\u015d\b(\1\2\u015d\u0173\5F$\2\u015e\u0173\5"+
		"H%\2\u015f\u0160\5B\"\2\u0160\u0162\7.\2\2\u0161\u0163\5\66\34\2\u0162"+
		"\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7/"+
		"\2\2\u0165\u0173\3\2\2\2\u0166\u0167\7.\2\2\u0167\u0168\5N(\2\u0168\u0169"+
		"\7/\2\2\u0169\u0173\3\2\2\2\u016a\u016b\7\63\2\2\u016b\u0173\5N(\t\u016c"+
		"\u0173\7:\2\2\u016d\u0173\7;\2\2\u016e\u0173\5B\"\2\u016f\u0173\7=\2\2"+
		"\u0170\u0173\78\2\2\u0171\u0173\79\2\2\u0172\u015c\3\2\2\2\u0172\u015e"+
		"\3\2\2\2\u0172\u015f\3\2\2\2\u0172\u0166\3\2\2\2\u0172\u016a\3\2\2\2\u0172"+
		"\u016c\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u016f\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u017c\3\2\2\2\u0174"+
		"\u0175\f\f\2\2\u0175\u0176\t\5\2\2\u0176\u017b\5N(\r\u0177\u0178\f\13"+
		"\2\2\u0178\u0179\t\6\2\2\u0179\u017b\5N(\f\u017a\u0174\3\2\2\2\u017a\u0177"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"O\3\2\2\2\u017e\u017c\3\2\2\2(RT[bfqy\u0082\u008a\u008e\u00a0\u00b6\u00c0"+
		"\u00c5\u00cd\u00d4\u00dc\u00e2\u00e8\u00f4\u00fe\u010c\u010f\u0112\u0119"+
		"\u011d\u0122\u0126\u0139\u013d\u0143\u014b\u0154\u0158\u0162\u0172\u017a"+
		"\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}