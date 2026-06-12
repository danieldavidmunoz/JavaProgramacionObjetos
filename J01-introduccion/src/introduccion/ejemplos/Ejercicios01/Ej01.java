// Dados los lados de un rectángulo, calcular su perímetro y su área
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej01 {
	public static void main (String [] arg) {
	
	Scanner tec = new Scanner(System.in);
	
	System.out.print("Ingresa un valor: ");
	double ladoRectangulo = tec.nextDouble();
	double perimetro = 4 * ladoRectangulo;
	double area = ladoRectangulo * ladoRectangulo;


	System.out.println("con el valor " + ladoRectangulo + " dado, el perimetro es " + perimetro + " y el area es " + area);
	}

}