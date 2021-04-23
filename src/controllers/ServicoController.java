package controllers;

import java.util.ArrayList;

import models.Servico;


public class ServicoController {

	private static ArrayList <Servico> servicos = new ArrayList <Servico>();
	
	public static ArrayList<Servico> listar(){
		return servicos;
	}
	
	
	public static boolean cadastrar(Servico servico) {	
		for (Servico servicoCadastrado: servicos) {			
			if(servicoCadastrado.getNome().equals(servico.getNome())) {	
				return false;					
			}
		}	
		servicos.add(servico);
		return true;
	}	
	
}
