package views;
import java.util.Scanner;

import controllers.ParqueController;
import controllers.ServicoController;
import models.Servico;
import models.Parque;
public class CadastrarServico {

	private static Servico servico;
	private static Parque parque;
	private static Scanner sc = new Scanner(System.in);
	private static ParqueController parqueController = ParqueController.retornarInstancia();

	
	
	public static void renderizar() {
		servico = new Servico();
		System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Serviço ---  \n");
		System.out.println("Digite o id do serviço: ");
		servico.setId(sc.nextInt());
		System.out.println("Digite o tipo do serviço: ");	
		servico.setTipo(sc.next());
		System.out.println("Digite o nome do serviço: ");	
		servico.setNome(sc.next());		
		System.out.println("Digite a descrição do serviço: ");
		servico.setDescricao(sc.next());
		System.out.println("Digite o número do parque: ");
		Listar.renderizarParque();
		parque = parqueController.getParque(sc.nextInt());
			if(parque != null) {
				servico.setParque(parque);
				if(ServicoController.cadastrar(servico)) {
					System.out.println("\n ---Serviço cadastrado com sucesso!!! ---");
				} else {
					System.out.println("Esse serviço já esta cadastrado!");
				}
			}else {
				System.out.println("\n --- Esse parque não existe --- ");
				System.out.println("\n --- Não foi possível cadastrar este serviço --- ");
			}
	}
}
	






