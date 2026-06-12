// 5 Siguiendo la misma metodología de carga, calcular la cantidad de valores positivos.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_05 {
	
	public static void main(String [] arg) {
	int cont = 1;
	int pos = 0;

	Scanner tec = new Scanner(System.in);
	System.out.print("Dime un numero que sea la cantidad de numeros que quieras sumar: ");
	int resp = tec.nextInt();



	while (cont < resp) {
		System.out.println("Dame otro numero: ");
		int num = tec.nextInt();
		if (num > 0) pos= pos +1;

		cont = cont + 1 ;
		
		

		}

	System.out.println("el total de positivos es " +pos);



	
	}


}