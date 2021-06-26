package Interfaces;

import java.util.ArrayList;

import models.Parque;

public interface IParque {
	public ArrayList<Parque> listar();
	public boolean cadastrar(Parque parque);
	public Parque getParque(int id);

}
