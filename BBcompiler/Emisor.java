package BBcompiler;

import org.antlr.v4.runtime.tree.*;
import java.util.StringJoiner;
import java.text.Normalizer;
import java.util.Hashtable;

public class Emisor extends BBBaseListener{
	/*Tabla para mantener registro de vasriables y su tipo de dato */
	private Hashtable<String, String> tipo_de_dato = new Hashtable<String, String>();
	/**Tabla para recuperar instancias de hojas en el árbol sintáctico */
	private ParseTreeProperty<String> cpp = new ParseTreeProperty<String>();
	public String getSTR(ParseTree ctx) { return cpp.get(ctx); }
	private void setSTR(ParseTree ctx, String s) { cpp.put(ctx, s); }
	/**Función para dar formato al código resultado */
	private String tab(String s){
		int identLevel = 0;
		StringBuilder res = new StringBuilder();
		String tab = "\t";
		for (int i = 0; i < s.length() - 1; i++) {
			res.append(s.charAt(i));
			if (s.charAt(i) == '{') identLevel++;
			else if (s.charAt(i + 1) == '}') identLevel--;
			if (s.charAt(i) == '\n') res.append(tab.repeat(identLevel));
		}
		return res.toString();
	}
	/**Mapa de tipos de datos */
	private String getTipo(String tipo){
		switch (tipo) {
			case "entero":	return "int64_t";
			case "texto": 	return "std::wstring";
			case "decimal":	return "double";
			case "nada":	return "void";
			case "privado":	return "private";
			case "protegido": return "protected";
			case "constructor": return "";
			default: return "public";
		}
	}
	/**Mapa de tipos de datos */
	private String getMetodoMiembro(BBParser.MetodoContext ctx){
		String nString = Normalizer.normalize(ctx.METODO().getText() , Normalizer.Form.NFD);
		nString = nString.replaceAll("[^\\p{ASCII}]", "");
		switch (nString) {
			case ".agrega":	return ".push_back";
			case ".desencola": 	return ".pop_front";
			case ".desapila":	return ".pop_back";
			case ".tamano": return ".size";
			case ".frente":	return ".front()";
			case ".cola": return ".back()";
			default: return ctx.METODO().getText();
		}
	}
	public void exitBb(BBParser.BbContext ctx){
		StringJoiner buf =  new StringJoiner(""); 
		for(BBParser.EnunciadoContext ectx: ctx.enunciado()) buf.add(getSTR(ectx));
		setSTR(ctx, tab(buf.toString()));
	}
	
	public void exitEnunciado(BBParser.EnunciadoContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)) + '\n');
	}
	
	public void exitEnunciado_simple(BBParser.Enunciado_simpleContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)) + ";");
	}
	public void exitEnunciado_pequegno(BBParser.Enunciado_pequegnoContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitEnunciado_complejo(BBParser.Enunciado_complejoContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitEnunciado_objeto(BBParser.Enunciado_objetoContext ctx) { 
		StringJoiner buf =  new StringJoiner("");
		buf.add(getTipo(ctx.tipo.getText()) + " :\n");
		for(BBParser.EnunciadoContext ectx: ctx.enunciado()) buf.add(getSTR(ectx));
		setSTR(ctx, buf.toString());
	}
	public void exitEnunciado_de_eleccion(BBParser.Enunciado_de_eleccionContext ctx) {
		StringJoiner buf =  new StringJoiner(""); 
		for (int i = 0; i < ctx.getChildCount(); i++)
			buf.add(getSTR(ctx.getChild(i)));
		setSTR(ctx, buf.toString());
	}
	public void exitCaso_si(BBParser.Caso_siContext ctx) {
		BBParser.PruebaContext pctx = ctx.prueba();
		BBParser.BloqueContext bctx = ctx.bloque();
		String res = "if(" + getSTR(pctx)  + ')' + getSTR(bctx);
		setSTR(ctx, res);
	}
	public void exitCaso_o_si(BBParser.Caso_o_siContext ctx) {
		BBParser.PruebaContext pctx = ctx.prueba();
		BBParser.BloqueContext bctx = ctx.bloque();
		String res = "else if(" + getSTR(pctx)  + ')' + getSTR(bctx);
		setSTR(ctx, res);
	}
	public void exitCaso_sino(BBParser.Caso_sinoContext ctx) {
		BBParser.BloqueContext bctx = ctx.bloque();
		String res = "else" + getSTR(bctx);
		setSTR(ctx, res);
	}
	public void exitEnunciado_mientras(BBParser.Enunciado_mientrasContext ctx) {
		StringJoiner buf =  new StringJoiner(""); 
		for (int i = 0; i < ctx.getChildCount(); i++)
			buf.add(getSTR(ctx.getChild(i)));
		setSTR(ctx, buf.toString());
	}
	public void exitCaso_mientras(BBParser.Caso_mientrasContext ctx) {
		BBParser.PruebaContext pctx = ctx.prueba();
		BBParser.BloqueContext bctx = ctx.bloque();
		String res = "while(" + getSTR(pctx)  + ')' + getSTR(bctx);
		setSTR(ctx, res);
	}
	public void exitEnunciado_para(BBParser.Enunciado_paraContext ctx) { 
		//BBParser.PruebaContext pctx = ctx.prueba();
		BBParser.BloqueContext bctx = ctx.bloque();
		String res = "for(" + getSTR(ctx.iterador)  + "; " + getSTR(ctx.prueba()) + "; " + getSTR(ctx.iterador).split(" ")[1] + " += " + getSTR(ctx.incremento) +')' + getSTR(bctx);
		setSTR(ctx, res);
	}
	public void exitEnunciado_de_flujo(BBParser.Enunciado_de_flujoContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitObjeto(BBParser.ObjetoContext ctx) { 
		StringJoiner buf =  new StringJoiner(" ");
		BBParser.BloqueContext bctx = ctx.bloque();
		buf.add("class");
		buf.add(getSTR(ctx.id));
		String id_padre = getSTR(ctx.id_h);
		if (id_padre != null) {
			buf.add(":");
			buf.add("public");
			buf.add(id_padre);
		}
		buf.add(getSTR(bctx) + ';');
		setSTR(ctx, buf.toString());
	}
	public void exitEtiqueta_bloque_simple(BBParser.Etiqueta_bloque_simpleContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitEtiqueta_bloque_complejo(BBParser.Etiqueta_bloque_complejoContext ctx) {
		StringJoiner buf =  new StringJoiner("");
		buf.add("{\n");
		for(BBParser.EnunciadoContext ectx: ctx.enunciado())
			buf.add(getSTR(ectx));
		buf.add("}");
		setSTR(ctx, buf.toString());
	}
	public void exitPrueba(BBParser.PruebaContext ctx) {
		if(ctx.getChildCount() == 1){
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}else{
			String res = '(' + getSTR(ctx.prueba_ternaria) + ")?" + 
				getSTR(ctx.getChild(0)) + ":" + 
				getSTR(ctx.respuesta_ternaria);
			setSTR(ctx, res);
		}
	}
	public void exitPrueba_o(BBParser.Prueba_oContext ctx) {
		if(ctx.getChildCount() == 1){
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}else{
			StringJoiner buf =  new StringJoiner(" || ");
			for(BBParser.Prueba_yContext pctx: ctx.prueba_y())
				buf.add(getSTR(pctx));
			setSTR(ctx, buf.toString());
		}
	}
	public void exitPrueba_y(BBParser.Prueba_yContext ctx) {
		if(ctx.getChildCount() == 1){
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}else{
			StringJoiner buf =  new StringJoiner(" && ");
			for(BBParser.Prueba_noContext pctx: ctx.prueba_no())
				buf.add(getSTR(pctx));
			setSTR(ctx, buf.toString());
		}
	}
	public void exitEtiqueta_prueba_no(BBParser.Etiqueta_prueba_noContext ctx) {
		String res = "!(" + getSTR(ctx.prueba_no()) + ")";
		setSTR(ctx, res);
	}
	public void exitEtiqueta_prueba_no_comparacion(BBParser.Etiqueta_prueba_no_comparacionContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitComparacion(BBParser.ComparacionContext ctx) {
		if(ctx.getChildCount() == 1){
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}else{
			StringJoiner buf =  new StringJoiner(" ");
			buf.add(getSTR(ctx.expresion()));
			for(BBParser.Pareja_de_comparacionContext pctx: ctx.pareja_de_comparacion())
				buf.add(getSTR(pctx));
			setSTR(ctx, buf.toString());
		}
	}
	public void exitPareja_de_comparacion(BBParser.Pareja_de_comparacionContext ctx) {
		String res = getSTR(ctx.operador_de_comporacion()) + " " +  getSTR(ctx.expresion());
		setSTR(ctx, res);
	}
	public void exitOperador_de_comporacion(BBParser.Operador_de_comporacionContext ctx) {
		setSTR(ctx, ctx.getText());
	}
	public void exitFuncion_recibe(BBParser.Funcion_recibeContext ctx) { 
		StringJoiner buf =  new StringJoiner("\n");
		StringBuilder cinner =  new StringBuilder();
		try {
			buf.add("std::wcout << " + ctx.mensaje.getText().replace("\'", "\"") + ";");
		} catch (Exception e) {}
		cinner.append("std::wcin ");
		try {
			for (String newElement : getSTR(ctx.parametros()).split(",")) {
				if(newElement.trim().split(" ").length >= 2){
					cinner.append( " >> " + newElement.trim().split(" ")[1]);
					buf.add(newElement.trim() + ";");
				}
				else cinner.append( " >> " + newElement.trim().split(" ")[0]);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		buf.add(cinner.toString());
		setSTR(ctx, buf.toString());
	}
	public void exitMetodo(BBParser.MetodoContext ctx) { 
		StringBuilder buf = new StringBuilder(getMetodoMiembro(ctx));
		if(getSTR(ctx.metodo_miembro()) != null) buf.append(getSTR(ctx.metodo_miembro()));
		setSTR(ctx, buf.toString());
	}
	public void exitMetodo_miembro(BBParser.Metodo_miembroContext ctx) {
		StringBuilder buf = new StringBuilder();
		buf.append("(");
		if(getSTR(ctx.parametros()) != null) buf.append(getSTR(ctx.parametros()));
		buf.append(")");
		setSTR(ctx, buf.toString());
	}
	public void exitLlamada_a_metodo(BBParser.Llamada_a_metodoContext ctx) { 
		StringBuilder buf = new StringBuilder(ctx.IDENTIFICADOR().getText());
		for (BBParser.MetodoContext metodo : ctx.metodo()) buf.append(getSTR(metodo));
		setSTR(ctx, buf.toString());
	}
	public void exitEtiqueta_de_llamada_a_metodo(BBParser.Etiqueta_de_llamada_a_metodoContext ctx) { 
		setSTR(ctx, getSTR(ctx.llamada_a_metodo()));
	}
	public void exitDeclaracion_de_funcion(BBParser.Declaracion_de_funcionContext ctx) {
		BBParser.BloqueContext bctx = ctx.bloque();
		StringJoiner buf =  new StringJoiner(" ");
		String tipo = getTipo(ctx.tipo.getText());
		if(getSTR(ctx.identificador()).equalsIgnoreCase("main")) buf.add("int");
		else buf.add(tipo);
		buf.add(getSTR(ctx.identificador()));
		buf.add("(");
		try {
			String parametros = getSTR(ctx.parametros());
			if(getSTR(ctx.identificador()).equalsIgnoreCase("main"))
				buf.add("int argc, char const *argv[]");
			else if(!parametros.equalsIgnoreCase("null")) buf.add(parametros);
		} catch (Exception e) {
			//TODO: handle exception
		}
		buf.add(")");
		if(getSTR(ctx.identificador()).equalsIgnoreCase("main")) buf.add("{\n#ifdef _WIN32\n_setmode(_fileno(stdout), 0x00020000);\n_setmode( _fileno(stdin), 0x00020000 );\n#endif\n#ifdef linux\nstd::wcout.sync_with_stdio(false);\nstd::wcout.imbue(std::locale(\"en_US.utf8\"));\nwcin.imbue(std::locale());\n#endif\n" + getSTR(bctx).substring(1));
		else buf.add(getSTR(bctx));
		setSTR(ctx, buf.toString().trim());
	}
	public void exitDeclaracion_de_variable_con_asignacion(BBParser.Declaracion_de_variable_con_asignacionContext ctx) {
		String tipo = getTipo(ctx.tipo.getText());
		String res = tipo + " " +  getSTR(ctx.asignar_a_variable());
		tipo_de_dato.put(getSTR(ctx.asignar_a_variable().identificador()), ctx.tipo.getText());
		setSTR(ctx, res);
	}
	public void exitDeclaracion_de_variable_sin_asignacion(BBParser.Declaracion_de_variable_sin_asignacionContext ctx) {
		String tipo = getTipo(ctx.tipo.getText());
		String res = tipo + " " +  getSTR(ctx.identificador());
		tipo_de_dato.put(getSTR(ctx.identificador()), ctx.tipo.getText());
		setSTR(ctx, res);
	}
	public void exitDeclaracion_de_lista(BBParser.Declaracion_de_listaContext ctx) {
		StringJoiner buf =  new StringJoiner(" ");
		String tipo = getTipo(ctx.tipo.getText());
		buf.add("std::deque<" + tipo + "> " +  getSTR(ctx.identificador()));
		if(ctx.getChildCount() > 5){
			buf.add("{");
			StringJoiner par =  new StringJoiner(", ");
			for(BBParser.ExpresionContext ectx: ctx.expresion())
				par.add(getSTR(ectx));
			buf.add(par.toString().trim());
			buf.add("}");
		}
		tipo_de_dato.put(getSTR(ctx.identificador()), "lista");
		setSTR(ctx, buf.toString());
	}
	public void exitParametros(BBParser.ParametrosContext ctx) {
		StringJoiner buf =  new StringJoiner(", ");
		for(BBParser.ParametroContext pctx: ctx.parametro())
			buf.add(getSTR(pctx));
		setSTR(ctx, buf.toString());
	}
	public void exitParametro_funcion(BBParser.Parametro_funcionContext ctx) {
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitParametro_lista(BBParser.Parametro_listaContext ctx) { 
		setSTR(ctx, getSTR(ctx.getChild(0)));
	}
	public void exitParametro_llamada(BBParser.Parametro_llamadaContext ctx) {
		setSTR(ctx, getSTR(ctx.expresion()));
	}
	public void exitRetorno(BBParser.RetornoContext ctx) {
		BBParser.ExpresionContext ectx = ctx.expresion();
		String res = "return " +  getSTR(ectx);
		setSTR(ctx, res);
	}
	public void exitAsignar_a_variable(BBParser.Asignar_a_variableContext ctx) {
		BBParser.ExpresionContext ectx = ctx.expresion();
		String res = getSTR(ctx.identificador()) + " = " + getSTR(ectx);
		setSTR(ctx, res);
	}
	public void exitAsignacion_con_operacion(BBParser.Asignacion_con_operacionContext ctx) {
		BBParser.ExpresionContext ectx = ctx.expresion();
		String res = getSTR(ctx.identificador()) + ctx.op.getText() + getSTR(ectx);
		setSTR(ctx, res);
	}
	public void exitOperador_ternario(BBParser.Operador_ternarioContext ctx) {
		String res = '(' + getSTR(ctx.prueba_ternaria) + ")?" + 
			getSTR(ctx.getChild(0)) + ":" + 
			getSTR(ctx.respuesta_ternaria) + ';';
		setSTR(ctx, res);
	}
	public void exitEtiqueta_multiplicacion_division(BBParser.Etiqueta_multiplicacion_divisionContext ctx) {
		String res = getSTR(ctx.izquierda) + ctx.operador.getText() + getSTR(ctx.derecha);
		setSTR(ctx, res);
	}
	public void exitEtiqueta_suma__resta(BBParser.Etiqueta_suma__restaContext ctx){
		String res = getSTR(ctx.izquierda) + ctx.operador.getText() + getSTR(ctx.derecha);
		setSTR(ctx, res);
	}
	public void exitEtiqueta_parentesis(BBParser.Etiqueta_parentesisContext ctx) {
		String res = "(" + getSTR(ctx.expresion()) + ")";
		setSTR(ctx, res);
	}
	public void exitEtiqueta_identificador(BBParser.Etiqueta_identificadorContext ctx) {
		setSTR(ctx, ctx.getText().replaceAll("[^a-zA-Z0-9]", "_"));
	}
	public void exitIdentificador(BBParser.IdentificadorContext ctx) {
		if(ctx.getText().compareTo("principal") == 0) setSTR(ctx, "main");
		else setSTR(ctx, ctx.getText().replaceAll("[^a-zA-Z0-9]", "_"));
	}
	public void exitEtiqueta_complemento_negativo(BBParser.Etiqueta_complemento_negativoContext ctx) {
		setSTR(ctx, ctx.getText());
	}
	public void exitEtiqueta_de_llamada_a_funcion(BBParser.Etiqueta_de_llamada_a_funcionContext ctx) {
		BBParser.ParametrosContext pctx = ctx.parametros();
		BBParser.IdentificadorContext ictx = ctx.identificador();
		if(getSTR(ictx).equals("imprime")){
			StringJoiner buf =  new StringJoiner(" ");
			buf.add("std::wcout << ");
			buf.add(getSTR(pctx).replaceAll(",", " << \" \" <<"));
			buf.add(" << std::endl");
			setSTR(ctx, buf.toString());	
		}else if(getSTR(ictx).equals("recibe")){
			StringJoiner buf =  new StringJoiner(" ");
			buf.add("std::cin >> ");
			buf.add(getSTR(pctx).replaceAll(",", " >> "));
			setSTR(ctx, buf.toString());
		}
		else{
			String res = getSTR(ctx.identificador()) + "( " + 
				((getSTR(pctx) == null)? "":getSTR(pctx) )
			+ " )";
			setSTR(ctx, res);
		}
	}
	public void exitEtiqueta_valor_atomico(BBParser.Etiqueta_valor_atomicoContext ctx) {
		setSTR(ctx, ctx.getText());
	}
	public void exitEtiqueta_valor_atomico_verdad(BBParser.Etiqueta_valor_atomico_verdadContext ctx) { 
		setSTR(ctx, "True");
	}
	public void exitEtiqueta_valor_atomico_falso(BBParser.Etiqueta_valor_atomico_falsoContext ctx) { 
		setSTR(ctx, "False");
	}
	public void exitEtiqueta_valor_texto(BBParser.Etiqueta_valor_textoContext ctx) {
		setSTR(ctx, "L" + ctx.getText().replaceAll("'", "\""));
	}
}