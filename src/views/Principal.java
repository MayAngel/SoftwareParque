package views;

import java.util.Scanner;

public class Principal {
	
	private static Scanner sc;

	public static void main(String[] args) {
	sc = new Scanner(System.in);
		
	int opcao;
	 Menu menu = new Menu();
	 do {
		menu.exibirMenu();		 
		System.out.println(" Digite a opção desejada: ");
		opcao = sc.nextInt();		
	
		switch (opcao) {
		case 1: 
			CadastrarVisitante.renderizar();			
			break;	
		case 2: 
			CadastrarParque.renderizar();			
			break;	
		case 3: 
			CadastrarAtracao.renderizar();			
			break;
		case 4: 	
			CadastrarCategoriaAtracao.renderizar();
			break; 
		case 5: 	
			CadastrarVendaIngresso.renderizar();
			break;	
		case 6: 	
			ImprimirIngresso.renderizar();
			break;
		case 7: 	
			CadastrarServico.renderizar();
			break;
		default:
			System.out.println(opcao);		
		break; 
		}
	} while (opcao!=0);
	 
	}
	
	

}
