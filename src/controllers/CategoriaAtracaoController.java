package controllers;
import java.util.ArrayList;

import Interfaces.ICategoria;
import models.CategoriaAtracao;

public class CategoriaAtracaoController implements ICategoria{
	//Singleton
	private static CategoriaAtracaoController controller;	
	public static  CategoriaAtracaoController retornarInstancia() {
		if(controller  == null) {
			controller = new CategoriaAtracaoController();
		}
		return controller;
	}	
	private static CategoriaAtracao objeto;
	private static ArrayList<CategoriaAtracao> categorias = new ArrayList<CategoriaAtracao>();
	
	@Override
	public ArrayList<CategoriaAtracao> listar() {
		return categorias;
	}
	@Override
	public boolean cadastrar(CategoriaAtracao categoriaAtracao) {
		for (CategoriaAtracao categoriaCadastrado : categorias) {
			if(categoriaCadastrado.getNome().equals(categoriaAtracao.getNome())) {
				return false;
			}
		}
		categorias.add(categoriaAtracao);
		return true;
	}
	@Override
	public CategoriaAtracao getCategoriaAtracao(int id) {
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
