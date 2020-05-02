// Generated from .\BB.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BBParser}.
 */
public interface BBListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BBParser#bb}.
	 * @param ctx the parse tree
	 */
	void enterBb(BBParser.BbContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#bb}.
	 * @param ctx the parse tree
	 */
	void exitBb(BBParser.BbContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado(BBParser.EnunciadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado(BBParser.EnunciadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado_simple}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado_simple(BBParser.Enunciado_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado_simple}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado_simple(BBParser.Enunciado_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado_pequegno}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado_pequegno(BBParser.Enunciado_pequegnoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado_pequegno}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado_pequegno(BBParser.Enunciado_pequegnoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado_complejo}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado_complejo(BBParser.Enunciado_complejoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado_complejo}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado_complejo(BBParser.Enunciado_complejoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado_de_eleccion}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado_de_eleccion(BBParser.Enunciado_de_eleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado_de_eleccion}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado_de_eleccion(BBParser.Enunciado_de_eleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#caso_si}.
	 * @param ctx the parse tree
	 */
	void enterCaso_si(BBParser.Caso_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#caso_si}.
	 * @param ctx the parse tree
	 */
	void exitCaso_si(BBParser.Caso_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#caso_o_si}.
	 * @param ctx the parse tree
	 */
	void enterCaso_o_si(BBParser.Caso_o_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#caso_o_si}.
	 * @param ctx the parse tree
	 */
	void exitCaso_o_si(BBParser.Caso_o_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#caso_sino}.
	 * @param ctx the parse tree
	 */
	void enterCaso_sino(BBParser.Caso_sinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#caso_sino}.
	 * @param ctx the parse tree
	 */
	void exitCaso_sino(BBParser.Caso_sinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado_mientras}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado_mientras(BBParser.Enunciado_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado_mientras}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado_mientras(BBParser.Enunciado_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#caso_mientras}.
	 * @param ctx the parse tree
	 */
	void enterCaso_mientras(BBParser.Caso_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#caso_mientras}.
	 * @param ctx the parse tree
	 */
	void exitCaso_mientras(BBParser.Caso_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#enunciado_de_flujo}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado_de_flujo(BBParser.Enunciado_de_flujoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#enunciado_de_flujo}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado_de_flujo(BBParser.Enunciado_de_flujoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_bloque_simple}
	 * labeled alternative in {@link BBParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_bloque_simple(BBParser.Etiqueta_bloque_simpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_bloque_simple}
	 * labeled alternative in {@link BBParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_bloque_simple(BBParser.Etiqueta_bloque_simpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_bloque_complejo}
	 * labeled alternative in {@link BBParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_bloque_complejo(BBParser.Etiqueta_bloque_complejoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_bloque_complejo}
	 * labeled alternative in {@link BBParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_bloque_complejo(BBParser.Etiqueta_bloque_complejoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#prueba}.
	 * @param ctx the parse tree
	 */
	void enterPrueba(BBParser.PruebaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#prueba}.
	 * @param ctx the parse tree
	 */
	void exitPrueba(BBParser.PruebaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#prueba_o}.
	 * @param ctx the parse tree
	 */
	void enterPrueba_o(BBParser.Prueba_oContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#prueba_o}.
	 * @param ctx the parse tree
	 */
	void exitPrueba_o(BBParser.Prueba_oContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#prueba_y}.
	 * @param ctx the parse tree
	 */
	void enterPrueba_y(BBParser.Prueba_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#prueba_y}.
	 * @param ctx the parse tree
	 */
	void exitPrueba_y(BBParser.Prueba_yContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_prueba_no}
	 * labeled alternative in {@link BBParser#prueba_no}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_prueba_no(BBParser.Etiqueta_prueba_noContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_prueba_no}
	 * labeled alternative in {@link BBParser#prueba_no}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_prueba_no(BBParser.Etiqueta_prueba_noContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_prueba_no_comparacion}
	 * labeled alternative in {@link BBParser#prueba_no}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_prueba_no_comparacion(BBParser.Etiqueta_prueba_no_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_prueba_no_comparacion}
	 * labeled alternative in {@link BBParser#prueba_no}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_prueba_no_comparacion(BBParser.Etiqueta_prueba_no_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(BBParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(BBParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#pareja_de_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterPareja_de_comparacion(BBParser.Pareja_de_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#pareja_de_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitPareja_de_comparacion(BBParser.Pareja_de_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#operador_de_comporacion}.
	 * @param ctx the parse tree
	 */
	void enterOperador_de_comporacion(BBParser.Operador_de_comporacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#operador_de_comporacion}.
	 * @param ctx the parse tree
	 */
	void exitOperador_de_comporacion(BBParser.Operador_de_comporacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#declaracion_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_funcion(BBParser.Declaracion_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#declaracion_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_funcion(BBParser.Declaracion_de_funcionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracion_de_variable_con_asignacion}
	 * labeled alternative in {@link BBParser#declaracion_de_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_variable_con_asignacion(BBParser.Declaracion_de_variable_con_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracion_de_variable_con_asignacion}
	 * labeled alternative in {@link BBParser#declaracion_de_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_variable_con_asignacion(BBParser.Declaracion_de_variable_con_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracion_de_variable_sin_asignacion}
	 * labeled alternative in {@link BBParser#declaracion_de_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_variable_sin_asignacion(BBParser.Declaracion_de_variable_sin_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracion_de_variable_sin_asignacion}
	 * labeled alternative in {@link BBParser#declaracion_de_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_variable_sin_asignacion(BBParser.Declaracion_de_variable_sin_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#declaracion_de_lista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_de_lista(BBParser.Declaracion_de_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#declaracion_de_lista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_de_lista(BBParser.Declaracion_de_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(BBParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(BBParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parametro_funcion}
	 * labeled alternative in {@link BBParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro_funcion(BBParser.Parametro_funcionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parametro_funcion}
	 * labeled alternative in {@link BBParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro_funcion(BBParser.Parametro_funcionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parametro_llamada}
	 * labeled alternative in {@link BBParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro_llamada(BBParser.Parametro_llamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parametro_llamada}
	 * labeled alternative in {@link BBParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro_llamada(BBParser.Parametro_llamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#parametro_imprime}.
	 * @param ctx the parse tree
	 */
	void enterParametro_imprime(BBParser.Parametro_imprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#parametro_imprime}.
	 * @param ctx the parse tree
	 */
	void exitParametro_imprime(BBParser.Parametro_imprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(BBParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(BBParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#asignar_a_variable}.
	 * @param ctx the parse tree
	 */
	void enterAsignar_a_variable(BBParser.Asignar_a_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#asignar_a_variable}.
	 * @param ctx the parse tree
	 */
	void exitAsignar_a_variable(BBParser.Asignar_a_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#asignacion_con_operacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_con_operacion(BBParser.Asignacion_con_operacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#asignacion_con_operacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_con_operacion(BBParser.Asignacion_con_operacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#operador_ternario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_ternario(BBParser.Operador_ternarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#operador_ternario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_ternario(BBParser.Operador_ternarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link BBParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(BBParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BBParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(BBParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_multiplicacion_division}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_multiplicacion_division(BBParser.Etiqueta_multiplicacion_divisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_multiplicacion_division}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_multiplicacion_division(BBParser.Etiqueta_multiplicacion_divisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_valor_texto}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_valor_texto(BBParser.Etiqueta_valor_textoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_valor_texto}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_valor_texto(BBParser.Etiqueta_valor_textoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_suma__resta}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_suma__resta(BBParser.Etiqueta_suma__restaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_suma__resta}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_suma__resta(BBParser.Etiqueta_suma__restaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_imprime}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_imprime(BBParser.Etiqueta_imprimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_imprime}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_imprime(BBParser.Etiqueta_imprimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_parentesis}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_parentesis(BBParser.Etiqueta_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_parentesis}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_parentesis(BBParser.Etiqueta_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_identificador}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_identificador(BBParser.Etiqueta_identificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_identificador}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_identificador(BBParser.Etiqueta_identificadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_complemento_negativo}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_complemento_negativo(BBParser.Etiqueta_complemento_negativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_complemento_negativo}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_complemento_negativo(BBParser.Etiqueta_complemento_negativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_de_llamada_a_funcion}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_de_llamada_a_funcion(BBParser.Etiqueta_de_llamada_a_funcionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_de_llamada_a_funcion}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_de_llamada_a_funcion(BBParser.Etiqueta_de_llamada_a_funcionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etiqueta_valor_atomico}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEtiqueta_valor_atomico(BBParser.Etiqueta_valor_atomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etiqueta_valor_atomico}
	 * labeled alternative in {@link BBParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEtiqueta_valor_atomico(BBParser.Etiqueta_valor_atomicoContext ctx);
}