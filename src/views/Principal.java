package views;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
		
	int opcao;
	 Menu menu = new Menu();
	 do {
		menu.exibirMenu();		 
		System.out.println(" Digite a op��o desejada: ");
		opcao = sc.nextInt();		
	
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
			CadastrarServico.renderizar();
			break;
		case 5: 	
			CadastrarVisitante.renderizar();			
			break;				
		case 6: 
			CadastrarVendaIngresso.renderizar();
			break;			
		case 7: 	
			ImprimirIngresso.renderizar();
			break;
		case 8: 	
			ImprimirIngresso.renderizar();
			break;
		default:
			System.out.println(opcao);		
		break; 
		}
	} while (opcao!=0);
	}
}
