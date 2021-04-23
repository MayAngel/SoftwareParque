package controllers;

import java.util.ArrayList;
import models.Visitante;

public class VisitantesController {
	
	private static ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
	
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

}