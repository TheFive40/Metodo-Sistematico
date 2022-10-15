package Quimica;

import java.util.Scanner;

public class Hidruros_Sistematico {
public void HidrurosS () {
	int H = 0;
	int n;
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa  el compuesto");
	String compuesto = entrada.nextLine();
	for(int i = 0;i<compuesto.length();i++) {
		if(compuesto.charAt(i)=='H') {
			H++;
		}
	}
	if(H==1) {
		System.out.println("Ingrese el numero de Grupos de H");
		n = entrada.nextInt();
		if(n==2) {
			System.out.println("Es un Dihidruro de: " +  compuesto);
		}else if(n==4) {
			System.out.println("Es un Tetrahidruro de: " + compuesto);
			
		}else if(n==1) {
			System.out.println("Es un monohidruro de: " + compuesto);
			
		}
	}
}

}
