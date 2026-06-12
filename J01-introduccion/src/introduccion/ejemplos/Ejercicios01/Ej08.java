//Hacer un algoritmo que permita Obtener la cantidad de horas, minutos y segundos de un tiempo dado en segundos.
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej08 {
	public static void main (String [] arg) {
		Scanner tec= new Scanner(System.in);
		System.out.print("Dime un numero de segundos: ");
		int segundosTeclado = tec.nextInt();
		int horas = segundosTeclado/ 3600 ;
		int minutos = (segundosTeclado % 3600)/60;
		int segundos =(segundosTeclado % 3600)% 60;


System.out.println("Con los segundos dados " + segundosTeclado + " ,obtenemos un total de " + horas + " horas " + minutos + " minutos " + segundos + " segundos ");

		
	}
}