grammar BB;
import reglas_lexicas; //Reglas del analizador lexicográfico

tokens { INDENT, DEDENT }

@lexer::members {
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
}

/************************
	Reglas del Parser
*************************/
bb								: (SALTO_DE_LINEA | enunciado)* EOF;

enunciado						: enunciado_complejo | enunciado_simple ;	

enunciado_simple				: enunciado_pequegno (';' enunciado_pequegno)* (';')? SALTO_DE_LINEA;

enunciado_pequegno				: expresion | enunciado_de_flujo | asignar_a_variable | asignacion_con_operacion | declaracion_de_variable | declaracion_de_lista;

enunciado_complejo				: enunciado_de_eleccion | enunciado_mientras | declaracion_de_funcion;

enunciado_de_eleccion			: caso_si caso_o_si* caso_sino?;

caso_si							: SI prueba ':' bloque;

caso_o_si						: O_SI prueba ':' bloque;

caso_sino						: SINO ':' bloque;

enunciado_mientras				: caso_mientras caso_sino?;

caso_mientras					: 'mientras' prueba ':' bloque;

enunciado_de_flujo				: retorno; 

bloque							: enunciado_simple 										#etiqueta_bloque_simple
								| SALTO_DE_LINEA INDENT enunciado+ DEDENT				#etiqueta_bloque_complejo
								;

prueba							: prueba_o (SI  prueba_ternaria=prueba_o SINO respuesta_ternaria=prueba)?;

prueba_o						: prueba_y (O prueba_y)*;

prueba_y						: prueba_no (Y prueba_no)*;

prueba_no						: NO prueba_no 	#etiqueta_prueba_no
								| comparacion	#etiqueta_prueba_no_comparacion
								;

comparacion						: expresion pareja_de_comparacion*;

pareja_de_comparacion			: operador_de_comporacion expresion;

operador_de_comporacion			: '<'|'>'|'=='|'>='|'<='|'!=';

declaracion_de_funcion			: tipo=TIPO 'def' id=IDENTIFICADOR '(' parametros? ')' ':' bloque;

declaracion_de_variable			: tipo=TIPO asignar_a_variable 			#declaracion_de_variable_con_asignacion
								| tipo=TIPO id=IDENTIFICADOR			#declaracion_de_variable_sin_asignacion
								;

declaracion_de_lista			: 'lista' '<' tipo=TIPO '>' id=IDENTIFICADOR ( '=' '[' (expresion (',' expresion)*)? ']')?;

parametros						: paramtetro (',' paramtetro)* (',')?;

paramtetro						: declaracion_de_variable | IDENTIFICADOR;

retorno							: 'regresa' (expresion)?;

asignar_a_variable				: IDENTIFICADOR ASIGNACION expresion;

asignacion_con_operacion		: IDENTIFICADOR ('+=' | '-=' | '*=' | '@=' | '/=' | '%=' | '&=' | '|=' | '^=' |'<<=' | '>>=' | '**=' | '//=') expresion;

operador_ternario				: expresion SI expresion SINO expresion;


expresion						: IDENTIFICADOR '(' parametros ')'											#etiqueta_de_llamada_a_funcion
								| izquierda=expresion operador=(DIVISION|ASTERISRCO) derecha=expresion		#etiqueta_multiplicacion_division	
								| izquierda=expresion operador=(SUMA|RESTA) derecha=expresion        		#etiqueta_suma__resta
								| PARENTESISapertura expresion PARENTESIScierre 							#etiqueta_parentesis
								| RESTA expresion  															#etiqueta_complemento_negativo
								| IDENTIFICADOR                												#etiqueta_identificador
								| TEXTO 																	#etiqueta_valor_atomico
								| ENTERO 																	#etiqueta_valor_atomico
								| DECIMAL																	#etiqueta_valor_atomico
								;