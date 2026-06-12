// 1.A 
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_02 {
	public static void main(String [] arg) {
		int acum = 0;
		int cont = 0;

		Scanner tec = new Scanner(System.in);
		System.out.println("Dime un numero que sea la cantidad de numeros que quieras sumar: ");
		int num = tec.nextInt();
		
		while (cont < num) {

		
		System.out.println("Dame un numero: ");
		int num_2 = tec.nextInt();

		cont = cont + 1 ;

		acum = acum + num_2;

	
		

		}
	
	System.out.println(acum);

	}

}