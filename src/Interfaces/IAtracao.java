package Interfaces;

import java.util.ArrayList;

import models.Atracao;

public interface IAtracao {
	public ArrayList<Atracao> listar();
	public boolean cadastrar(Atracao atracao);
	public Atracao getAtracao(int num);
	

}
