package Quimica;

import java.util.Scanner;

public class Sales_Oxacidas_Acidas {
public void Sales_Acidas() { 
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el compuesto");
	String compuesto = entrada.nextLine();
	
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingrese el n�mero de hidrogenos que tiene la sal oxacida acida ");
	int hidrogenos =  entrada2.nextInt();
	
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingrese el estado de Oxidacion del compuesto en n�meros romanos");
	String Oxidacion = entrada3.nextLine();
	
	if(compuesto.contains("LiHPO") &&  hidrogenos == 1) {
		System.out.println("Es un Hidr�geno de fosfato " + Oxidacion + " de Litio ");
	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 2) {
		System.out.println("Es un Dihidr�geno de fosfato " + Oxidacion + " de Litio ");

	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 3) {
		System.out.println("Es un Hidrogeno tri atomico de fosfato " + Oxidacion + " de Litio ");

	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 4) {
		System.out.println("Es un Hidrogeno tetra atomico de fosfato " + Oxidacion + " de Litio ");

	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 10) {
		System.out.println("Es un Hidrogeno deca atomico de fosfato " + Oxidacion + " de Litio ");

	}
	
	
	
	if(compuesto.contains("KHCO") && hidrogenos == 1) {
		System.out.println("Es un Hidr�genocarbonato " + Oxidacion + " de potasio");
		
	}else if (compuesto.contains("KHCO") && hidrogenos == 2) {
		System.out.println("Es un Dihidr�genocarbonato " + Oxidacion + " de potasio");

	}else if (compuesto.contains("KHCO") && hidrogenos == 3) {
		System.out.println("Es un Hidrogeno tri atomico de carbonato " + Oxidacion + " de potasio");

	}else if (compuesto.contains("KHCO") && hidrogenos == 4) {
		System.out.println("Es un Hidrogeno tetra atomico de carbonato " + Oxidacion + " de potasio");

	}else if (compuesto.contains("KHCO") && hidrogenos == 10) {
		System.out.println("Es un Hidrogeno deca atomico de carbonato " + Oxidacion + " de potasio");

	}
	
	
	
	if(compuesto.contains("MgHPO") && hidrogenos == 1) {
		System.out.println("Es un Hidr�genofosfato " + Oxidacion + " De potasio");
	}else if (compuesto.contains("MgHPO") && hidrogenos == 2) {
		System.out.println("Es un Dihidr�genofosfato " + Oxidacion + " De potasio");
		
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
