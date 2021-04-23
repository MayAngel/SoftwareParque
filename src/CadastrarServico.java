import java.util.Scanner;

import controllers.ServicoController;
import models.Servico;
public class CadastrarServico {

	private static Servico servico;
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void renderizar() {
		servico = new Servico();
		System.out.println("\n".repeat(20));
		System.out.println("\\n  --- Cadastrar Servi�o ----  \\n");
		System.out.println("Digite o tipo do servi�o: ");	
		servico.setTipo(sc.next());
		System.out.println("Digite o nome do servi�o: ");	
		servico.setNome(sc.next());		
		System.out.println("Digite a descri��o do servi�o: ");
		servico.setDescricao(sc.next());		
		
		if(ServicoController.cadastrar(servico)) {
			System.out.println("\n ---Servi�o cadastrado com sucesso!!! ---");
		} else {
			System.out.println("Esse servi�o j� esta cadastrado!");
		}
	}
	
}





