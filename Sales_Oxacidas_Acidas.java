package Quimica;

import java.util.Scanner;

public class Sales_Oxacidas_Acidas {
public void Sales_Acidas() { 
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el compuesto");
	String compuesto = entrada.nextLine();
	
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingrese el número de hidrogenos que tiene la sal oxacida acida ");
	int hidrogenos =  entrada2.nextInt();
	
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingrese el estado de Oxidacion del compuesto en números romanos");
	String Oxidacion = entrada3.nextLine();
	
	if(compuesto.contains("LiHPO") &&  hidrogenos == 1) {
		System.out.println("Es un Hidrógeno de fosfato " + Oxidacion + " de Litio ");
	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 2) {
		System.out.println("Es un Dihidrógeno de fosfato " + Oxidacion + " de Litio ");

	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 3) {
		System.out.println("Es un Hidrogeno tri atomico de fosfato " + Oxidacion + " de Litio ");

	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 4) {
		System.out.println("Es un Hidrogeno tetra atomico de fosfato " + Oxidacion + " de Litio ");

	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 10) {
		System.out.println("Es un Hidrogeno deca atomico de fosfato " + Oxidacion + " de Litio ");

	}
	
	
	
	if(compuesto.contains("KHCO") && hidrogenos == 1) {
		System.out.println("Es un Hidrógenocarbonato " + Oxidacion + " de potasio");
		
	}else if (compuesto.contains("KHCO") && hidrogenos == 2) {
		System.out.println("Es un Dihidrógenocarbonato " + Oxidacion + " de potasio");

	}else if (compuesto.contains("KHCO") && hidrogenos == 3) {
		System.out.println("Es un Hidrogeno tri atomico de carbonato " + Oxidacion + " de potasio");

	}else if (compuesto.contains("KHCO") && hidrogenos == 4) {
		System.out.println("Es un Hidrogeno tetra atomico de carbonato " + Oxidacion + " de potasio");

	}else if (compuesto.contains("KHCO") && hidrogenos == 10) {
		System.out.println("Es un Hidrogeno deca atomico de carbonato " + Oxidacion + " de potasio");

	}
	
	
	
	if(compuesto.contains("MgHPO") && hidrogenos == 1) {
		System.out.println("Es un Hidrógenofosfato " + Oxidacion + " De potasio");
	}else if (compuesto.contains("MgHPO") && hidrogenos == 2) {
		System.out.println("Es un Dihidrógenofosfato " + Oxidacion + " De potasio");
		
	}else if (compuesto.contains("MgHPO") && hidrogenos == 3) {
		System.out.println("Es un Hidrogeno tri atomico de fosfato " + Oxidacion + " De potasio");

	}else if (compuesto.contains("MgHPO") && hidrogenos == 4) {
		System.out.println("Es un Hidrogeno tetra atomico de fosfato " + Oxidacion + " De potasio");

	}else if (compuesto.contains("MgHPO") && hidrogenos == 10) {
		System.out.println("Es un Hidrogeno deca atomico de fosfato " + Oxidacion + " De potasio");

	}
	
	
	
	if (compuesto.contains("NaHPO") && hidrogenos == 1) {
		
	}
}

}
