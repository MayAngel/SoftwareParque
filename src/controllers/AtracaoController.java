package controllers;

import java.util.ArrayList;
import models.Atracao;

public class AtracaoController {
	
	private static ArrayList<Atracao> atracoes = new ArrayList<Atracao>();
	private  static Atracao objeto;
	
	public static ArrayList<Atracao> listar() {
		return atracoes;
	}
	
	public static boolean cadastrar(Atracao atracao) {
		for (Atracao atracaoCadastrado : atracoes) {
			if(atracaoCadastrado.getNome().equals(atracao.getNome())) {
				return false;
			}
		}
		atracoes.add(atracao);
		return true;
	}
	
	public static Atracao getAtracao(int num) {
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
