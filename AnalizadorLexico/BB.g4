grammar BB;
import reglas_lexicas; //Reglas del analizador lexicográfico
/************************
	Reglas del Parser
*************************/
bb								: linea+;		

linea      						: enunciado (SALTO_DE_LINEA | EOF);

enunciado	 					: declaracion_de_variable 											#etiqueta_declaracion_de_variable
								| asignar_a_variable												#etiqueta_asignar_a_variable
								;	

declaracion_de_variable			: TIPO asignar_a_variable;

asignar_a_variable				: IDENTIFICADOR ASIGNACION expresion;

expresion						: izquierda=expresion operador=(DIVISION|ASTERISRCO) derecha=expresion		#etiqueta_multiplicacion_division	
								| izquierda=expresion operador=(SUMA|RESTA) derecha=expresion        		#etiqueta_suma__resta
								| PARENTESISapertura expresion PARENTESIScierre 					#etiqueta_parentesis
								| TEXTO 															#etiqueta_texto
								| IDENTIFICADOR                										#etiqueta_identificador
								| RESTA expresion  													#etiqueta_negacion
								| ENTERO 															#etiqueta_entero
								| DECIMAL															#etiqueta_decimal
								;																	