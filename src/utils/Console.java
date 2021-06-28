package utils;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	
	public static int lerInteiro(String msg) {
		boolean valorCorreto = false;
		int valor = 0;
		do {
			try {
				System.out.println(msg);
				valor = Integer.parseInt(sc.next());
				valorCorreto = true;
			} catch (NumberFormatException e) {
				System.out.println("\nDigite apenas números");
			} 
		}while(!valorCorreto);
		return valor;
	}
}

