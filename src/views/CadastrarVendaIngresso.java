package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.OriginController;
import models.Ingresso;
import models.Atracao;
import models.Visitante;
import util.Console;
import models.Parque;

public class CadastrarVendaIngresso {

	private static Scanner sc = new Scanner(System.in);
	private static OriginController controller = OriginController.retornarInstancia();
	private static Ingresso ingresso;
	private static Visitante visitante;
	private static Parque parque;
	private static Atracao atracao;
	private static  int visitanteId, parqueId, atracaoId;

	public static void renderizar() {
		ingresso = new Ingresso();
		System.out.println("\n".repeat(2));
		System.out.println("\n  --- Venda de Ingresso ---  \n");
		//Visitante
		Listar.renderizarVisitante();
		visitanteId = Console.lerInteiro("Digite o número do visitante: ");
		visitante = (Visitante) controller.buscarPorId (visitanteId);
		if (visitante != null) {
			ingresso.setVisitante(visitante);
			//Parque
			Listar.renderizarParque();
			parqueId = Console.lerInteiro("Digite o número do parque: ");
			parque = (Parque) controller.buscarPorId (parqueId);
			if (parque != null) {
				ingresso.setParque(parque);
				//Atracao
				ArrayList<Atracao> atracoes = new ArrayList<Atracao>();
				boolean cadastrarNovasAtracoes = true;
				do {
					try {
						Listar.renderizarAtracao();
						atracaoId = Console.lerInteiro("Digite o número da atração: ");
						atracao = (Atracao) controller.buscarPorId (atracaoId);
						if (atracao != null) {
							if(atracao.getIdadeMin() >= visitante.getIdade()) {
								if (atracao.getAlturaMinima() >= visitante.getAltura()) {
									atracoes.add(atracao);
								} else {
									System.out.println("\n --- Você não tem altura suficiente para essa atração! --- ");
								}
							} else {
								System.out.println("\n --- Você não tem idade suficiente para essa atração! --- ");
							}
						} else {
							System.out.println("\n --- Essa atração não existe! --- ");
						}
		
						System.out.println("Deseja incluir mais atrações neste Ingresso?");
						System.out.println("1 - SIM");
						System.out.println("2 - NÃO");
		
						if (sc.nextInt() == 2) {
							cadastrarNovasAtracoes = false;
						}
		
					} catch (Exception e) {
						cadastrarNovasAtracoes = false;
						System.out.println(e);
					}
					
					if (atracoes.size() ==0) {
						cadastrarNovasAtracoes = true;
						System.out.println("É  necessário incluir ao menos uma atração no Ingresso!");
					}
		
				} while (cadastrarNovasAtracoes == true);
		
				ingresso.setAtracoes(atracoes);
		
				if (visitante != null && parque != null && atracoes.size()>0) {
					if (controller.cadastrar(ingresso)) {
						System.out.println("\n --- Ingresso cadastrado com sucesso! ---");
					} else {
						System.out.println(" --- Esse ingresso já existe! ---");
						System.out.println("\n --- Não foi possivel efetuar a venda desse ingresso!!! --- ");
					}
				} else {
					System.out.println("\n --- Não foi possivel efetuar a venda desse ingresso!!! --- ");
				}
			} else {
				System.out.println("\n --- Esse parque não existe! --- ");
				System.out.println("\n --- Não será possivel concluir a compra do ingresso!!! --- ");
			}
		} else {
			System.out.println("\n --- Esse visitante não existe! --- ");
			System.out.println("\n --- Não será possivel concluir a compra do ingresso!!! --- ");
		}

	}
}
