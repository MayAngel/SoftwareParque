package controllers;
import java.util.ArrayList;
import models.CategoriaAtracao;

public class CategoriaAtracaoController {
	
	private static ArrayList<CategoriaAtracao> categorias = new ArrayList<CategoriaAtracao>();
	private static CategoriaAtracao objeto;
	
	public static ArrayList<CategoriaAtracao> listar() {
		return categorias;
	}
	
	public static boolean cadastrar(CategoriaAtracao categoriaAtracao) {
		for (CategoriaAtracao categoriaCadastrado : categorias) {
			if(categoriaCadastrado.getNome().equals(categoriaAtracao.getNome())) {
				return false;
			}
		}
		categorias.add(categoriaAtracao);
		return true;
	}

	public static CategoriaAtracao getCategoriaAtracao(int id) {
		for (CategoriaAtracao idCategoria : categorias) {
			if(idCategoria.getId() == id) {
				objeto = idCategoria;
			} else {
				objeto = null;
			}
		}	
		return objeto;
	}

}
