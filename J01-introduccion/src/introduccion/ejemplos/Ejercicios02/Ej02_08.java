// 8 Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario, incluidos estos.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_08 {
	
	public static void main(String [] arg) {
		int mayor;
		int menor;
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int num1 = tec.nextInt();
		
		System.out.print("Dame otro numero: ");
		int num2 = tec.nextInt();

		if (num1<num2) { 
			menor = num1;
			mayor = num2;
		} else {
			menor = num2;
			mayor = num1;
		}
		while (mayor < menor) {
			System.out.println(menor);
			if (menor % 2 == 0) System.out.println(menor);
			


			
		menor=menor + 1;
		}
				

	}
}