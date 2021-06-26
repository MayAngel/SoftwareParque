package controllers;

import java.util.ArrayList;
import java.util.Random;

import Interfaces.IIngresso;
import models.Atracao;
import models.Ingresso;

public class VendaIngressoController implements IIngresso{
	
	//Singleton
		private static VendaIngressoController controller;	
		public static  VendaIngressoController retornarInstancia() {
			if(controller  == null) {
				controller = new VendaIngressoController();
			}
			return controller;
		}
		
	private ArrayList<Ingresso> vendas = new ArrayList<Ingresso>();
	
	@Override
	public boolean cadastrar(Ingresso venda) {
		venda.setValorIngresso(gerarValorIngresso(venda));
		venda.setQRCode(gerarQrCodeIngresso(venda));
		
		vendas.add(venda);
		return true;
	}

	@Override
	public float gerarValorIngresso(Ingresso ingresso) {
		float valor=0;
		for (Atracao atracao : ingresso.getAtracoes()) {
			valor = (float) (valor + atracao.getValor());			
		}
		return valor;
	}

	@Override
	public int gerarQrCodeIngresso(Ingresso ingresso) {
		Random gerador = new Random();
		return  gerador.nextInt(1000000);
	}

	@Override
	public ArrayList<Ingresso> listar() {
		return vendas;
	}	
}
