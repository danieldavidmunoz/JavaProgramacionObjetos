// 19 Suponiendo que el primer día del año fue lunes, escribir un programa que reciba un número con el día del año (de 1 a 366) e imprima el día de la semana que le toca. Por ejemplo: si recibe 3 debe imprimir ’miércoles’, si recibe 9 debe imprimir ’martes’
package introduccion.ejemplos.Ejercicios01;

import java.util.Scanner;

public class Ej19 {
	public static void main (String [] rang) {
	Scanner tec = new Scanner(System.in);
	System.out.print("Dime un numero del 1 al 366: ");
	int x = tec.nextInt();
	

	if (x % 7 == 1 ) {
		System.out.println("Lunes");
	
	} else if (x % 7 == 2) {
		System.out.println("Martes");
		
	} else if (x % 7 == 3) {
		System.out.println("Miercoles");
	
	} else if (x % 7 == 4) {
		System.out.println("Jueves");
	
	} else if (x % 7 == 4) {
		System.out.println("Viernes");
	
	} else if (x % 7 == 4) {
		System.out.println("Sabado");

	} else {
		System.out.println("Domingo");

		}
		
	}

}