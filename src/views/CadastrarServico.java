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
		System.out.println("\n  --- Cadastrar Servi�o ---  \n");
		System.out.println("Digite o id do servi�o: ");
		servico.setId(sc.nextInt());
		System.out.println("Digite o tipo do servi�o: ");	
		servico.setTipo(sc.next());
		System.out.println("Digite o nome do servi�o: ");	
		servico.setNome(sc.next());		
		System.out.println("Digite a descri��o do servi�o: ");
		servico.setDescricao(sc.next());
		System.out.println("Digite o n�mero do parque: ");
		Listar.renderizarParque();
		parque = parqueController.getParque(sc.nextInt());
			if(parque != null) {
				servico.setParque(parque);
				if(ServicoController.cadastrar(servico)) {
					System.out.println("\n ---Servi�o cadastrado com sucesso!!! ---");
				} else {
					System.out.println("Esse servi�o j� esta cadastrado!");
				}
			}else {
				System.out.println("\n --- Esse parque n�o existe --- ");
				System.out.println("\n --- N�o foi poss�vel cadastrar este servi�o --- ");
			}
	}
}
	






