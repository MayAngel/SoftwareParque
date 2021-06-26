package Interfaces;

import java.util.ArrayList;

import models.Ingresso;

public interface IIngresso {
	public boolean cadastrar(Ingresso venda);
	public float gerarValorIngresso(Ingresso ingresso);
	public int gerarQrCodeIngresso(Ingresso ingresso);
	public ArrayList<Ingresso> listar();

}
