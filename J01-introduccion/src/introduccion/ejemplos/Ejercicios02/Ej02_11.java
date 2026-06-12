// 11 Escribir un programa que imprima las tablas del 1 al 9.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_11 {
	
	public static void main(String [] arg) {
	int cont = 1;
	int cont_2 =1;
	while (cont<10) {
		System.out.println(cont + " x " + cont_2+ " = " + cont_2*cont);
		cont = cont + 1; 	
		
		while (cont_2<10) {
			System.out.println(cont_2 + " x " + cont_2 + " = " + cont*cont_2);
			cont = cont + 1; 	



			}

		}
	

	}
}