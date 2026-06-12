//Dado el radio de un círculo, calcular su perímetro y su área
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;
import java.lang.Math;

public class Ej02 {
	public static void main (String arg[]) {
	
	Scanner tec = new Scanner(System.in);
	System.out.print("Ingresa un valor: ");
	double radio = tec.nextDouble();
	double perimetro = radio * Math.PI;
	double area = Math.pow(radio, 2); 
	
	System.out.println("con el valor " + radio + " dado, el perímetro del circulo es " + perimetro + " y el area es " + area);
	}
}