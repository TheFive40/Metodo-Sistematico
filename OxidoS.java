package Quimica;

import java.util.Scanner;

public class OxidoS {
	public void MetodoOxido() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa un compuesto");
	String compuesto = entrada.nextLine();
	System.out.println("Indica cuantos atomos de oxigeno hay en tú elemento");
	int atomos = entrada.nextInt();
	if(atomos==1) {
		System.out.println("Tú compuesto   Es un Monoxido " + compuesto );
	}else if (atomos==2) {
		System.out.println("Tú compuesto  Es un dioxido de: " + compuesto);
	}else if (atomos == 3) {
		System.out.println("Tu compuesto es un Trioxido de " + compuesto);
	}
}

}
