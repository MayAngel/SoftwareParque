package views;

import java.util.Scanner;
import controllers.AtracaoController;
import controllers.CategoriaAtracaoController;
import models.Atracao;
import models.CategoriaAtracao;

	public class CadastrarAtracao {
	private static CategoriaAtracao categoriaAtracao;
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
		System.out.println("Digite o valor da Atra��o: ");
		atracao.setValor(sc.nextInt());
		System.out.println("Digite o n�mero da categoria da Atra��es: ");
		ListarCategoriaAtracao.renderizar();
		categoriaAtracao = CategoriaAtracaoController.getCategoriaAtracao(sc.nextInt());
			if(categoriaAtracao != null) {
				atracao.setCategoriaAtracao(categoriaAtracao);
				if(AtracaoController.cadastrar(atracao)) {
					System.out.println("\n --- Atra��o cadastrada com sucesso! ---");
				} else {
					System.out.println(" --- Atra��o j� existente! ---");
				}
			} else { 
				System.out.println("\n --- Essa categoria n�o existe! --- ");
				System.out.println("\n --- N�o foi possivel cadastrar essa atra��o!!! --- ");
			}
			
	}
}
