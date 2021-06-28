package views.cadastros;

import java.util.Scanner;

import controllers.OriginController;
import models.Parque;
import util.Console;

public class CadastrarParque {
	
	private static Parque parque;
	private static Scanner sc = new Scanner(System.in);
	private static OriginController originController = OriginController.retornarInstancia();
	
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
		parque.setTelefone(Console.lerInteiro("Digite o telefone: "));
		System.out.println("Digite o email: ");
		parque.setEmail(sc.next());
		System.out.println("Digite o site: ");
		parque.setSite(sc.next());
		
		
		if(originController.cadastrar(parque)) {
			System.out.println("\n ---Parque cadastrado com sucesso!!! ---");
		} else {
			System.out.println("Esse parque já esta cadastrado!");
		}
	}
}
