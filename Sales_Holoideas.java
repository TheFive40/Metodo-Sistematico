package Quimica;

import java.util.Scanner;

public class Sales_Holoideas {
public void Sales_Haloideas() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el compuesto");
	String compuesto = entrada.nextLine();
	
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingrese el número de atomos del elemento no metalico ");
	int atomos = entrada2.nextInt();
	
	Scanner entrada4 = new Scanner(System.in);
	System.out.println("Ingrese el número de atomos del elemento  metalico ");
	int metal = entrada4.nextInt();
	
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingrese el estado de Oxidacion del compuesto en números romanos");
	String Oxidacion = entrada3.nextLine();
	
	if (compuesto.contains("CaCl") && atomos == 1 && metal == 1) {
		System.out.println("Es un cloruro  de calcio");

	}else if (compuesto.contains("CaCl") && atomos == 2 && metal == 1) {
		System.out.println("Es un dicloruro  de calcio");
	}else if (compuesto.contains("CaCl") && atomos == 3 && metal == 1) {
		System.out.println("Es un Tricloruro  de calcio");

	}
	
	if (compuesto.contains("AlCl") && atomos == 1 && metal == 1) {
		System.out.println("Es un cloruro de aluminio");
	}else if (compuesto.contains("AlCl") && atomos == 2 && metal == 1) {
		System.out.println("Es un Dicloruro de aluminio");

	}else if (compuesto.contains("AlCl") && atomos == 3 && metal == 1) {
		System.out.println("Es un Tricloruro de aluminio");

	}else if (compuesto.contains("AlCl") && atomos == 4 && metal == 1) {
		System.out.println("Es un Tetracloruro de aluminio");

	}
	
	if (compuesto.contains("AlS") && atomos == 1 && metal == 1) {
		System.out.println("Es un Sulfuro de aluminio");

	}else if (compuesto.contains("AlS") && atomos == 2 && metal == 1) {
		System.out.println("Es un Disulfuro de aluminio");

	}else if (compuesto.contains("AlS") && atomos == 4 && metal == 1) {
		System.out.println("Es un Tetrasulfuro de aluminio");

	}else if (compuesto.contains("AlS") && atomos == 10 && metal == 1) {
		System.out.println("Es un Decasulfuro de aluminio");

	}else if (compuesto.contains("AlS") && atomos == 3 && metal == 2) {
		System.out.println("Es un Trisulfuro de dialuminio");

	}
}
}
	/*public static void main(String[] args) {
		Sales_Holoideas objeto = new Sales_Holoideas();
		objeto.Sales_Haloideas();
	}

}
*/