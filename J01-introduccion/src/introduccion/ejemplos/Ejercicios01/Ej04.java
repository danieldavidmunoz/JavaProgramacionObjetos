// Dado el radio de una esfera, calcular su volumen
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;
import java.lang.Math;

public class Ej04 {
	public static void main (String [] arg) {
			
	Scanner tec= new Scanner(System.in);
	System.out.print("Ingresa un valor: ");
	double radio = tec.nextDouble();
	double volumen = (4*Math.PI * Math.pow(radio, 3)) / 3;	

	System.out.println("con el valor " + radio + " dado, el volumen de la esfera es " + volumen);

	}

}
