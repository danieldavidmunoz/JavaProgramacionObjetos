// Dados los lados de un rectángulo, calcular su perímetro y su área
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej01Mejorado {
	public static void main (String [] arg) {
	
	Scanner tec = new Scanner(System.in);
	
	System.out.print("Ingresa un valor: ");
	double ladoRectangulo_1 = tec.nextDouble();
	System.out.print("Ingresa otro valor: ");
	double ladoRectangulo_2 = tec.nextDouble();
	double perimetro = (2 * ladoRectangulo_1) +(2 * ladoRectangulo_2);
	double area = ladoRectangulo_1 * ladoRectangulo_2;


	System.out.println("con el valor " + ladoRectangulo_1 + " y "+ ladoRectangulo_2 + " dado, el perimetro es " + perimetro + " y el area es " + area);
	}

}