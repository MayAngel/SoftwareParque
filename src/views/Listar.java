package views;
import models.Atracao;
import models.CategoriaAtracao;
import models.Origin;
import models.Parque;
import models.Visitante;
import controllers.OriginController;

public class Listar {
	
	private static OriginController controller = OriginController.retornarInstancia();	
	
	public static void renderizarCategoriaAtracao() {
		System.out.println("\n-- CATEGORIAS DE ATRAÇÕES --  \n");
		for (Origin originCadastrada : controller.listar()) {
			if(originCadastrada instanceof CategoriaAtracao)
			System.out.println(originCadastrada);
		}
	}
	
	public static void renderizarParque() {
		System.out.println("\n-- PARQUES --  \n");
		for (Origin originCadastrada : controller.listar()) {
			if(originCadastrada instanceof Parque)
			System.out.println(originCadastrada);
		}
	}
	
	public static void renderizarVisitante() {
		System.out.println("\n-- VISITANTES --  \n");
		for (Origin originCadastrada : controller.listar()) {
			if(originCadastrada instanceof Visitante)
			System.out.println(originCadastrada);
		}
	}
	
	public static void renderizarAtracao() {
		System.out.println("\n-- ATRAÇÕES --  \n");
		for (Origin originCadastrada : controller.listar()) {
			if(originCadastrada instanceof Atracao)
			System.out.println(originCadastrada);
		}
	}
	
}
