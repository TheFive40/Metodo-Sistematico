package Quimica;

import java.util.Scanner;

public class Sales_Holoideas { //NOMBRE DE LA CLASE 
public void Sales_Haloideas() { //CREAMOS UN METODO SETTER
	//PEDIMOS QUE EL USUARIO NOS INGRESE POR TECLADO EL COMPUESTO 
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese el compuesto");
	String compuesto = entrada.nextLine();
	//ACA LE PEDIMOS QUE NOS INGRESE EL NUMERO DE ATOMOS DEL ELEMENTO NO METALICO
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingrese el número de atomos del elemento no metalico ");
	int atomos = entrada2.nextInt();
	//LE PEDIMOS QUE NOS INGRESE EL NUMERO DE ATOMOS DEL ELEMENTO METALICO
	Scanner entrada4 = new Scanner(System.in);
	System.out.println("Ingrese el número de atomos del elemento  metalico ");
	int metal = entrada4.nextInt();
	
	//POR ULTIMO LE PEDIMOS QUE NOS INGRESE  EL ESTADO DE OXIDACION DEL COMPUESTO EN NUMEROS ROMANOS
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingrese el estado de Oxidacion del compuesto en números romanos");
	String Oxidacion = entrada3.nextLine();
	
	//EVALUAMOS SI EN LA VARIABLE COMPUESTO QUE NOS INGRESO EL USUARIO POR TECLADO CONTIENE O SE TRATA DEL COMPUESTO CaCl ANIDADO A ESO
	//EVALUAMOS SI LOS ATOMOS INGRESADOS POR EL USUARIO ES 1 Y SI EL NUMERO DEL ELEMENTO METALICO ES 1
	if (compuesto.contains("CaCl") && atomos == 1 && metal == 1) {
		System.out.println("Es un cloruro  de calcio"); //ENTONCES IMPRIMIMOS EN CONSOLA EL SIGUIENTE MENSAJE "ES UN CLORURO DE CALCIO"

	}else if (compuesto.contains("CaCl") && atomos == 2 && metal == 1) { //SI COMPUESTO CONTIENE CaCL Y EL NUMERO DE ATOMOS ES 2 Y EL NUMERO DEL ELEMENTO METALICO ES 1
		System.out.println("Es un dicloruro  de calcio"); //ESTAMOS HABLANDO DE UN DI CLORURO DE CALCIO Y ASI HACEMOS CON LOS OTROS IF
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
