// Imprimir por pantalla la suma de los n primeros números naturales, ingresando n por teclado.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_03 {
	public static void main(String [] arg) {
		int acum = 0;
		int cont = 0;

		Scanner tec = new Scanner(System.in);
		System.out.println("Dime un numero ");
		int num = tec.nextInt();
		
		while (cont < num) {

		
		cont = cont + 1 ;
		acum = acum + cont;
		

		}

System.out.println(acum);

	}

}