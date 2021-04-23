package views;

import java.util.Scanner;
import controllers.AtracaoController;
import models.Atracao;

	public class CadastrarAtracao {
	
	private static Atracao atracao;
	private static Scanner sc = new Scanner(System.in);
		
	public static void renderizar() {
		atracao = new Atracao();
		System.out.println("\n".repeat(20));
		System.out.println("\\n  --- Cadastrar Atração ----  \\n");
		System.out.println("Digite o nome da Atração: ");	
		atracao.setNome(sc.next());	
		System.out.println("Digite a descrição da Atração: ");	
		atracao.setDescricao(sc.next());
		System.out.println("Digite a idade mínima da Atração: ");
		atracao.setIdadeMinima(sc.nextInt());
		System.out.println("Digite a altura mínima da Atração: ");
		atracao.setAlturaMinima(sc.nextInt());
		System.out.println("Digite a retrição da Atração: ");
		atracao.setRestricao(sc.next());
		System.out.println("Digite a categoria da Atrações: ");
		atracao.setCategoriaAtracao(sc.next()); // Ele tem que pegar uma categoria da lista de categorias
		System.out.println("Digite o valor da Atração: ");
		atracao.setValor(sc.nextInt());
			
		if(AtracaoController.cadastrar(atracao)) {
			System.out.println("\n --- Atração cadastrada com sucesso! ---");
		} else {
			System.out.println(" --- Atração já existente! ---");
		}
	}
}
