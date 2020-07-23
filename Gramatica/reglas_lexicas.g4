lexer grammar reglas_lexicas;
/*******************************************
		Reglas del analizador lexico		
********************************************/

fragment DIGITO					: [0-9];
fragment EXPONENCIAL			: [Ee] [+\-]? DIGITO; 
/* Letras minúscuilas inlcuyendo: á, é, í, ó, ú, ü, ñ */
fragment MINÚSCULA 				: [a-z]|'\u00E1'|'\u00E9'|'\u00ED'|'\u00F3'|'\u00FA'|'\u00FC'|'\u00F1';
fragment MAYÚSCULA 				: [A-Z]|'\u00C1'|'\u00C9'|'\u00D3'|'\u00DA'|'\u00DC'|'\u00D1';
fragment ESPACIOS				: [ \t]+;
fragment ESC 					: '\\"' | '\\\\';
/* Palabras reservadas */
PUBLICO							: 'público';
PRIVADO							: 'privado';
PROTEGIDO						: 'protegido';
HEREDA							: 'hereda';
OBJETO							: 'objeto';
PARA							: 'para';
HASTA							: 'hasta';
INCREMENTANDO					: 'incrementando';
/*  Operadores lógicos	*/
SI								: 'si';
ES								: 'es';
O_SI							: 'o si';
SINO							: 'sino';
NO								: 'no';
O								: 'o';
Y								: 'y';
ES_IGUAL						: '==' | ES;
OP_LOGICO						: '<'|'>'|'>='|'<='|'!=' | NO | O | Y | ES_IGUAL |NO 'es';
PARENTESISapertura 				: '(' ;
PARENTESIScierre   				: ')' ;

/*Operadores artiméticos*/ 
SUMA               				: '+' ;
RESTA              				: '-' ;
ASTERISRCO         				: '*' ;
DIVISION           				: '/' ;
ASIGNACION         				: '=' ;
POTENCIA         				: '^' ;

/*		Literales		*/ 

ENTERO 							: '-'? DIGITO+; 
DECIMAL 						: '-'? DIGITO*'.'DIGITO+;
VERDAD							: 'verdad';
FALSO							: 'falso';

TIPO							: 'entero' | 'texto' | 'decimal' | 'lista' | 'nada' | 'constructor';
TEXTO 							: '\''(ESC|.)*?'\''|'"' (ESC|.)*? '"' ; 
IDENTIFICADOR					: (MINÚSCULA|MAYÚSCULA|'_')+ (MINÚSCULA|MAYÚSCULA|DIGITO|'_')*;
METODO							: '.'IDENTIFICADOR; 

COMENTARIO						: '/*' .*? '*/' -> channel(HIDDEN);
TABULACION                 		: [\t]+;
SALTO_DE_LINEA		            : ( {atStartOfInput()}? ESPACIOS | ( '\r'? '\n' | '\r' | '\f' ) ESPACIOS?)
									{
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
									}
								;

IGNORA_							: ESPACIOS  -> skip;