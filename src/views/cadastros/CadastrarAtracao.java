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
		System.out.println("\n  --- Cadastrar Atração ---  \n");
		atracao.setId(Console.lerInteiro("Digite o id da Atração: "));
		System.out.println("Digite o nome da Atração: ");	
		atracao.setNome(sc.next());	
		System.out.println("Digite a descrição da Atração: ");	
		atracao.setDescricao(sc.next());
		atracao.setIdadeMin(Console.lerInteiro("Digite a idade mínima da Atração: "));
		System.out.println("Digite a altura mínima da Atração: ");
		atracao.setAlturaMinima(sc.nextDouble());
		System.out.println("Digite a retrição da Atração: ");
		atracao.setRestricao(sc.next());
		System.out.println("Digite o valor da Atração: ");
		atracao.setValor(sc.nextDouble());
		Listar.renderizarCategoriaAtracao();
		categoriaAtracao = originController.getCategoriaAtracao(Console.lerInteiro("Digite o número da categoria da Atrações: "));
			if(categoriaAtracao != null) {
				atracao.setCategoriaAtracao(categoriaAtracao);
				if(originController.cadastrar(atracao)) {
					System.out.println("\n --- Atração cadastrada com sucesso! :) ---");
				} else {
					System.out.println("\n --- Atração já existente! ---");
				}
			} else { 
				System.out.println("\n --- Essa categoria não existe! --- ");
				System.out.println("\n --- Não foi possivel cadastrar essa atração!!! --- ");
			}
			
	}
}
