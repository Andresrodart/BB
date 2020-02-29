/* Analizador léxico para BB */

%{
/* importar libreria para el uso de atof() */
#include <math.h>
%}

DIGITO		[0-9]
ID			[a-z][a-z0-9]*

%%

{DIGITO}+					   				{
												printf( "Un entero: %s (%d)\n", yytext,
													atoi( yytext ) );
											}

{DIGITO}+"."{DIGITO}*       				{
												printf( "Un floatante: %s (%g)\n", yytext,
														atof( yytext ) );
											}

si|entonces|itera|de|hasta|mientras|Verdad|Falso|def|no		{
												printf( "Una palabra reservada: %s\n", yytext );
											}

{ID}										printf( "Un identificador: %s\n", yytext );

"+"|"-"|"*"|"/"|"<"|">"					printf( "Un operador: %s\n", yytext );

"#"[^}\n]*     								/* para ignorar comentarios */

[ \t\n]+          							/* para ignorar espacios, tabulaciones y saltos de linea */

%%

int main( int argc, char * argv[] ){
	++argv, --argc;  /* skip over program name */
	if ( argc > 0 )
			yyin = fopen( argv[0], "r" );
	else
			yyin = stdin;

	yylex();
	return 0;
}