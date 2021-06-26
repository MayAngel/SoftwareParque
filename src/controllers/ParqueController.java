package controllers;

import java.util.ArrayList;

import Interfaces.IParque;
import models.Parque;

public class ParqueController implements IParque{
	//Singleton
			private static ParqueController controller;	
			public static  ParqueController retornarInstancia() {
				if(controller  == null) {
					controller = new ParqueController();
				}
				return controller;
			}
	private static Parque objeto;
	private ArrayList<Parque> parques = new ArrayList<Parque>();

	@Override
	public ArrayList<Parque> listar() {
		return parques;
	}

	@Override
	public boolean cadastrar(Parque parque) {
		for (Parque parqueCadastrado : parques) {
			if(parqueCadastrado.getCnpj().equals(parque.getCnpj())) {
				return false;
			}
		}
		parques.add(parque);
		return true;
	}

	@Override
	public Parque getParque(int id) {
		for (Parque idParque : parques) {
			if(idParque.getId() == id) {
				objeto = idParque;
			} else {
				objeto = null;
			}
		}	
		return objeto;
	}

	
}
