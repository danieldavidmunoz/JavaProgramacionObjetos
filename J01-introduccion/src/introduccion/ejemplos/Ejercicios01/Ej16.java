// 16 Escribir un programa que le pregunte al usuario una cantidad de euros a invertir o capital inicial (Ci), una tasa de interés anual (R) y un número de años (T) y muestre como resultado el monto final a obtener. Como se irán retirando los intereses generados por año, se debe calcular con la fórmula de interés simple.
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej16{
	public static void main (String [] arg) {
	Scanner tec = new Scanner (System.in);
	System.out.print("Dime el valor capital inicial que quieres invertir: ");
	int capitalInicial = tec.nextInt();

	System.out.print("Dime el interés al que lo vas a tener: ");
	double interes= tec.nextDouble();

	System.out.print("Dime el total de años a lo que lo vas a invertir: ");
	int anho = tec.nextInt();
	
	double montoFinal = capitalInicial * interes * anho;

	System.out.print("Con la informacion dada el monto total que recibiras obtienes es de :" + montoFinal);
	}




}