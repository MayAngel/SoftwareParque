package views;

import java.util.Scanner;
import controllers.VisitantesController;
import models.Visitante;

	public class CadastrarVisitante {
		
	private static Visitante visitante;
	private static Scanner sc = new Scanner(System.in);
		
	public static void renderizar() {
		visitante = new Visitante();
		System.out.println("\n".repeat(20));
		System.out.println("\\n  --- Cadastrar Visitante ----  \\n");
		System.out.println("Digite o nome do visitante: ");	
		visitante.setNome(sc.next());	
		System.out.println("Digite o Cpf do visitante: ");	
		visitante.setCpf(sc.next());
		System.out.println("Digite a idade do visitante: ");
		visitante.setIdade(sc.nextInt());
		System.out.println("Digite a altura do visitante: ");
		visitante.setAltura(sc.nextInt());
		System.out.println("Digite o peso do visitante: ");
		visitante.setPeso(sc.nextInt());
		System.out.println("Digite o endere�o do visitante: ");
		visitante.setEndereco(sc.next());
		System.out.println("Digite o telefone do visitante: ");
		visitante.setTelefone(sc.next());
		System.out.println("Digite o email do visitante: ");
		visitante.setEmail(sc.next());
		
		if(VisitantesController.cadastrar(visitante)) {
			System.out.println("\n --- Visitante cadastrado com sucesso! ---");
		} else {
			System.out.println(" --- Esse visitante j� existe! ---");
		}
	}
}