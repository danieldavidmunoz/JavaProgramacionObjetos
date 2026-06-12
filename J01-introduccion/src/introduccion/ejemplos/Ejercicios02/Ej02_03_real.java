// 3 De una lista de n números ingresados por teclado, imprimir el mayor.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_03_real {
	public static void main(String [] arg) {
		int cont = 1;

		

		Scanner tec = new Scanner(System.in);
		System.out.println("Dime un numero que sea la cantidad de numeros que quieras sumar: ");
		int resp = tec.nextInt();
		

		System.out.println("Dame otro numero: ");
		int mayor = tec.nextInt();

		while (cont < resp) {
		


			System.out.println("Dame otro numero: ");
			int num = tec.nextInt();


			if (mayor < num) mayor = num;
			
			
		cont = cont + 1 ;
		
		

		}

	System.out.println("este es el numero mayor: " + mayor);

	}

}