// Escribir un programa que reciba un número n e imprima los primeros n números triangulares, junto con su índice. Los números triangulares se obtienen mediante la suma de los números naturales desde 1 hasta el índice n. Por ejemplo, el número triangular de índice 4 es 1+2+3+4 = 10. Entonces, si se piden los primeros 5 números triangulares, el programa debe imprimir (sin los comentarios entre paréntesis):
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_12 {
	public static void main (String [] arg){
		Scanner tec = new Scanner(System.in);
		System.out.println("Dame un numero");
		int num = tec.nextInt();
		int contInicial = 0;
		int contSecundario =0;
		int acum = 0;
			
		while (num > contInicial) {
			
				while (0 < contInicial) {
				acum = acum + contInicial;
				contInicial=contInicial+1;
				}
			
			contInicial = contInicial + 1;
			acum = 0;
			}
	}
}
