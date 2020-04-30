import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.StringJoiner;

/**
 * BB2CPP
 */
public class BB2CPP {
	public static class EmisorCPP extends BBBaseListener{
		ParseTreeProperty<String> cpp = new ParseTreeProperty<String>();
		String getSTR(ParseTree ctx) { return cpp.get(ctx); }
		void setSTR(ParseTree ctx, String s) { cpp.put(ctx, s); }
		public void exitBb(BBParser.BbContext ctx){
			StringJoiner buf =  new StringJoiner(""); 
			for (int i = 0; i < ctx.getChildCount(); i++)
				buf.add(getSTR(ctx.getChild(i)));
			setSTR(ctx, buf.toString());
		}
		public void exitEnunciado(BBParser.EnunciadoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEnunciado_simple(BBParser.Etiqueta_enunciado_simpleContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEnunciado_pequegno(BBParser.Enunciado_pequegnoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEnunciado_complejo(BBParser.Enunciado_complejoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEnunciado_de_eleccion(BBParser.Enunciado_de_eleccionContext ctx) {
			StringJoiner buf =  new StringJoiner("\n"); 
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
			StringJoiner buf =  new StringJoiner("\n"); 
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
		public void exitEnunciado_de_flujo(BBParser.Enunciado_de_flujoContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEtiqueta_bloque_simple(BBParser.Etiqueta_bloque_simpleContext ctx) {
			setSTR(ctx, getSTR(ctx.getChild(0)));
		}
		public void exitEtiqueta_bloque_complejo(BBParser.Etiqueta_bloque_complejoContext ctx) {
			StringJoiner buf =  new StringJoiner("");
			buf.add("{\n");
			for(BBParser.EnunciadoContext ectx: ctx.enunciado()){
				buf.add("\t");
				buf.add(getSTR(ectx));
				buf.add("\n");
			}
			buf.add("}");
			setSTR(ctx, buf.toString());
		}
		public void exitPrueba(BBParser.PruebaContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				String res = '(' + getSTR(ctx.prueba_ternaria) + ")?" + 
					getSTR(ctx.getChild(0)) + ":" + 
					getSTR(ctx.respuesta_ternaria) + ';';
				setSTR(ctx, res);
			}
		}
		public void exitPrueba_o(BBParser.Prueba_oContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				StringJoiner buf =  new StringJoiner(" ");
				List<String> lis = new ArrayList<String>(); 
				for(BBParser.Prueba_yContext pctx: ctx.prueba_y())
					lis.append(getSTR(pctx));
				buf.add(lis.get(0));
				for (int i = 1; i < lis.length; i++) {
					buf.add("||");
					buf.add(lis.get(i));
				}
				setSTR(ctx, buf.toString());
			}
		}
		public void exitPrueba_y(BBParser.Prueba_yContext ctx) {
			if(ctx.getChildCount() == 1){
				setSTR(ctx, getSTR(ctx.getChild(0)));
			}else{
				StringJoiner buf =  new StringJoiner(" ");
				List<String> lis = new ArrayList<String>(); 
				for(BBParser.Etiqueta_prueba_noContext pctx: ctx.prueba_no())
					lis.append(getSTR(pctx));
				buf.add(lis.get(0));
				for (int i = 1; i < lis.length; i++) {
					buf.add("&&");
					buf.add(lis.get(i));
				}
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
		public void exitDeclaracion_de_funcion(BBParser.Declaracion_de_funcionContext ctx) {
			BBParser.BloqueContext bctx = ctx.bloque();
			StringJoiner buf =  new StringJoiner(" ");
			buf.add(ctx.tipo.getText());
			buf.add(ctx.id.getText());
			buf.add("(");
			for(BBParser.ParametrosContext pctx: ctx.parametros())
				buf.add(getSTR(pctx));
			buf.add(")");
			buf.add(getSTR(bctx));
			setSTR(ctx, buf.toString());
		}
		public void exitDeclaracion_de_variable_con_asignacion(BBParser.Declaracion_de_variable_con_asignacionContext ctx) {
			String res = ctx.tipo.getText() + " " +  getSTR(ctx.asignar_a_variable()) + ';';
			setSTR(ctx, res);
		}
		public void exitDeclaracion_de_variable_sin_asignacion(BBParser.Declaracion_de_variable_sin_asignacionContext ctx) {
			String res = ctx.tipo.getText() + " " +  ctx.id.getText() + ';';
			setSTR(ctx, res);
		}
		public void exitDeclaracion_de_lista(BBParser.Declaracion_de_listaContext ctx) { }
	
	
	}	
}