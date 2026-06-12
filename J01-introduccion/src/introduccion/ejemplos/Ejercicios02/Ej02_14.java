// 14 Escribir un programa que pida al usuario un número entero positivo y 
// muestre la cuenta atrás desde ese número hasta cero, separados por comas.


package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_14 {
		public static void main(String[] arg) {
		Scanner tec = new Scanner(System.in);
		System.out.println("dame un numero: ");
		int num = tec.nextInt();
		// int cont = 1;
		
		while (num != 0) {
			num--;
			System.out.print(num + ", ");
			}
		
		}
	

}
