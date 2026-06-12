//Escriba un programa que lea el lado de un cuadrado por teclado 
//y a continuación lo muestre por pantalla en forma de asteriscos. 
// Por ejemplo, ingresado el valor 4 la salida será: 
//**** 
//**** 
//**** 
//****

package introduccion.ejemplos.Ejercicios04;
import java.lang.Math;
import java.util.Scanner;
public class Ej04_02 {
	public static void main (String[] arg) {
		
		
		Scanner tec =new Scanner(System.in);
		System.out.println("dime un valor");
		int num = tec.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < 2+num; j++) {
				System.out.print("*");
			}
			System.out.println("0");
		
		}
	}
}
