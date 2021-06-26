package Interfaces;

import java.util.ArrayList;

import models.Visitante;

public interface IVisitante {
	public ArrayList<Visitante> listar();
	public boolean cadastrar(Visitante visitante);
	public Visitante getVisitante(int id);	
}
