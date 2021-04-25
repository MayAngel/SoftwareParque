package views;

import controllers.CategoriaAtracaoController;
import controllers.ParqueController;
import controllers.VisitantesController;
import controllers.AtracaoController;
import models.CategoriaAtracao;
import models.Parque;
import models.Visitante;
import models.Atracao;

public class Listar {
	public static void renderizarCategoriaAtracao() {
		System.out.println("\n-- CATEGORIAS DE ATRAÇÕES --  \n");
		for(CategoriaAtracao categoriaCadastrado : CategoriaAtracaoController.listar()) {
			System.out.println(categoriaCadastrado);
		}
	}
	
	public static void renderizarParque() {
		System.out.println("\n-- PARQUES --  \n");
		for(Parque parqueCadastrado : ParqueController.listar()) {
			System.out.println(parqueCadastrado);
		}
	}
	
	public static void renderizarVisitante() {
		System.out.println("\n-- VISITANTES --  \n");
		for(Visitante visitanteCadastrado : VisitantesController.listar()) {
			System.out.println(visitanteCadastrado);
		}
	}
	
	public static void renderizarAtracao() {
		System.out.println("\n-- ATRAÇÕES --  \n");
		for(Atracao atracaoCadastrado : AtracaoController.listar()) {
			System.out.println(atracaoCadastrado);
		}
	}
	
}
