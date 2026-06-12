package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;
public class Ej02_16 {

	public static void main(String[] args) {
	
		Scanner tec = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Ingrese unvalor");
		int num =tec.nextInt();
		boolean compuesto= false;
		int cont = 2;
		while (num > cont && !compuesto) {
			if (num%cont==0) { 
				compuesto=true;
			} else cont++;
		}
		
		if (compuesto) System.out.println("Es un numero compuesto");
		else System.out.println("Es un numero primo");
				
	}
}

