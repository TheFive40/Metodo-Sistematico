package Quimica;

import java.util.Scanner;

public class Acidos_Oxacidos {
	//POR MEDIO DE ESTOS PARAMETROS PEDIMOS QUE NOS INGRESE EL PREFIJO YA QUE LA NOMENCLATURA DEPENDERA DEL PREFIJO QUE LE INGRESEMOS
	//Y ACORDEMOS QUE EN LA GUIA EL NOMBRE O LA NOMENCLATURA DEBE IR ACOMPAÑADA CON EL ESTADO DE OXIDACION EN ESCRITA EN NUMEROS ROMANOS POR LO TANTO
	//EL PROGRAMADOR DEBERA INGRESAR EL ESTADO DE OXIDACION EN EL PARAMETRO DE TAL MANERA QUE  QUEDE ASI
	//Objeto.NomenclaturaOxacidos(2, "HBrO", "(II)"); ESTO ES UN EJEMPLO EL  PRIMER PARAMETRO QUE ES EL 2 SERIA EL PREFIJO EL SEGUNDO EL COMPUESTO 
	//Y EL TERCER PARAMETRO SU ESTADO DE OXIDACION
	
public void NomenclaturaOxacidos(int Prefijo, String compuesto1,  String Oxidacion) {
	//SE DECLARAN LOS CONTADORES QUE ANTERIORMENTE SE HABIAN USADO Y EXPLICADO EN EL ARCHIVO O CLASE DE LOS ACIDOS HIDRACIDOS SI NO ENTIENDE EL USO DE ESTOS CONTADORES
	//POR FAVOR LEER EL ARCHIVO
	int contador  = 0;
	int contador1 = 0;
	int contador2 = 0;
	int contador3 = 0;
	int contador4 = 0;
	int contador5 = 0;
	int contador6 = 0;
	//SE DECLARA UN BUCLE FOR PARA QUE RECORRA Y CUENTA LA CANTIDAD DE CARACTERES DEL COMPUESTO INGRESADO POR EL USUARIO ESTE BUCLE NO DEJARA DE REPETIRSE
	//HASTA QUE I SEA IGUAL AL NUMERO DE CARACTERES DEL COMPUESTO
	for(int i = 0;i<compuesto1.length();i++) {
		//---------------EVALUAR EL COMPUESTO-------------//  
		//SI COMPUESTO ME LO UBICAS EN LA POSICION 0 CONTIENE UNA H CONTADOR ES IGUAL A 1 Y ASI CON LOS OTROS CONDICIONALES QUE SE EVALUARAN
		//EN CASO DE DAR FALSO AUN CONDICIONAL PASARA A EVALUAR OTRO CONDICIONAL Y ASI SUCESIVAMENTE GRACIAS A LA INSTRUCCION ELSE IF
		if(compuesto1.charAt(i)=='H') {
			contador = 1;
		}else if (compuesto1.charAt(i)=='B') {
			contador1 = 1;
		}else if (compuesto1.charAt(i)=='r') {
			contador4 = 1;
		}else if(compuesto1.charAt(i)=='I') {
			contador1 = 2;
		}else if (compuesto1.charAt(i)=='O') {
			contador3 = 2;
			
		}else if(compuesto1.charAt(i)=='C') {
			contador2 = 1;
		}else if (compuesto1.charAt(i)=='l') {
			contador1 = 3;
		}else if (compuesto1.charAt(i)=='M') {
			contador1 = 4;
		}else if (compuesto1.charAt(i)=='n') {
			contador2 = 2;
		}else if (compuesto1.charAt(i)=='S') {
			contador1 = 5;
		}else if (compuesto1.charAt(i)=='e') {
			contador2 = 3;
		}else if (compuesto1.charAt(i)=='T') {
			contador1 = 6;
		}else if (compuesto1.charAt(i)== 'P') {
			contador1 = 7;
		}else if (compuesto1.charAt(i)=='N') {
			contador2 = 4;
		}else if (compuesto1.charAt(i)=='_') {
			contador5 = 1;
		}
	//-----------------ESTABLECER NOMENCLATURA--------------//
	//HBRO
	if(contador == 1 && contador1 == 1 && contador4 == 1  && contador3 == 2 && Prefijo == 1){
			System.out.println("Es un Oxobromato " + Oxidacion +   "De Hidrógeno");
		}else if(contador == 1 && contador1 == 1 && contador4 == 1  && contador3 == 2 && Prefijo == 2) {
			System.out.println("Es un Dioxobromato " + Oxidacion + " De Hidrógeno");
		}else if(contador == 1 && contador1 == 1 && contador4 == 1  && contador3 == 2 && Prefijo == 3) {
			System.out.println("Es un Trioxobromato " + Oxidacion + " De Hidrógeno");

		}else if (contador == 1 && contador1 == 1 && contador4 == 1  && contador3 == 2 && Prefijo == 4) {
			System.out.println("Es un Tetraoxobromato " + Oxidacion + " De Hidrógeno");

		}else if (contador == 1 && contador1 == 1 && contador4 == 1  && contador3 == 2 && Prefijo == 10) {
			System.out.println("Es un Decaoxobromato " + Oxidacion + " De Hidrógeno");

		}
	
	
	if(contador == 1 && contador2 == 1 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxoyodato " + Oxidacion + " De Hidrogeno");
	}else if(contador == 1 && contador1 == 2 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxoyodato " + Oxidacion + " De Hidrógeno");
	}else if (contador == 1 && contador1 == 2 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxoyodato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador1 == 2 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxoyodato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador1 == 2 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxoyodato " + Oxidacion + " De Hidrógeno");

	}
	
	 
	if (contador == 1 && contador1 == 3 && contador2 == 1 && Prefijo == 1) {
		System.out.println("Es un Oxoclorato " + Oxidacion + " De Hidrógeno");
		
	}else if (contador == 1 && contador1 == 3 && contador2 == 1 && Prefijo == 2) {
		System.out.println("Es un Dioxoclorato " + Oxidacion + " De Hidrógeno");
		
	}else if (contador == 1 && contador1 == 3 && contador2 == 1 && Prefijo == 3) {
		System.out.println("Es un Trioxoclorato " + Oxidacion  + " De Hidrógeno");
		
	}else if (contador == 1 && contador1 == 3 && contador2 == 1 && Prefijo == 4) {
		System.out.println("Es un Tetraoxoclorato " + Oxidacion  + " De Hidrógeno");
		
	}else if (contador == 1 && contador1 == 3 && contador2 == 1 && Prefijo == 10) {
		System.out.println("Es un Decaoxoclorato " + Oxidacion  + " De Hidrógeno");
		
	}
	
	if(contador == 1 &&  contador1 == 4 && contador2 == 2 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxomanganato " + Oxidacion + " De Hidrógeno ");
	}else if(contador == 1 &&  contador1 == 4 && contador2 == 2 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxomanganato " + Oxidacion + " De Hidrógeno");
	}else if (contador == 1 &&  contador1 == 4 && contador2 == 2 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxomanganato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 &&  contador1 == 4 && contador2 == 2 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxomanganato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 &&  contador1 == 4 && contador2 == 2 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxomanganato " + Oxidacion + " De Hidrógeno ");
	}
	
	
	if(contador == 1 && contador1 == 5 && contador2 == 3 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxoseleniato " + Oxidacion + " De Hidrógeno ");
	}else if(contador == 1 && contador1 == 5 && contador2 == 3 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxoseleniato " + Oxidacion + " De Hidrógeno ");
	}else if(contador == 1 && contador1 == 5 && contador2 == 3 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxoseleniato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 && contador1 == 5 && contador2 == 3 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxoseleniato" + Oxidacion + " De Hidrógeno");
	}else if (contador == 1 && contador1 == 5 && contador2 == 3 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxoseleniato" + Oxidacion + " De Hidrógeno");
	}
	
	
	if (contador == 1 && contador1 == 6 && contador2 == 3 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxotelurato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 && contador1 == 6 && contador2 == 3 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxotelurato " + Oxidacion + "De Hidrógeno ");
	}else if (contador == 1 && contador1 == 6 && contador2 == 3 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxotelurato " + Oxidacion + "De Hidrógeno ");
	}else if (contador == 1 && contador1 == 6 && contador2 == 3 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxotelurato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 && contador1 == 6 && contador2 == 3 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxotelurato " + Oxidacion + " De Hidrógeno ");
	}
	//error 2 contador = 1 contador1 = 1contador3 = 2
	if(contador == 1 && contador5 == 1 && contador1 == 1  && contador3 == 2   && Prefijo == 1) {
		System.out.println("Es un Oxoborato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 && contador5 == 1 && contador1 == 1  && contador3 == 2  && Prefijo == 2) {
		System.out.println("Es un Dioxoborato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador5 == 1 && contador1 == 1  && contador3 == 2  && Prefijo == 3) {
		System.out.println("Es un Trioxoborato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador5 == 1 && contador1 == 1  && contador3 == 2   && Prefijo == 4) {
		System.out.println("Es un Tetraoxoborato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador5 == 1 && contador1 == 1  && contador3 == 2  && Prefijo == 10) {
		System.out.println("Es un Decaoxoborato " + Oxidacion + " De Hidrógeno ");
	}
	
	
	if(contador == 1 && contador2 == 1 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxocarbonato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxocarbonato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxocarbonato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxocarbonato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxocarbonato " + Oxidacion + " De Hidrógeno ");
	}
	
	/*
	if (contador == 1 && contador1 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxobromato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 && contador1 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxobromato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxobromato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxobromato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxobromato " + Oxidacion + " De Hidrógeno ");
	}
	*/
	
	if(contador == 1 && contador2 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxocromato " + Oxidacion + " De Hidrógeno ");
	}else if (contador == 1 && contador2 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxocromato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxocromato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxocromato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador2 == 1 && contador4 == 1 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxocromato " + Oxidacion + " De Hidrógeno ");

	}
	
	
	if(contador == 1 && contador1 == 5 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxosulfato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 5 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxosulfato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 5 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxosulfato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 5 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxosulfato " + Oxidacion + " De Hidrógeno ");

	}else if (contador == 1 && contador1 == 5 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxosulfato " + Oxidacion + " De Hidrógeno ");
	}
	
	
	if(contador == 1 && contador1 == 7 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxofosfato " + Oxidacion + " De Hidrógeno");
	}else if (contador == 1 && contador1 == 7 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxofosfato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador1 == 7 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxofosfato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador1 == 7 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxofosfato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador1 == 7 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxofosfato " + Oxidacion + " De Hidrógeno");

	}
	
	
	if(contador == 1 && contador2 == 4 && contador3 == 2 && Prefijo == 1) {
		System.out.println("Es un Oxonitrato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador2 == 4 && contador3 == 2 && Prefijo == 2) {
		System.out.println("Es un Dioxonitrato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador2 == 4 && contador3 == 2 && Prefijo == 3) {
		System.out.println("Es un Trioxonitrato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador2 == 4 && contador3 == 2 && Prefijo == 4) {
		System.out.println("Es un Tetraoxonitrato " + Oxidacion + " De Hidrógeno");

	}else if (contador == 1 && contador2 == 4 && contador3 == 2 && Prefijo == 10) {
		System.out.println("Es un Decaoxonitrato " + Oxidacion + " De Hidrógeno");

	}
}
}
}
/*public static void main(String[] args) {
	System.out.println("Ingresa el número de atomicidad estequiometrica");
	Scanner entrada = new Scanner(System.in);
	int numero = entrada.nextInt();
	Scanner entrada2 = new Scanner(System.in);
	System.out.println("Ingresa el compuesto");
	String compuesto =  entrada2.nextLine();
	Scanner entrada3 = new Scanner(System.in);
	System.out.println("Ingresa el número de oxidacion");
	String oxidacion = entrada3.nextLine();
	Acidos_Oxacidos objeto = new Acidos_Oxacidos();
objeto.NomenclaturaOxacidos(numero, compuesto , oxidacion);
}
}


*/
