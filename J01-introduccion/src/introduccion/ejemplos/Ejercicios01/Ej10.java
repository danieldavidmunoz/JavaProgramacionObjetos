//Dado un número cualquier por teclado, mostrar su valor absoluto.
package introduccion.ejemplos.Ejercicios01;

import java.lang.Math;
import java.util.Scanner;

public class Ej10 {
	public static void main (String [] rang){
	Scanner tec = new Scanner(System.in);
	System.out.print("Dime un numero: ");
	double num = tec.nextDouble();
	if (num > 0) {
		System.out.println("El valor absoluto de " + num +  " es " + num );
		}else {
		System.out.println("El valor absoluto de " + num +  " es " + num * (-1));

		}
	}

}