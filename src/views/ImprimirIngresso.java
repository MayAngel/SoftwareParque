package views;

import controllers.VendaIngressoController;
import models.Ingresso;

public class ImprimirIngresso {
	
	public static void renderizar() {
		System.out.println("\n--- IMPRESS�O DO INGRESSO ---  \n");
		for(Ingresso vendaIngresso : VendaIngressoController.listar()) {
			System.out.println(vendaIngresso);
		}
	}
}