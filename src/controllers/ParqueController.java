package controllers;

import java.util.ArrayList;

import models.Parque;

public class ParqueController {
	
	private static ArrayList<Parque> parques = new ArrayList<Parque>();

	public static ArrayList<Parque> listar() {
		return parques;
	}
	
	public static boolean cadastrar(Parque parque) {
		for (Parque parqueCadastrado : parques) {
			if(parqueCadastrado.getCnpj().equals(parque.getCnpj())) {
				return false;
			}
		}
		parques.add(parque);
		return true;
	}
	
}
