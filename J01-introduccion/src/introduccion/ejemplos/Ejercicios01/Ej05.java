// Dados dos números reales, calcular su suma, diferencia, producto y división.
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;
import java.lang.Math;

public class Ej05 {
	public static void main (String [] arg) {
	Scanner tec= new Scanner(System.in);
	System.out.print("Ingresa un valor: ");
	double numeroReal_1 = tec.nextDouble();
	System.out.print("Ingresa otro valor: ");
	double numeroReal_2 = tec.nextDouble();
	double suma = numeroReal_1 + numeroReal_2;
	double diferencia  = numeroReal_1 - numeroReal_2;
	double producto = numeroReal_1 * numeroReal_2;
	double division  = numeroReal_1 / numeroReal_2;


	System.out.println("con el valor " + numeroReal_1 + "  y el " + numeroReal_2 + " dados, la suma es " + suma + " la diferencia es " + diferencia + " el producto " + producto + " y la division " + division);

	}

}