package controllers;

import java.util.ArrayList;

import models.Origin;

public interface IOrigin {
	
	public ArrayList<Origin> listar();
	public boolean cadastrar(Origin origin);
	public Origin buscarPorId(int id);

}
