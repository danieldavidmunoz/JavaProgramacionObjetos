// Dados la base y altura de un triángulo, calcular su área.
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;
import java.lang.Math;

public class Ej03 {
	public static void main (String [] arg) {
	
	Scanner tec= new Scanner(System.in);
	System.out.print("Ingresa un valor: ");
	double base = tec.nextDouble();
	System.out.print("Ingresa otro valor: ");
	double altura = tec.nextDouble();
	double area  = (base * altura) / 2;

	System.out.println("con el valor " + base + " dado, el area es " + area);

	}
}