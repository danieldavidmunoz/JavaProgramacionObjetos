//15 Hacer un algoritmo que, dados los catetos de un triángulo rectángulo, calcule su hipotenusa
package introduccion.ejemplos.Ejercicios01;

import java.lang.Math;
import java.util.Scanner;

public class Ej15 {
	public static void main (String [] rang){
	Scanner tec = new Scanner(System.in);
	
	System.out.print("Dime un numero: ");
	double cateto1= tec.nextDouble();

	System.out.print("Dime otro numero: ");
	double cateto2= tec.nextDouble();

	double resultado =Math.sqrt(cateto1+cateto2);

	System.out.print("Con los valores dados la hipoteunsa del rectangulo es: " + resultado);

	}



}