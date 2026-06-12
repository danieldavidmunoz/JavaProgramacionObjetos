// Ingresa por teclado dos enteros y muestra el mayor valor
package introduccion.ejemplos;

import java.util.Scanner;

public class T05MayorDeDos {
	public static void main (String[] arg) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Ingresa un valor: ");
		int num_1 = tec.nextInt();

		System.out.print("Ingresa otro valor: ");
		int num_2 = tec.nextInt();

		if (num_1> num_2) {

		System.out.println("El " + num_1 + " es un número mayor que el " + num_2);

		} else {

		System.out.println("El " + num_2 + " es un número mayor que el " + num_1);
		}
		System.out.println("ADIOS");
		

		 
	}

}