// 11 Escribir un programa que imprima las tablas del 1 al 9.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_12_05 {
	
	public static void main(String [] arg) {

		Scanner tec = new Scanner(System.in);
		System.out.println("Dime un numero que sea la cantidad de numeros que quieras sumar: ");
		int num = tec.nextInt();
		int contIni=1;
		int contSec=1;
		int acum = 1;

		while (contIni<num) {
		//	System.out.println("                ");
			System.out.println(contIni);


			while (contSec<contIni) {
				System.out.println(acum);
				contSec= contSec + 1;
				acum = contSec +1;
				}
	
			contIni = contIni + 1; 
			contSec= 0;
			acum = 0;
		
		}

	}
}

