package Quimica;

import java.util.Scanner;

public class Oxidos { //Nombre de la clase 
	public void MetodoOxido() { //Metodo setter en donde redactaremos las acciones y propiedades
	Scanner entrada = new Scanner(System.in); //Se instancia un objeto de la clase Entrada donde el usuario nos hara una entrada de datos 
	System.out.println("Ingresa un compuesto"); //MUESTRA UN MENSAJE EN CONSOLA
	String compuesto = entrada.nextLine(); //En la variable compuesto de tipo Caracter (String) se guarda la informacion suministrada por el usuario en Entrada
	System.out.println("Indica cuantos atomos de oxigeno hay en tú elemento");
	int atomos = entrada.nextInt(); //Se le pide al usuario que ingrese los atomos de su compuesto
	if(atomos==1) { //se Evalua una condicion con un if (SI EL NÚMERO DE ATOMOS INGRESADO POR EL USUARIO ES 1) ES DECIR SI SU COMPUESTO TIENE 1 ATOMO
		System.out.println("Tú compuesto   Es un Monoxido " + compuesto ); //A CONTINUACION VAS A IMPRIMIR LA NOMENCLATURA QUE DEPENDERA DE LOS ATOMOS QUE INGRESE
	}else if (atomos==2) {
		System.out.println("Tú compuesto  Es un dioxido de: " + compuesto);
	}else if (atomos == 3) {
		System.out.println("Tu compuesto es un Trioxido de " + compuesto);
	}
}

}
