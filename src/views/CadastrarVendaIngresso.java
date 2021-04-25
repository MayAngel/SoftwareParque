package views;

import java.util.Scanner;

import controllers.VendaIngressoController;
import controllers.AtracaoController;
import controllers.VisitantesController;
import controllers.ParqueController;
import models.Ingresso;
import models.Atracao;
import models.Visitante;
import models.Parque;

public class CadastrarVendaIngresso {
	
	private static Scanner sc = new Scanner(System.in);
	private static Ingresso ingresso;
	private static Visitante visitante;
	private static Parque parque;
	private static Atracao atracao;
	
	public static void renderizar() {
		ingresso = new Ingresso();
		System.out.println("\n".repeat(20));
		System.out.println("\n  --- Venda de Ingresso ---  \n");
		System.out.println("Digite o QR Code do ingresso: ");
		ingresso.setQRCode(sc.nextInt());
		System.out.println("Digite o n�mero do visitante: ");	
		Listar.renderizarVisitante();
		visitante = VisitantesController.getVisitante(sc.nextInt());
			if(visitante != null) {
				ingresso.setVisitante(visitante);
			} else { 
				System.out.println("\n --- Esse visitante n�o existe! --- ");
				System.out.println("\n --- N�o ser� possivel concluir a compra do ingresso!!! --- ");
			}	
		System.out.println("Digite o n�mero do parque: ");	
		Listar.renderizarParque();
		parque = ParqueController.getParque(sc.nextInt());
			if(parque != null) {
				ingresso.setParque(parque);
			} else { 
				System.out.println("\n --- Esse parque n�o existe! --- ");
				System.out.println("\n --- N�o ser� possivel concluir a compra do ingresso!!! --- ");
			}
		System.out.println("Digite o n�mero da atra��o: ");
		Listar.renderizarAtracao();
		atracao = AtracaoController.getAtracao(sc.nextInt());
			if(atracao != null) {
				ingresso.setAtracao(atracao);
			} else { 
				System.out.println("\n --- Essa atra��o n�o existe! --- ");
				System.out.println("\n --- N�o ser� possivel concluir a compra do ingresso!!! --- ");
			}
			
			if (visitante != null && parque != null && atracao != null) {
				if(VendaIngressoController.cadastrar(ingresso)) {
					System.out.println("\n --- Ingresso cadastrado com sucesso! ---");
				} else {
					System.out.println(" --- Esse ingresso j� existe! ---");
					System.out.println("\n --- N�o foi possivel efetuar a venda desse ingresso!!! --- ");
				}
			} else {
				System.out.println("\n --- N�o foi possivel efetuar a venda desse ingresso!!! --- ");
			}
			
			
	}
}
