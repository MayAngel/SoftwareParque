package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.VendaIngressoController;
import controllers.AtracaoController;
import controllers.VisitanteController;
import controllers.ParqueController;
import models.Ingresso;
import models.Atracao;
import models.Visitante;
import utils.Console;
import models.Parque;

public class CadastrarVendaIngresso {

	private static Scanner sc = new Scanner(System.in);
	private static VendaIngressoController controller = VendaIngressoController.retornarInstancia();
	private static AtracaoController atracaoController = AtracaoController.retornarInstancia();
	private static ParqueController parqueController = ParqueController.retornarInstancia();
	private static VisitanteController visitanteController = VisitanteController.retornarInstancia();
	private static Ingresso ingresso;
	private static Visitante visitante;
	private static Parque parque;
	private static Atracao atracao;

	public static void renderizar() {
		ingresso = new Ingresso();
		System.out.println("\n".repeat(2));
		System.out.println("\n  --- Venda de Ingresso ---  \n");

//		System.out.println("Digite o QR Code do ingresso: ");
//		ingresso.setQRCode(sc.nextInt());

		Listar.renderizarVisitante();
		visitante = visitanteController.getVisitante(Console.lerInteiro("Digite o n�mero do visitante: "));
		if (visitante != null) {
			ingresso.setVisitante(visitante);
		} else {
			System.out.println("\n --- Esse visitante n�o existe! --- ");
			System.out.println("\n --- N�o ser� possivel concluir a compra do ingresso!!! --- ");
		}

		Listar.renderizarParque();
		parque = parqueController.getParque(Console.lerInteiro("Digite o n�mero do parque: "));
		if (parque != null) {
			ingresso.setParque(parque);
		} else {
			System.out.println("\n --- Esse parque n�o existe! --- ");
			System.out.println("\n --- N�o ser� possivel concluir a compra do ingresso!!! --- ");
		}

		ArrayList<Atracao> atracoes = new ArrayList<Atracao>();
		boolean cadastrarNovasAtracoes = true;
		do {
			try {

				System.out.println("Digite o n�mero da atra��o: ");
				Listar.renderizarAtracao();
				atracao = atracaoController.getAtracao(Console.lerInteiro("Digite o n�mero da atra��o: "));

				if (atracao != null) {
					atracoes.add(atracao);
				} else {
					System.out.println("\n --- Essa atra��o n�o existe! --- ");
				}

				System.out.println("Deseja incluir mais atra��es neste Ingresso?");
				System.out.println("1 - SIM");
				System.out.println("2 - N�O");

				if (sc.nextInt() == 2) {
					cadastrarNovasAtracoes = false;
				}

			} catch (Exception e) {
				cadastrarNovasAtracoes = false;
				System.out.println(e);
			}
			
			if (atracoes.size() ==0) {
				cadastrarNovasAtracoes = true;
				System.out.println("�  necess�rio incluir ao menos uma atra��o no Ingresso!");
			}

		} while (cadastrarNovasAtracoes == true);

		ingresso.setAtracoes(atracoes);

		if (visitante != null && parque != null && atracoes.size()>0) {
			if (controller.cadastrar(ingresso)) {
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
