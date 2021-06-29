package views;

import java.util.Scanner;

import controllers.OriginController;
import models.CategoriaAtracao;
import models.Parque;
import util.Console;

public class CadastrarCategoriaAtracao {
	
	private static Parque parque;
	private static int parqueId;
	private static CategoriaAtracao categoriaAtracao;
	private static Scanner sc = new Scanner(System.in);
	private static OriginController controller = OriginController.retornarInstancia();
	
	public static void renderizar() {
		
		categoriaAtracao = new CategoriaAtracao();
		System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Categoria de Atrações ---  \n");
		categoriaAtracao.setId(Console.lerInteiro("Digite o id da Categoria: "));
		System.out.println("Digite o nome da categoria: ");	
		categoriaAtracao.setNome(sc.next());	
		System.out.println("Digite a descrição da categoria: ");	
		categoriaAtracao.setDescricao(sc.next());
		System.out.println("Digite a restrição da categoria(restrições físicas): ");
		categoriaAtracao.setRestricao(sc.next());
		Listar.renderizarParque();
		parqueId = Console.lerInteiro("Digite o número do parque: ");
		parque = (Parque) controller.buscarPorId (parqueId);
		if(parque != null) {
			categoriaAtracao.setParque(parque);
			if(controller.cadastrar(categoriaAtracao)) {
				System.out.println("\n --- Categoria cadastrada com sucesso! ---");
			} else {
				System.out.println(" --- Essa categoria já existe! ---");
			}
		} else { 
			System.out.println("\n --- Parque ainda não cadastrado! --- ");
			System.out.println("\n --- Não foi possivel cadastrar essa categoria de Atração!!! --- ");
			System.out.println("\n --- Você precisa primeiro cadastrar o Parque! --- ");
		}
	}
}
