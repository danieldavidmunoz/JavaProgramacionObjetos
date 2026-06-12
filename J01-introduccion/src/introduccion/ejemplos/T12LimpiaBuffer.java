package introduccion.ejemplos;

import java.util.Scanner;

public class T12LimpiaBuffer {
	public static void main (String[] arg) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Ingrese frase: ");
		String frase = tec.nextLine();
		// NextLine lee frase
		//Usamos una limpieza de buffer para evitar que el salto de linea almacenado en el buffer se lea
		tec.nextLine(); // Se recomienda usarlo despues de una nextLine
		
		System.out.println("Ingrese frase: ");
		String palabra = tec.next();
		String palabra2 = tec.next();
		tec.nextLine();
		// Next lee palabra
		System.out.println(frase);
		System.out.println(palabra);
	}
}
