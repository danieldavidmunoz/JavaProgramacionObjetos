// 12 Escribir un programa que lea de teclado dos tiempos expresados en horas, minutos y segundos; las sume y muestre el resultado en horas, minutos y segundos por pantalla.
package introduccion.ejemplos.Ejercicios01;

import java.lang.Math;
import java.util.Scanner;

public class Ej12 {
	public static void main (String [] arg) {
	
	Scanner tec = new Scanner(System.in);
	System.out.print("dame un numero de horas: ");
	int horas1 = tec.nextInt();
	
	System.out.print("dame un numero de minutos: ");
	int min1 = tec.nextInt();

	System.out.print("dame un numero de segundos: ");
	int seg1 = tec.nextInt();

	System.out.print("dame otro numero de horas: ");
	int horas2 = tec.nextInt();
	
	System.out.print("dame otro numero con minutos: ");
	int min2 = tec.nextInt();

	System.out.print("dame otro numero de segundos: ");
	int seg2 = tec.nextInt();
	
	int horasASegungos = (horas1 + horas2) * 3600;
	
	int minASegundos = (min1 + min2) * 60;

	int totalSegundos = (seg1 + seg2) + horasASegungos + minASegundos;

	int sumaHoras = totalSegundos/ 3600 ;
	
	int sumaMinutos = (totalSegundos % 3600)/60;

	int sumaSegundos =(totalSegundos % 3600)% 60;

	System.out.print("Con las cifras dadas el numero total de horas es de " + sumaHoras + " y " + sumaMinutos + " minutos " + sumaSegundos + " y segundos");
	


	}






}



