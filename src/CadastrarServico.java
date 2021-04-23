import java.util.Scanner;

import controllers.ServicoController;
import models.Servico;
public class CadastrarServico {

	private static Servico servico;
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void renderizar() {
		servico = new Servico();
		System.out.println("\n".repeat(20));
		System.out.println("\\n  --- Cadastrar Serviço ----  \\n");
		System.out.println("Digite o tipo do serviço: ");	
		servico.setTipo(sc.next());
		System.out.println("Digite o nome do serviço: ");	
		servico.setNome(sc.next());		
		System.out.println("Digite a descrição do serviço: ");
		servico.setDescricao(sc.next());		
		
		if(ServicoController.cadastrar(servico)) {
			System.out.println("\n ---Serviço cadastrado com sucesso!!! ---");
		} else {
			System.out.println("Esse serviço já esta cadastrado!");
		}
	}
	
}





