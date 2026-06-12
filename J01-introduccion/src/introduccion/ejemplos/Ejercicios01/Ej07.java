// Hacer un algoritmo que permita obtener la cantidad de segundos en un tiempo dado en horas, minutos y segundos.
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej07 {
	public static void main (String [] arg) {
		Scanner tec= new Scanner(System.in);
		System.out.print("Dime un numero de horas: ");
		int horas = tec.nextInt();
		System.out.print("Dime un numero de minutos: ");
		int minutos = tec.nextInt();
		System.out.print("Dime un numero de segundos: ");
		int segundos = tec.nextInt();
		int total = (horas *3600)+(minutos*60)+segundos;

System.out.println("Con las horas " + horas + " , minutos " + minutos + " y, segundos " + segundos + " dados, obtenemos un total de " + total + " segundos ");

		
	}


}