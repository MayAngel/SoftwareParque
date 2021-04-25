package views;

import java.util.Scanner;

import controllers.ParqueController;
import controllers.CategoriaAtracaoController;
import models.CategoriaAtracao;
import models.Parque;

public class CadastrarCategoriaAtracao {
	
	private static Parque parque;
	private static CategoriaAtracao categoriaAtracao;
	private static Scanner sc = new Scanner(System.in);

	public static void renderizar() {
		
		categoriaAtracao = new CategoriaAtracao();
		System.out.println("\n".repeat(2));
		System.out.println("\n  --- Cadastrar Categoria de Atrações ---  \n");
		System.out.println("Digite o id da Categoria: ");
		categoriaAtracao.setId(sc.nextInt());
		System.out.println("Digite o nome da categoria: ");	
		categoriaAtracao.setNome(sc.next());	
		System.out.println("Digite a descrição da categoria: ");	
		categoriaAtracao.setDescricao(sc.next());
		System.out.println("Digite a idade mínima da categoria: ");
		categoriaAtracao.setIdadeMinima(sc.nextInt());
		System.out.println("Digite a retrição da categoria: ");
		categoriaAtracao.setRestricao(sc.next());
		System.out.println("Digite o número do parque: ");
		Listar.renderizarParque();
		parque = ParqueController.getParque(sc.nextInt());
			if(parque != null) {
				categoriaAtracao.setParque(parque);
				if(CategoriaAtracaoController.cadastrar(categoriaAtracao)) {
					System.out.println("\n --- Categoria cadastrada com sucesso! ---");
				} else {
					System.out.println(" --- Essa categoria já existe! ---");
				}
			} else { 
				System.out.println("\n --- Esse parque não existe! --- ");
				System.out.println("\n --- Não foi possivel cadastrar essa categoria!!! --- ");
			}
	}
}
