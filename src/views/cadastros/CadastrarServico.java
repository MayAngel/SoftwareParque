package views.cadastros;
import java.util.Scanner;

import controllers.OriginController;
import models.Servico;
import util.Console;
import views.Listar;
import models.Parque;
public class CadastrarServico {

	private static Servico servico;
	private static Parque parque;
	private static Scanner sc = new Scanner(System.in);
	private static OriginController originController = OriginController.retornarInstancia();

	public static void renderizar() {
		servico = new Servico();
		System.out.println("\n".repeat(1));
		System.out.println("\n  --- Cadastrar Serviço ---  \n");
		servico.setId(Console.lerInteiro("Digite o id do serviço: "));
		System.out.println("Digite o tipo do serviço: ");	
		servico.setTipo(sc.next());
		System.out.println("Digite o nome do serviço: ");	
		servico.setNome(sc.next());		
		System.out.println("Digite a descrição do serviço: ");
		servico.setDescricao(sc.next());
		Listar.renderizarParque();
		parque = originController.getParque(Console.lerInteiro("Digite o número do parque: "));
			if(parque != null) {
				servico.setParque(parque);
				if(originController.cadastrar(servico)) {
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
	






