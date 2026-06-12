// 8 Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario, incluidos estos.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_08_prueba {
	
	public static void main(String [] arg) {

		Scanner tec = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int num1 = tec.nextInt();
		
		System.out.print("Dame otro numero mayor: ");
		int num2 = tec.nextInt();


		while (num1 <= num2) {
			
			if (num1 % 2 == 0) System.out.println(num1);
			


			
		num1=num1 + 1;
		}
				

	}
}