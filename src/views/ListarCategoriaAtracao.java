package views;

import controllers.CategoriaAtracaoController;
import models.CategoriaAtracao;

public class ListarCategoriaAtracao {
	public static void renderizar() {
		System.out.println("\n-- CATEGORIAS DE ATRAÇÕES --  \n");
		for(CategoriaAtracao categoriaCadastrado : CategoriaAtracaoController.listar()) {
			System.out.println(categoriaCadastrado);
		}
	}
}
