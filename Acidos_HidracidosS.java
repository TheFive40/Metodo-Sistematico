package Quimica;

import java.util.Scanner;

public class Acidos_HidracidosS {
public void AcidoHidracido() {
	//A CONTINUACION SE ESTABLECEN  DOS VARIABLES DE TIPO ENTERO CONTADOR Y CONTADOR2 CONTADOR3 CONTADOR4 CUYO VALOR DENTRO DE LA MISMA ES IGUAL A 0
	//Y POR ULTIMO SE DECLARA UNA VARIABLE DE TIPO STRING LLAMADA COMPUESTO1
	int contador = 	0;
	int contador2 = 0;
	int contador3 = 0;
	int contador4 = 0;
	String compuesto1;
	//AQUI HACEMOS UNA ENTRADA DE DATOS CON LA CLASE SCANNER Y PEDIMOS EN LA SIGUIENTE LIENEA QUE EL USUARIO NOS INGRESE UN COMPUESTO EL CUAL GUARDAREMOS
	//EN LA VARIABLE COMPUESTO1 DE TIPO STRING
	Scanner input = new Scanner(System.in);
	System.out.println("Ingresa un compuesto");
	compuesto1 = input.nextLine();
	//DENTRO DE UN BUCLE FOR RECORREMOS LA CANTIDAD DE CARACTERES QUE HAY EN DEL COMPUESTO1 ES DECIR SI EL USUARIO NOS INGRESA "HClO" LA H SERA 0, C SERA 1
	//l SERA 2, O, SERA 3 ES DECIR NUESTRO COMPUESTO TIENE  CARACTERES, LA I  QUE ES UNA VARIABLE DECLARADA DENTRO DEL FOR ES 0 Y EL BUCLE NO DEJARA DE REPETIRSE
	//HASTA QUE EL VALOR DE I NO SEA IGUAL A NÚMERO DE CARACTERES QUE HAY EN COMPUESTO1 YA QUE EL METODO.LENGTH NOS DEVUELVE EL NUMERO DE CARACTERES
	for(int i = 0;i<compuesto1.length();i++) {
		//CON LA INSTRUCCION charAt(I) INDICAMOS QUE SE POSISIONE EN LA UBICACION 0 YA QUE CUANDO EL BUCLE INICIA LA  VARIABLE I VALE 0 ENTONCES EN NUESTRO EJEMPLO
		//CON EL COMPUESTO HCLO LA H ESTA EN LA POSICION 0 EN LA SEGUNDA VUELTA  DEL BUCLE SE POSESIONARA EN LA UBICACION 1 POR LO TANTO ESTARA EN LA LETRA C 
		compuesto1.charAt(i);
		//CON IF EVALUAMOS SI NUESTRO COMPUESTO CHAR AT DE I HAY UNA H ES DECIR 
		//SI EN LA POSICION 0 DE NUESTRO HCLO HAY UNA H COMO ESTA CONDICION ES VERDADERA ENTONCES CONTADOR SERA IGUL A 1 Y A SI SE HARA CON EL RESTO DE CONDICIONES
		//OBVIAMENTE AL ESTAR EN LA POSICION 0 TODAS LAS DEMAS DEVOLVERAN FALSO POR LO TANTO NO EJECUTARA EL CODIGO DE ADENTRO Y YA SE TENDRIA QUE ESPERAR A QUE EL VALOR 
		//DE LA VARIABLE INT I DECLARADA EN EL BUCLE FOR CAMBIARA ES DECIR AUEMNTARA EN LA SEGUNDA VUELTA Y YA VALDRIA 1 POR LO QUE SE POSECIONARIA EN LA UBICACION 1
		//GRACIAS AL METODO CHARAT Y EVALUARIA LA CONDICION
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
//AQUI SE EVALUAN LOS CONTADORES ESTABLECIDOS DENTRO DE LOS CONDICIONALES PARA ELLO SOLO TOMAREMOS UN EJEMPLO EL CUAL SERA EL PRIMER IF 
	//IF CONTADOR == 1 Y CONTADOR2 == 1 EL "&&" ES UN OPERADOR LOGICO PARA ANIDAR DOS CONDICIONES DENTRO DE UN IF ES DECIR SI ESTO SE CUMPLE Y ESTO TAMBIEN 
	//EJECUTA ESTA LINEA DE CODIGO QUE ESTA DENTRO DE LAS LLAVES "{" "}" QUE ES UN SYSTEM.OUT.PRINTLN QUE ES PARA IMPRIMIR MENSAJES EN CONSOLA
	//VAYAMOS HACIA ARRIBA CONTADOR ES IGUAL A 1 SI DENTRO DEL COMPUESTO INGRESADO POR EL USUARIO TIENE UNA "H" ENTONCES AQUI NO ESTA DICIENDO SI CONTADOR 1 TIENE "H"
	//LUEGO CONTADOR2 SE ESTABLECE IGUALMENTE EN LOS IF DE ARRIBA SI COMPUESTO TENIA UNA "F" SI JUNTAMOS LOS DOS SERIA ASI IF(CONTADOR == "H" Y CONTADOR2 == "F")
	//ES DECIR SI EL COMPUESTO INGRESADO ES UN HF SI ES UN HF ENTONCES ESTAMOS HABLANDO DE UN ACIDO FLUORHIDRICO
		
		
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
