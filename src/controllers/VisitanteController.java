package controllers;

import java.util.ArrayList;

import Interfaces.IVisitante;
import models.Visitante;

public class VisitanteController implements IVisitante{
	//Singleton
			private static VisitanteController controller;	
			public static  VisitanteController retornarInstancia() {
				if(controller  == null) {
					controller = new VisitanteController();
				}
				return controller;
			}	
	private static Visitante objeto;
	private ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
	
	@Override
	public ArrayList<Visitante> listar() {
		return visitantes;
	}
	@Override
	public boolean cadastrar(Visitante visitante) {
		for (Visitante visitanteCadastrado : visitantes) {
			if(visitanteCadastrado.getCpf().equals(visitante.getCpf())) {
				return false;
			}
		}
		visitantes.add(visitante);
		return true;
	}
	@Override
	public Visitante getVisitante(int id) {
		for (Visitante idVisitante : visitantes) {
			if(idVisitante.getId() == id) {
				objeto = idVisitante;
			} else {
				objeto = null;
			}
		}	
		return objeto;
	}
	
	

}