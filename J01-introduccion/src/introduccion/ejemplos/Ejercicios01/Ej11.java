//Dado un número cualquier por teclado, mostrar su valor absoluto.
package introduccion.ejemplos.Ejercicios01;

import java.lang.Math;
import java.util.Scanner;

public class Ej11 {
	public static void main (String [] rang){
	Scanner tec = new Scanner(System.in);
	System.out.print("Dime un numero: ");
	int x = tec.nextInt();
	
	System.out.print("Dime otro numero: ");
	int y = tec.nextInt();

	System.out.print("Dime otro numero mas: ");
	int z = tec.nextInt();

	if (x > y && z > x) {
		System.out.println(z + " Es el numero mayor e " + y + " es el menor");
	
	} else if (y > x && z > y) {
		System.out.println(z + " Es el numero mayor y " + x + " es el menor");
		
	} else if (z > x && y > z) {
		System.out.println(y + " Es el numero mayor  y "+ x + " es el menor");
	
	} else if (x > z && y > x) {
		System.out.println(y + " Es el numero mayor y " + z + " es el menor");
	
	} else if (y > z && x > y) {
		System.out.println(x + " Es el numero mayor " + z + " es el menor");
	
	} else {
		System.out.println(x + " Es el numero mayor " + y + " es el menor" );
		}

	}
}