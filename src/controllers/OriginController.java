package controllers;

import java.util.ArrayList;

import models.Atracao;
import models.CategoriaAtracao;
import models.Origin;
import models.Parque;
import models.Visitante;

public class OriginController implements IOrigin {
	
	private ArrayList<Origin> origins = new ArrayList<Origin>();
	private static OriginController controller;	
	
	public static OriginController retornarInstancia() {
		if(controller  == null) {
			controller = new OriginController();
		}
		return controller;
	}

	@Override
	public ArrayList<Origin> listar() {
		return origins;
	}

	@Override
	public boolean cadastrar(Origin origin) {
		for (Origin originCadastrado : origins) {
			if(originCadastrado.getCriadoEm().equals(origin.getCriadoEm())) {
				return false;
			}
		}
		origins.add(origin);
		return true;
	}
	
	@Override
	public Origin buscarPorId(int id) {
		for (Origin originCadastrada : origins) {
			if(originCadastrada.getId() == id) {
				return originCadastrada;
			}
		}
		return null;
	}
	
	public Atracao getAtracao(int lerInteiro) {
		return null;
	}
	public Parque getParque(int lerInteiro) {
		return null;
	}
	public CategoriaAtracao getCategoriaAtracao(int lerInteiro) {
		return null;
	}
	public Visitante getVisitante(int lerInteiro) {
		return null;
	}	
}
