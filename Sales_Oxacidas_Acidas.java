package Quimica;

import java.util.Scanner;

public class Sales_Oxacidas_Acidas { //NOMBRE DE LA CLASE
public void Sales_Acidas() { //CREAMOS METODO SETTER
	//PEDIMOS QUE NOS INGRESE EL COMPUESTO POR TECLADO
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el compuesto");
	String compuesto = entrada.nextLine();
	//PEDIMOS QUE NOS INGRESE EL NUMERO DE HIDROGENOS QUE TIENE LA SAL OXACIDA
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingrese el número de hidrogenos que tiene la sal oxacida acida ");
	int hidrogenos =  entrada2.nextInt();
	
	//PEDIMOS QUE NOS INGRESE POR TECLADO EL ESTADO DE OXIDACION DEL COMPUESTO EN NUMEROS ROMANOS
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingrese el estado de Oxidacion del compuesto en números romanos");
	String Oxidacion = entrada3.nextLine();
	
	//EVALUAMOS CON UN IF LA SIGUIENTE CONDICION QUE SE LEERIA DE LA SIGUIENTE MANERA 
	//SI LA VARIABLE COMPUESTO CONTIENE EL COMPUESTO "LiHPO" Y TIENE UN NUMERO DE HIDROGENOS
	if(compuesto.contains("LiHPO") &&  hidrogenos == 1) {
		System.out.println("Es un Hidrógeno de fosfato " + Oxidacion + " de Litio "); //ENTONCES HABLAMOS DE UN HIDROGRNO DE FOSF ATO + ESTADO DE OXIDACION
		//INGRESADO POR EL USUARIO + DE LITIO QUEDARIA ASI "ES UN HIDROGENO DE FOSFATO (ESTADO DE OXIDACION) DE LITIO
	}else if (compuesto.contains("LiHPO") &&  hidrogenos == 2) {
		System.out.println("Es un Dihidrógeno de fosfato " + Oxidacion + " de Litio ");

		//A CONTINUACION SE SEGUIRA LA MISMA REGLA PARA EL RESTO DE IF
		
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
