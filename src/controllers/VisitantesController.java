package controllers;

import java.util.ArrayList;

import models.Visitante;

public class VisitantesController {
	
	private static ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
	private static Visitante objeto;
	
	public static ArrayList<Visitante> listar() {
		return visitantes;
	}
	
	public static boolean cadastrar(Visitante visitante) {
		for (Visitante visitanteCadastrado : visitantes) {
			if(visitanteCadastrado.getCpf().equals(visitante.getCpf())) {
				return false;
			}
		}
		visitantes.add(visitante);
		return true;
	}
	
	public static Visitante getVisitante(int id) {
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