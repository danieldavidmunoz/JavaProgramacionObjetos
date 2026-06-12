// 17 Hacer otro programa que ingresando los mismos datos que el anterior y calcule el Capital final si no se hace ningún reintegro y la capitalización de los intereses es anual.import java.util.Scanner;
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej17{
	public static void main (String [] arg) {
	Scanner tec = new Scanner (System.in);
	System.out.print("Dime el valor capital inicial que quieres invertir: ");
	int capitalInicial = tec.nextInt();

	System.out.print("Dime el interés al que lo vas a tener: ");
	double interes= tec.nextDouble();

	System.out.print("Dime el total de años a lo que lo vas a invertir: ");
	int anho = tec.nextInt();
	
	double montoFinal =  capitalInicial* Math.pow((interes / anho),anho);

	System.out.print("Con la informacion dada el monto total que recibiras obtienes es de :" + montoFinal);
	}
}