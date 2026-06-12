// 11 Escribir un programa que imprima las tablas del 1 al 9.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_11Mejorado {
	
	public static void main(String [] arg) {
		int contIni=0;
		int contSec=0;
		

		while (contIni<11) {
			System.out.println("                ");
			System.out.println("** Tabla del: "+ contIni + " **");


			while (contSec<11) {
				System.out.println(contIni + " x " + contSec + " = " + contIni*contSec);
				contSec= contSec + 1;
				}
	
			contIni = contIni + 1; 
			contSec= 0;
		
		}

	}
}

