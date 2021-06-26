package views;

import controllers.CategoriaAtracaoController;
import controllers.ParqueController;
import controllers.VisitanteController;
import controllers.AtracaoController;
import models.CategoriaAtracao;
import models.Parque;
import models.Visitante;
import models.Atracao;

public class Listar {
	private static VisitanteController visitanteController = VisitanteController.retornarInstancia();
	private static ParqueController parqueController = ParqueController.retornarInstancia();
	private static AtracaoController atracaoController = AtracaoController.retornarInstancia();
	private static CategoriaAtracaoController categoriaAtracaoController = CategoriaAtracaoController.retornarInstancia();
	
	
	public static void renderizarCategoriaAtracao() {
		System.out.println("\n-- CATEGORIAS DE ATRAÇÕES --  \n");
		for(CategoriaAtracao categoriaCadastrado : categoriaAtracaoController.listar()) {
			System.out.println(categoriaCadastrado);
		}
	}
	
	public static void renderizarParque() {
		System.out.println("\n-- PARQUES --  \n");
		for(Parque parqueCadastrado : parqueController.listar()) {
			System.out.println(parqueCadastrado);
		}
	}
	
	public static void renderizarVisitante() {
		System.out.println("\n-- VISITANTES --  \n");
		for(Visitante visitanteCadastrado : visitanteController.listar()) {
			System.out.println(visitanteCadastrado);
		}
	}
	
	public static void renderizarAtracao() {
		System.out.println("\n-- ATRAÇÕES --  \n");
		for(Atracao atracaoCadastrado : atracaoController.listar()) {
			System.out.println(atracaoCadastrado);
		}
	}
	
}
