package views;

import java.util.Scanner;
import controllers.AtracaoController;
import controllers.CategoriaAtracaoController;
import controllers.VendaIngressoController;
import models.Atracao;
import models.CategoriaAtracao;

	public class CadastrarAtracao {
		
	private static CategoriaAtracao categoriaAtracao;
	private static Atracao atracao;
	private static Scanner sc = new Scanner(System.in);
	private static CategoriaAtracaoController categoriaAtracaoController = CategoriaAtracaoController.retornarInstancia();
	
	private static AtracaoController atracaoController = AtracaoController.retornarInstancia();	
	
	public static void renderizar() {
		atracao = new Atracao();
		//System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Atração ---  \n");
		System.out.println("Digite o id da Atração: ");
		atracao.setId(sc.nextInt());
		System.out.println("Digite o nome da Atração: ");	
		atracao.setNome(sc.next());	
		System.out.println("Digite a descrição da Atração: ");	
		atracao.setDescricao(sc.next());
		System.out.println("Digite a idade mínima da Atração: ");
		atracao.setIdadeMinima(sc.nextInt());
		System.out.println("Digite a altura mínima da Atração: ");
		atracao.setAlturaMinima(sc.nextDouble());
		System.out.println("Digite a retrição da Atração: ");
		atracao.setRestricao(sc.next());
		System.out.println("Digite o valor da Atração: ");
		atracao.setValor(sc.nextDouble());
		System.out.println("Digite o número da categoria da Atrações: ");
		Listar.renderizarCategoriaAtracao();
		categoriaAtracao = categoriaAtracaoController.getCategoriaAtracao(sc.nextInt());
			if(categoriaAtracao != null) {
				atracao.setCategoriaAtracao(categoriaAtracao);
				if(atracaoController.cadastrar(atracao)) {
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
