package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import controllers.VendaIngressoController;
import controllers.AtracaoController;
import controllers.VisitanteController;
import controllers.ParqueController;
import models.Ingresso;
import models.Atracao;
import models.Visitante;
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

		System.out.println("Digite o n�mero do visitante: ");
		Listar.renderizarVisitante();
		visitante = visitanteController.getVisitante(sc.nextInt());
		if (visitante != null) {
			ingresso.setVisitante(visitante);
		} else {
			System.out.println("\n --- Esse visitante n�o existe! --- ");
			System.out.println("\n --- N�o ser� possivel concluir a compra do ingresso!!! --- ");
		}

		System.out.println("Digite o n�mero do parque: ");
		Listar.renderizarParque();
		parque = parqueController.getParque(sc.nextInt());
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
				atracao = atracaoController.getAtracao(sc.nextInt());

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
