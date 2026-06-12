// 15. Escriba un programa que pida un número entero mayor que cero y muestre todos sus divisores.

package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("dame un numero entero mayor a cero: ");
		int num = tec.nextInt();
		int cont = 1;
		
		while (num>cont) {
			if (num % cont == 0) System.out.println(cont +" es divisor de: "+ num);
			cont++;
		}
		
	}

}
