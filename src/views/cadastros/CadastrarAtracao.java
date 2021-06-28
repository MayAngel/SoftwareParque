package views.cadastros;


import java.util.Scanner;
import controllers.OriginController;
import models.Atracao;
import models.CategoriaAtracao;
import util.Console;
import views.Listar;

	public class CadastrarAtracao {
		
	private static CategoriaAtracao categoriaAtracao;
	private static Atracao atracao;
	private static Scanner sc = new Scanner(System.in);
	private static OriginController originController = OriginController.retornarInstancia();	
	
	public static void renderizar() {
		atracao = new Atracao();
		System.out.println("\n  --- Cadastrar Atra��o ---  \n");
		atracao.setId(Console.lerInteiro("Digite o id da Atra��o: "));
		System.out.println("Digite o nome da Atra��o: ");	
		atracao.setNome(sc.next());	
		System.out.println("Digite a descri��o da Atra��o: ");	
		atracao.setDescricao(sc.next());
		atracao.setIdadeMin(Console.lerInteiro("Digite a idade m�nima da Atra��o: "));
		System.out.println("Digite a altura m�nima da Atra��o: ");
		atracao.setAlturaMinima(sc.nextDouble());
		System.out.println("Digite a retri��o da Atra��o: ");
		atracao.setRestricao(sc.next());
		System.out.println("Digite o valor da Atra��o: ");
		atracao.setValor(sc.nextDouble());
		Listar.renderizarCategoriaAtracao();
		categoriaAtracao = originController.getCategoriaAtracao(Console.lerInteiro("Digite o n�mero da categoria da Atra��es: "));
			if(categoriaAtracao != null) {
				atracao.setCategoriaAtracao(categoriaAtracao);
				if(originController.cadastrar(atracao)) {
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
