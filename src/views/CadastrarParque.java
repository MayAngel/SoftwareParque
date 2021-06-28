package views;

import java.util.Scanner;

import controllers.ParqueController;
import models.Parque;
import utils.Console;

public class CadastrarParque {
	
	private static Parque parque;
	private static Scanner sc = new Scanner(System.in);
	private static ParqueController parqueController = ParqueController.retornarInstancia();
	
	public static void renderizar() {
		parque = new Parque();
		System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Parque ---  \n");
		parque.setId(Console.lerInteiro("Digite o id: "));
		System.out.println("Digite o nome do parque: ");	
		parque.setNome(sc.next());	
		System.out.println("Digite o CNPJ do parque: ");	
		parque.setCnpj(sc.next());
		System.out.println("Digite o endereço: ");
		parque.setEndereco(sc.next());
		System.out.println("Digite o telefone: ");
		parque.setTelefone(Console.lerInteiro("Digite o telefone: "));
		System.out.println("Digite o email: ");
		parque.setEmail(sc.next());
		System.out.println("Digite o site: ");
		parque.setSite(sc.next());
		
		
		if(parqueController.cadastrar(parque)) {
			System.out.println("\n ---Parque cadastrado com sucesso!!! ---");
		} else {
			System.out.println("Esse parque já esta cadastrado!");
		}
	}
}
