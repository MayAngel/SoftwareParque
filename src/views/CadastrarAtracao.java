package views;


import java.util.Scanner;
import controllers.AtracaoController;
import controllers.CategoriaAtracaoController;
import models.Atracao;
import models.CategoriaAtracao;
import utils.Console;

	public class CadastrarAtracao {
		
	private static CategoriaAtracao categoriaAtracao;
	private static Atracao atracao;
	private static Scanner sc = new Scanner(System.in);
	private static CategoriaAtracaoController categoriaAtracaoController = CategoriaAtracaoController.retornarInstancia();
	
	private static AtracaoController atracaoController = AtracaoController.retornarInstancia();	
	
	public static void renderizar() {
		atracao = new Atracao();
		//System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Atra��o ---  \n");
		System.out.println("Digite o id da Atra��o: ");
		atracao.setId(Console.lerInteiro("Digite o id da Atra��o: "));
		System.out.println("Digite o nome da Atra��o: ");	
		atracao.setNome(sc.next());	
		System.out.println("Digite a descri��o da Atra��o: ");	
		atracao.setDescricao(sc.next());
		System.out.println("Digite a idade m�nima da Atra��o: ");
		atracao.setIdadeMin(Console.lerInteiro("Digite a idade m�nima da Atra��o: "));
		System.out.println("Digite a altura m�nima da Atra��o: ");
		atracao.setAlturaMinima(sc.nextDouble());
		System.out.println("Digite a retri��o da Atra��o: ");
		atracao.setRestricao(sc.next());
		System.out.println("Digite o valor da Atra��o: ");
		atracao.setValor(sc.nextDouble());
		Listar.renderizarCategoriaAtracao();
		categoriaAtracao = categoriaAtracaoController.getCategoriaAtracao(Console.lerInteiro("Digite o n�mero da categoria da Atra��es: "));
			if(categoriaAtracao != null) {
				atracao.setCategoriaAtracao(categoriaAtracao);
				if(atracaoController.cadastrar(atracao)) {
					System.out.println("\n --- Atra��o cadastrada com sucesso! :) ---");
				} else {
					System.out.println("\n --- Atra��o j� existente! ---");
				}
			} else { 
				System.out.println("\n --- Essa categoria n�o existe! --- ");
				System.out.println("\n --- N�o foi possivel cadastrar essa atra��o!!! --- ");
			}
			
	}
}
