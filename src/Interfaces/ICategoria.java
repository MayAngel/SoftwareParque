package Interfaces;

import java.util.ArrayList;

import models.CategoriaAtracao;

public interface ICategoria {
	public ArrayList<CategoriaAtracao> listar();
	public boolean cadastrar(CategoriaAtracao categoriaAtracao);
	public CategoriaAtracao getCategoriaAtracao(int id);
}
