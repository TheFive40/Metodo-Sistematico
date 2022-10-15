package Quimica;

import java.util.Scanner;

public class Acidos_HidracidosS {
public void AcidoHidracido() {
	int contador = 	0;
	int contador2 = 0;
	int contador3 = 0;
	int contador4 = 0;
	String compuesto1;
	Scanner input = new Scanner(System.in);
	System.out.println("Ingresa un compuesto");
	compuesto1 = input.nextLine();
	for(int i = 0;i<compuesto1.length();i++) {
		compuesto1.charAt(i);
		if(compuesto1.charAt(i)=='H') {
		contador = 1;
		}
		if (compuesto1.charAt(i)=='F') {
			contador2 = 1;
		}

			else if(compuesto1.charAt(i)=='B') {
				contador2 = 2;
			}
			else if (compuesto1.charAt(i)=='r') {
					contador3 = 1;
			}
		else if (compuesto1.charAt(i)=='I') {
			contador2 = 3;
	}else if (compuesto1.charAt(i)=='C') {
		contador2 = 4;
	}
	else if(compuesto1.charAt(i)=='l') {
			contador3 = 2;
		}
	else if(compuesto1.charAt(i)=='2') {
	contador4 = 1;
	}
	if(compuesto1.charAt(i)=='S') {
		contador2 = 5;
	}
		if(compuesto1.charAt(i)=='e') {
			contador3 = 3;
		}
	
	if(compuesto1.charAt(i)=='T') {
		contador2 = 6;
	}
		if(compuesto1.charAt(i)=='e') {
			contador3 = 4;
		}
	}

		
		
		if(contador == 1 && contador2 == 1) {
		System.out.println("Es un Acido Fluorhidrico");
	}else if (contador == 1 && contador2 == 2 && contador3 == 1) {
		System.out.println("Es un acido Bromhidrico");
	}else if (contador == 1 && contador2 == 3) {
		System.out.println("Es un acido yodhidrico");
	}else if (contador == 1 && contador2 == 4 && contador3 == 2) {
		System.out.println("Es un acido clorhídrico");
	}else if (contador == 1 && contador4 == 1 && contador2 == 5 && contador3 == 3) {
		System.out.println("Es un acido selenhídrico");
	}else if (contador == 1 && contador4 == 1 && contador2 == 6 && contador3 == 4) {
		System.out.println("Es un acido telurhidrico");
	}
	}
	


}
