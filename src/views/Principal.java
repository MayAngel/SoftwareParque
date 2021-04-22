package views;
import java.util.ArrayList;
import java.util.Scanner;
import models.Visitante;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		Visitante visitante = new Visitante();
		ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
		
		
		do {
			System.out.println("\n -- SISTEMA DO PARQUE DE DIVERSÕES -- ");
			System.out.println("\n1 - Cadastro de Parque");
			System.out.println("2 - Cadastro de Visitante");
			System.out.println("3 - Cadastro de Categoria de Atrações");
			System.out.println("4 - Cadastro de Atração");
			System.out.println("5 - Cadastro de Serviços");
			System.out.println("6 - Compra de Ingresso");
			System.out.println("0 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				break;
			case 2:
				System.out.println("\n-- CADASTRAR VISITANTE -- \n");
				System.out.println("Digite o nome do cliente:");
				visitante.setNome(sc.next());
				System.out.println("Digite o CPF do cliente:");
				visitante.setCpf(sc.next());
				visitantes.add(visitante);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOpção inválida");
				break;
			}
		} while (opcao != 0);
		sc.close();
	}

}
