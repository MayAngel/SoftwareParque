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
		System.out.println("\\n  --- Cadastrar Atra��o ----  \\n");
		System.out.println("Digite o nome da Atra��o: ");	
		atracao.setNome(sc.next());	
		System.out.println("Digite a descri��o da Atra��o: ");	
		atracao.setDescricao(sc.next());
		System.out.println("Digite a idade m�nima da Atra��o: ");
		atracao.setIdadeMinima(sc.nextInt());
		System.out.println("Digite a altura m�nima da Atra��o: ");
		atracao.setAlturaMinima(sc.nextInt());
		System.out.println("Digite a retri��o da Atra��o: ");
		atracao.setRestricao(sc.next());
		System.out.println("Digite a categoria da Atra��es: ");
		atracao.setCategoriaAtracao(sc.next()); // Ele tem que pegar uma categoria da lista de categorias
		System.out.println("Digite o valor da Atra��o: ");
		atracao.setValor(sc.nextInt());
			
		if(AtracaoController.cadastrar(atracao)) {
			System.out.println("\n --- Atra��o cadastrada com sucesso! ---");
		} else {
			System.out.println(" --- Atra��o j� existente! ---");
		}
	}
}
