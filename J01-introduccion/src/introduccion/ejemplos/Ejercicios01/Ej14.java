//14 Hacer un programa que Dado un año indicar si es bisiesto. Un año es bisiesto si es un número divisible por 4, pero si es divisible por 100 debe ser es divisible por 400
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej14 {
	public static void main (String [] rang) {
	@SuppressWarnings("resource")
	Scanner tec = new Scanner(System.in);
	System.out.print("Dime un año: ");
	int x = tec.nextInt();
	
	if (x % 4 == 0 ) {
		if (x % 100 == 0)  {
			if (x % 400== 0) {
				System.out.print("El año es bisiesto");
				}
			}
		}

	}

}