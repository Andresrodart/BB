lexer grammar reglas_lexicas;
/*******************************************
		Reglas del analizador lexico		
********************************************/

fragment DIGITO					: [0-9];
fragment MINÚSCULA 				: [a-z\u00E1\u00E9\u00ED\u00F3\u00FA\u00FC\u00F1];
/* Letras minúscuilas inlcuyendo: á, é, í, ó, ú, ü, ñ */
fragment MAYÚSCULA 				: [A-Z\u00C1\u00C9\u00CD\u00D3\u00DA\u00DC\u00D1];
fragment COMENTARIO				: '#' ~[\r\n\f]*;
fragment ESPACIOS				: [ \t]+;

TIPO							: 'entero' | 'texto' | 'decimal';
IDENTIFICADOR					: (MINÚSCULA|MAYÚSCULA|'_')+ (MINÚSCULA|MAYÚSCULA|DIGITO|'_')*; 
TEXTO 							: '\''.*?'\''; 
/*		Literales		*/ 

ENTERO 							: DIGITO+; 
DECIMAL 						: DIGITO*'.'DIGITO+;

/*		Operadores		*/ 
SUMA               				: '+' ;
RESTA              				: '-' ;
ASTERISRCO         				: '*' ;
DIVISION           				: '/' ;
ASIGNACION         				: '=' ;
PARENTESISapertura 				: '(' ;
PARENTESIScierre   				: ')' ;

SALTO_DE_LINEA		            : '\r\n' | 'r' | '\n' ;
TABULACION                 		: [\t]+ ;
WHITESPACE 						: ' ' -> skip ;