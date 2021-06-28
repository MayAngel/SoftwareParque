package views.cadastros;

import java.util.Scanner;

import controllers.OriginController;
import models.Visitante;
import util.Console;

	public class CadastrarVisitante {
		
	private static Visitante visitante;
	private static Scanner sc = new Scanner(System.in);
	private static OriginController originController = OriginController.retornarInstancia();
			
	public static void renderizar() {
		visitante = new Visitante();
		System.out.println("\n".repeat(2));
		System.out.println("\n  --- Cadastrar Visitante ---  \n");
		visitante.setId(Console.lerInteiro("Digite o id do visitante: "));
		System.out.println("Digite o nome do visitante: ");	
		visitante.setNome(sc.next());	
		System.out.println("Digite o Cpf do visitante: ");	
		visitante.setCpf(sc.next());
		visitante.setIdade(Console.lerInteiro("Digite a idade do visitante: "));
		System.out.println("Digite a altura do visitante: ");
		visitante.setAltura(sc.nextDouble());
		System.out.println("Digite o peso do visitante: ");
		visitante.setPeso(sc.nextDouble());
		System.out.println("Digite o endereço do visitante: ");
		visitante.setEndereco(sc.next());
		System.out.println("Digite o telefone do visitante: ");
		visitante.setTelefone(sc.nextInt());
		System.out.println("Digite o email do visitante: ");
		visitante.setEmail(sc.next());
		
		if(originController.cadastrar(visitante)) {
			System.out.println("\n --- Visitante cadastrado com sucesso! ---");
		} else {
			System.out.println(" --- Esse visitante já existe! ---");
		}
	}
}
