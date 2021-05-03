package controllers;

import java.util.ArrayList;
import java.util.Random;

import models.Atracao;
import models.Ingresso;

public class VendaIngressoController {
	
	private static ArrayList<Ingresso> vendas = new ArrayList<Ingresso>(); 

	public static ArrayList<Ingresso> listar() {
		return vendas;
	}

	public static boolean cadastrar(Ingresso venda) {
		
		venda.setValorIngresso(gerarValorIngresso(venda));
		venda.setQRCode(gerarQrCodeIngresso(venda));
		
		vendas.add(venda);
		return true;
	}
	
	public static float gerarValorIngresso(Ingresso ingresso) {
		float valor=0;
		for (Atracao atracao : ingresso.getAtracoes()) {
			valor = (float) (valor + atracao.getValor());			
		}
		return valor;
	}
	
	public static int gerarQrCodeIngresso(Ingresso ingresso) {
			
		Random gerador = new Random();
		return  gerador.nextInt(1000000);
		
	}

}
