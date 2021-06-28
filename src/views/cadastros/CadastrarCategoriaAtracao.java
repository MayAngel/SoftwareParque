package views.cadastros;

import java.util.Scanner;

import controllers.OriginController;
import models.CategoriaAtracao;
import models.Parque;
import util.Console;
import views.Listar;

public class CadastrarCategoriaAtracao {
	
	private static Parque parque;
	private static CategoriaAtracao categoriaAtracao;
	private static Scanner sc = new Scanner(System.in);
	private static OriginController originController = OriginController.retornarInstancia();
	
	public static void renderizar() {
		
		categoriaAtracao = new CategoriaAtracao();
		System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Categoria de Atra��es ---  \n");
		categoriaAtracao.setId(Console.lerInteiro("Digite o id da Categoria: "));
		System.out.println("Digite o nome da categoria: ");	
		categoriaAtracao.setNome(sc.next());	
		System.out.println("Digite a descri��o da categoria: ");	
		categoriaAtracao.setDescricao(sc.next());
		categoriaAtracao.setIdadeMin(Console.lerInteiro("Digite a idade m�nima para utiliza��o nessa categoria: "));
		System.out.println("Digite a restri��o da categoria(restri��es f�sicas): ");
		categoriaAtracao.setRestricao(sc.next());
		Listar.renderizarParque();
			parque = originController.getParque(Console.lerInteiro("Digite o n�mero do parque: "));
			if(parque != null) {
				categoriaAtracao.setParque(parque);
				if(originController.cadastrar(categoriaAtracao)) {
					System.out.println("\n --- Categoria cadastrada com sucesso! ---");
				} else {
					System.out.println(" --- Essa categoria j� existe! ---");
				}
			} else { 
				System.out.println("\n --- Parque ainda n�o cadastrado! --- ");
				System.out.println("\n --- N�o foi possivel cadastrar essa categoria de Atra��o!!! --- ");
				System.out.println("\n --- Voc� precisa primeiro cadastrar o Parque! --- ");
			}
	}
}
