// 13 Hacer un programa que dado un número entero n, indica si es o no par.
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej13 {
	public static void main (String [] rang){

	Scanner tec = new Scanner(System.in);
	System.out.print("Dame un numero: ");
	int x = tec.nextInt();

	if (x % 2 == 0) {
		System.out.print("El numero es par");
	
	}else {
		
		System.out.print("El numero es impar");

		}

	}


}