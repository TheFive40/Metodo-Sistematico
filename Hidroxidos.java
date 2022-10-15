package Quimica;

import java.util.Scanner;

public class Hidroxidos {
	public void HidroxidosS() {
		int Oxigeno = 0;
		int Hidrogeno = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un compuesto");
		String Compuesto = entrada.nextLine();
		for(int i = 0; i<Compuesto.length();i++) {
			if(Compuesto.charAt(i)=='O') {
			Oxigeno++;
			}else if (Compuesto.charAt(i)=='H') {
			Hidrogeno++;
			}
		}
		if(Oxigeno == 1 && Hidrogeno == 1) {
			System.out.println("¿Cuantos n de GRUPOS OH hay en el compuesto?");
			int n = entrada.nextInt();
			if(n==2) {
				System.out.println("Tú compuesto es un Dihidróxido de " +  Compuesto);
			}else if (n==4) {
				System.out.println("Tú compuesto es un Tetrahidróxido  de " +  Compuesto);

			}else if (n==1) {
				System.out.println("Tú compuesto es un Hidróxido de " +  Compuesto);

			}
		}
	}
	

}
