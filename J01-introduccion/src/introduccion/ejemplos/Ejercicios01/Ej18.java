// 18 Escribir un programa que dados dos puntos en el plano 
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;
import java.lang.Math;

public class Ej18{
	public static void main (String [] arg) {
	Scanner tec = new Scanner (System.in);
	System.out.print("Dame un valor : ");
	double x1= tec.nextDouble();

	System.out.print("Dame otr valor: ");
	double y1= tec.nextDouble();

	System.out.print("Y otro: ");
	double x2 =  tec.nextDouble();

	System.out.print("Y el utlimo: ");
	double y2 =  tec.nextDouble();
	
	double distancia =  Math.sqrt(Math.pow((x1-x2),2)+  Math.pow((y1-y2),2));

	System.out.print("Con la informacion dada la distancia entre los puntos es de : " + distancia);
	}
}