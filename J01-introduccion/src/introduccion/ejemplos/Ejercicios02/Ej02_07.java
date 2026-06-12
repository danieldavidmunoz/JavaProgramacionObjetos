// 7 Dado un número entero n positivo, imprimir su factorial. 0! = 1 1! = 1 2! = 2x1 = 2 3! = 3x2x1 = 6 4! = 4x3x2x1 = 24 5! = 120
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_07 {
	
	public static void main(String [] arg) {
		int cont = 1;
		int acum = 1;
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int resp = tec.nextInt();

		while (cont < resp) {
			cont = cont + 1 ;
			acum = acum * cont;

		}
	System.out.print(acum);

	}		

}