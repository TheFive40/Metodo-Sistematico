package Quimica;

import java.util.Scanner;

public class Hidruros_Sistematico { //NOMBRE DE LA CLASE
public void HidrurosS () {
	//DECLARAMOS DOS VARIABLES H VENDRIA SER EL HIDROGENO
	int H = 0;
	//N SERIA EL NUMERO DE H QUE TIENE
	int n;
	//PEDIMOS  QUE NOS INGRESE UN COMPUESTO POR TECLADO 
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa  el compuesto");
	String compuesto = entrada.nextLine();
	
	//CON UN BUCLE FOR RECORREMOS EL NUMERO DE CARACTERES QUE TIENE ALMACENADA LA VARIABLE COMPUESTO Y AUMENTARA EL VALOR DE I HASTA QUE NO SEA IGUAL AL NUMERO
	//DE CARACTERES DEL COMPUESTO
	for(int i = 0;i<compuesto.length();i++) {
		//EVALUAMOS CON UN CONDICIONAL SI COMPUESTO EN LA POSICION (RECORDEMOS QUE CON EL METODO CHARAT UBICAMOS EN DETERMINADA POSICION DE UNA CADENA DE 
		//CARACTERES (STRING) EL NUMERO DE LA POSICION DE LO INDICAMOS EN EL VALOR DE LA I COMO EN LA PRIMERA VUELTA I ES 0 LO UBICARA EN LA POSICION 0
		//SI HAY UNA H ENTONCES ME INCREMENTAS EL VALOR DE H EN 1
		if(compuesto.charAt(i)=='H') {
			H++;
		}
	}
	if(H==1) { //ACA SI H ES 1 ENTONCES LE PEDIMOS QUE NOS INGRESE EL  NUMERO DE GRUPOS DE H 
		System.out.println("Ingrese el numero de Grupos de H");
		n = entrada.nextInt();
		if(n==2) { //EVALUAMOS SI N ES IGUAL A 2 ES DECIR SI HAY 2 GRUPOS DE H ENTONCES SERA UN DI 
			System.out.println("Es un Dihidruro de: " +  compuesto);
		}else if(n==4) { //SI TIENE 4 GRUPOS DE H SERA UN TETRA (RECORDEMOS LA REGLA QUE SEGUIMOS PARA ESTABLECER LA NOMENCLATURA DE UN COMPUESTO)
			System.out.println("Es un Tetrahidruro de: " + compuesto);
			
		}else if(n==1) { //ACA SI HAY 1 GRUPO DE N ENTONCES TENDRA UN MONO  SEGUIDO DE LA PALABRA HIDRURO + EL NOMBRE DEL COMPUESTO QUE NOS INGRESO POR 
			//TECLADO EL USUARIO
			System.out.println("Es un monohidruro de: " + compuesto);
			
		}
	}
}

}
