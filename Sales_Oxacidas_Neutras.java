package Quimica;

import java.util.Scanner;

public class Sales_Oxacidas_Neutras {
public void Sal_oxacidas() {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Establece el prefijo");
	int oxigenos = entrada.nextInt();
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingresa el compuesto");
	String compuesto1 = entrada2.nextLine();
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingresa el número de oxidacion");
	String Oxidacion = entrada3.nextLine();
	if(compuesto1.contains("NaClO") && oxigenos == 1) {
		System.out.println("Es un Oxonitrato " + Oxidacion + " de sodio");
	}else if (compuesto1.contains("NaClO") && oxigenos == 2) {
		System.out.println("Es un Dioxonitrato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaClO") && oxigenos == 3) {
		System.out.println("Es un Trioxonitrato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaClO") && oxigenos == 4) {
		System.out.println("Es un Tetraoxonitrato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaClO") && oxigenos == 10) {
		System.out.println("Es un Decaoxonitrato " + Oxidacion + " de sodio");

	}
	
	
	
	if(compuesto1.contains("Ca(NO)") && oxigenos == 1) {
		System.out.println("Es un Oxonitrato " + Oxidacion + "de calcio");
	}else if (compuesto1.contains("Ca(NO)") && oxigenos == 2) {
		System.out.println("Es un Dioxonitrato " + Oxidacion + " de calcio");

	}else if (compuesto1.contains("Ca(NO)") && oxigenos == 3) {
		System.out.println("Es un Trioxonitrato " + Oxidacion + "de calcio");

	}else if (compuesto1.contains("Ca(NO)") && oxigenos == 4) {
		System.out.println("Es un Tetraoxonitrato " + Oxidacion + "de calcio");

	}else if (compuesto1.contains("Ca(NO)") && oxigenos == 10) {
		System.out.println("Es un Decaoxonitrato " + Oxidacion + "de calcio");

	}
	
	
	
	if(compuesto1.contains("FeCO") && oxigenos == 1) {
		System.out.println("Es un Oxocarbonato " + Oxidacion + " de hierro");
	}else if (compuesto1.contains("FeCO") && oxigenos == 2) {
		System.out.println("Es un Dioxocarbonato " + Oxidacion + " de hierro");

	}else if (compuesto1.contains("FeCO") && oxigenos == 3) {
		System.out.println("Es un Trioxocarbonato " + Oxidacion + " de hierro");

	}else if (compuesto1.contains("FeCO") && oxigenos == 4) {
		System.out.println("Es un Tetraoxocarbonato " + Oxidacion + " de hierro");

	}else if (compuesto1.contains("FeCO") && oxigenos == 10) {
		System.out.println("Es un Decaoxocarbonato " + Oxidacion + " de hierro");

	}
	
	
	
	if(compuesto1.contains("NaCO") && oxigenos == 1) {
		System.out.println("Es un Oxocarbonato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaCO") && oxigenos == 2) {
		System.out.println("Es un Dioxocarbonato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaCO") && oxigenos == 3) {
		System.out.println("Es un Trioxocarbonato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaCO") && oxigenos == 4) {
		System.out.println("Es un Tetraoxocarbonato " + Oxidacion + " de sodio");

	}else if (compuesto1.contains("NaCO") && oxigenos == 10) {
		System.out.println("Es un Decaoxocarbonato " + Oxidacion + " de sodio");

	}
	
	
	
	if (compuesto1.contains("MgSO") && oxigenos == 1) {
		System.out.println("Es un Oxo sulfato " + Oxidacion + " de manganesio");
	}else if (compuesto1.contains("MgSO") && oxigenos == 2) {
		System.out.println("Es un Dioxo sulfato " + Oxidacion + " de manganesio");

	}else if (compuesto1.contains("MgSO") && oxigenos == 3) {
		System.out.println("Es un Trioxo sulfato " + Oxidacion + " de manganesio");

	}else if (compuesto1.contains("MgSO") && oxigenos == 4) {
		System.out.println("Es un Tetraoxo sulfato " + Oxidacion + " de manganesio");

	}else if (compuesto1.contains("MgSO") && oxigenos == 10) {
		System.out.println("Es un Decaoxo sulfato " + Oxidacion + " de manganesio");

	}
}
	

}
