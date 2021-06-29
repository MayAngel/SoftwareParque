package views;

import util.Console;

public class Principal {
	
	public static void main(String[] args) {
		
	int opcao;
	 Menu menu = new Menu();
	 do {
		menu.exibirMenu();		 
		opcao = Console.lerInteiro(" Digite a opção desejada: ");		
	
		switch (opcao) {
		case 1: 
			CadastrarParque.renderizar();			
			break;			
		case 2: 
			CadastrarCategoriaAtracao.renderizar();
			break; 
				
		case 3: 
			CadastrarAtracao.renderizar();			
			break;
		case 4: 	
			CadastrarVisitante.renderizar();
			break;
		case 5: 	
			CadastrarVendaIngresso.renderizar();			
			break;				
		case 6: 
			ImprimirIngresso.renderizar();
			break;			
		default:
			System.out.println(opcao);		
		break; 
		}
	} while (opcao!=0);
	}
}
