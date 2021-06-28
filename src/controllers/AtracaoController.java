package controllers;

import java.util.ArrayList;

import Interfaces.IAtracao;
import models.Atracao;

public class AtracaoController implements IAtracao{
	
	//Singleton
			private static AtracaoController controller;	
			public static  AtracaoController retornarInstancia() {
				if(controller  == null) {
					controller = new AtracaoController();
				}
				return controller;
			}
			
			
	private ArrayList<Atracao> atracoes = new ArrayList<Atracao>();
	private  static Atracao objeto;
	@Override
	public ArrayList<Atracao> listar() {
		return atracoes;
	}
	@Override
	public boolean cadastrar(Atracao atracao) {
		for (Atracao atracaoCadastrado : atracoes) {
			if(atracaoCadastrado.getNome().equals(atracao.getNome())) {
				return false;
			}
		}
		atracoes.add(atracao);
		return true;
	}
	@Override
	public Atracao getAtracao(int num) {
		for (Atracao idAtracao : atracoes) {
			if(idAtracao.getId() == num) {
				objeto = idAtracao;
			} else {
				objeto = null;
			}
		}	
		return objeto;
	}
	
	
}
