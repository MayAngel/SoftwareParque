package views;

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
		
		if(originController.cadastrar(parque)) {
			System.out.println("\n ---Parque cadastrado com sucesso!!! ---");
		} else {
			System.out.println("Esse parque já esta cadastrado!");
		}
	}
}
