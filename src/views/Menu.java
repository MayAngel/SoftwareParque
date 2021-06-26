package views;

public class Menu {
	public void exibirMenu(){
		//System.out.println("\n");
		System.out.println("+--------------------------------------+");
		System.out.println("|       PARQUE DE DIVERSÕES            |");
		System.out.println("|      SISTEMA DE GERENCIAMENTO        |");
		System.out.println("|       ***    MENU    ***             |");       
		System.out.println("+--------------------------------------+");
		System.out.println(
			"|  1 --Cadastro do Parque--            |\n" +
			"|  2 --Cadastro Categoria de Atração-- |\n" +
			"|  3 --Cadastro de Atração--           |\n" +
			"|  4 --Cadastro de Serviços--          |\n" +
			"|  5 --Cadastro de Visitante--	       |\n" +
			"|  6 --Venda de Ingresso--   	       |\n" +
			"|  7 --Imprimir ingresso--             |\n" +
			"|  8 --Relatório Operacional por dia-- |\n" +
			"|  0 --sair--                          |"
		);
		System.out.println("+--------------------------------------+\n");
	}
	
}
