package controllers;

import java.util.ArrayList;

import models.Ingresso;

public class VendaIngressoController {
	
	private static ArrayList<Ingresso> vendas = new ArrayList<Ingresso>(); 

	public static ArrayList<Ingresso> listar() {
		return vendas;
	}

	public static boolean cadastrar(Ingresso venda) {
		vendas.add(venda);
		return true;
	}

}
