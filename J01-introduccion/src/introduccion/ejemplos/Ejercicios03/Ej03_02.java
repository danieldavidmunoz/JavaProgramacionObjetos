// Se solicitará al usuario que ingrese números reales para procesar. Luego de ingresar cada
// número, se le preguntará si quiere ingresar más o no, leyendo la cadena “s” o “n” . Cuando
// indique que no ingresa más números, Mostrar la cantidad de valores ingresados, el primer
// valor, el último, el mayor y el menor.

package introduccion.ejemplos.Ejercicios03;

import java.util.Scanner;

public class Ej03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Pasame un numero entero");
		int num= tec.nextInt();
		int mayor= num;
		int menor= num;
		int primero= num;
		int cont=1;
		
		if (num>mayor) mayor= num;
		if (num<menor) menor= num;
	
		System.out.println("Quieres ingresar numeros? ");
		String cadena=tec.next();
	
	
		while (!cadena.equals("n")) {
			cont++;
			System.out.println("Pasame un numero entero");
			num= tec.nextInt();
			
			if (num>mayor) mayor= num;
			if (num<menor) menor= num;
			

			
			System.out.println("Quieres seguir ingresando numeros? ");
			cadena=tec.next();
			


			
			}
		
		System.out.println("El numero mayor es: "+ mayor);
		System.out.println("El numero menor es: "+ menor);
		System.out.println("El numero último es: "+ num);
		System.out.println("El numero primero es: "+ primero);
		System.out.println("La cantidad de valores ingresados es: "+ cont);
		}




	}


