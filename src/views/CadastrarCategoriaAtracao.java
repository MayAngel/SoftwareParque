package views;

import java.util.Scanner;
import controllers.CategoriaAtracaoController;
import models.CategoriaAtracao;

public class CadastrarCategoriaAtracao {
	
	private static CategoriaAtracao categoriaAtracao;
	private static Scanner sc = new Scanner(System.in);

	public static void renderizar() {
		
		categoriaAtracao = new CategoriaAtracao();
		System.out.println("\n".repeat(20));
		System.out.println("\\n  --- Cadastrar Categoria de Atra��es ----  \\n");
		System.out.println("Digite o id da Categoria: ");
		categoriaAtracao.setId(sc.nextInt());
		System.out.println("Digite o nome da categoria: ");	
		categoriaAtracao.setNome(sc.next());	
		System.out.println("Digite a descri��o da categoria: ");	
		categoriaAtracao.setDescricao(sc.next());
		System.out.println("Digite a idade m�nima da categoria: ");
		categoriaAtracao.setIdadeMinima(sc.nextInt());
		System.out.println("Digite a retri��o da categoria: ");
		categoriaAtracao.setRestricao(sc.next());
					
		if(CategoriaAtracaoController.cadastrar(categoriaAtracao)) {
			System.out.println("\n --- Categoria cadastrada com sucesso! ---");
		} else {
			System.out.println(" --- Essa categoria j� existe! ---");
		}
	}
}
