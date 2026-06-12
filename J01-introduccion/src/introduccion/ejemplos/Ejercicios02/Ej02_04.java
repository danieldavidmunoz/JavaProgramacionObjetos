// De una lista de n números ingresados por teclado, imprimir el mayor y el menor valor.
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_04 {
	
	public static void main(String [] arg) {
	int cont = 1;
	

	Scanner tec = new Scanner(System.in);
	System.out.print("Dime un numero que sea la cantidad de numeros que quieras sumar: ");
	int resp = tec.nextInt();

	System.out.println("Dame otro numero: ");
	int mayor = tec.nextInt();
	int menor = mayor;

	while (cont < resp) {
		


			System.out.println("Dame otro numero: ");
			int num = tec.nextInt();


			if (mayor < num) mayor = num;

			else menor= num; 
			
			
		cont = cont + 1 ;
		
		

		}

	System.out.println("este es el numero mayor: " + mayor +" y el menor es " +menor);



	
	}


}