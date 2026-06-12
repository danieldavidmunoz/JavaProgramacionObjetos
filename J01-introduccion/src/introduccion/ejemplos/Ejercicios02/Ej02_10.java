// 10 Dado un número entero n, imprimir su tabla de multiplicar del 1 al 9.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_10 {
	
	public static void main(String [] arg) {
		int cont=1;
		Scanner tec = new Scanner(System.in);
		System.out.println("Dame un numero entero");
		int num = tec.nextInt();
		

		while (cont<10) {
			System.out.println(cont + " x " + num + " = " + num*cont);
			cont = cont + 1; 
		
		}

	}
}

