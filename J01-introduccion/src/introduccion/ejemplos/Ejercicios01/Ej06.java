// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. Fórmula para la conversión: F = 9/5C + 32
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej06 {
	public static void main (String [] arg) {
	Scanner tec = new Scanner(System.in);
	System.out.print("Dime la temperatura que tienes: ");
	double temperaturaFarenheit = tec.nextDouble();
	double temperaturaCelsius = (temperaturaFarenheit-32)*(9/5);

System.out.println("con el valor en grados Farenheit " + temperaturaFarenheit + " dado, el area es " + temperaturaCelsius);
	
	}

}