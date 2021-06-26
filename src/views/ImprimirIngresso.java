package views;

import controllers.VendaIngressoController;
import models.Ingresso;

public class ImprimirIngresso {
	
	private static VendaIngressoController controller = VendaIngressoController.retornarInstancia();
	public static void renderizar() {
		System.out.println("\n--- IMPRESSÃO DO INGRESSO ---  \n");
		for(Ingresso vendaIngresso : controller.listar()) {
			System.out.println(vendaIngresso);
		}
	}
}