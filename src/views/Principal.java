package views;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		
		int opcao;
	 Scanner sc = new Scanner(System.in);
	 Menu menu = new Menu();
	 do {
		menu.exibirMenu();		 
		System.out.println(" Digite a opção desejada: ");
		opcao = sc.nextInt();		
	
		switch (opcao) {
	//CadastrarVisitante Iasmin
		case 1: 
	//		CadastrarVisitante cadastrarVisitante = new CadastrarVisitante();
	//		cadastrarVisitante.renderizar();			
			break;
	//CadastrarParque Wesley 	
		case 2: 
			CadastrarParque cadastrarParque = new CadastrarParque();
			cadastrarParque.renderizar();			
			break;
			
	//CadastroAtracao Mayara		
		case 3: 
			CadastrarAtracao cadastrarAtracao = new CadastrarAtracao();
			cadastrarAtracao.renderizar();			
			break;
			
	//VendaIngresso A Definir quem vai fazer 
		case 4: 
	//		CadastrarParque cadastrarParque = new CadastrarParque();
	//		cadastrarParque.renderizar();			
			break;
			
	//ImprimirIngresso A Definir quem vai fazer 
		case 5: 
	//		CadastrarParque cadastrarParque = new CadastrarParque();
	//		cadastrarParque.renderizar();			
			break;		
		default:
			System.out.println(opcao);		
		break; 
		}
	} while (opcao!=0);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	

}
