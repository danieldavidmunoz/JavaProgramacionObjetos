package introduccion.ejemplos;
import java.util.Scanner;

public class T02LeerDatos {
	public static void main (String[] arg) {
		int num_1;
		int num_2;
		
		String nombre;
		Scanner tec = new Scanner(System.in);

		System.out.print("Ingresa tu nombre: ");
		nombre = tec.nextLine();

		System.out.println("Hola " + nombre + ", Bienvenido al curso!!");
		
		System.out.print("Ingresa un numerito: ");
		num_1 = tec.nextInt();
		
		System.out.print("Ingresa otro numerito: ");
		num_2 = tec.nextInt();

		System.out.println("Has ingresado el " + num_1 + " , y el " + num_2 + " por lo que el resultado de la suma es " + (num_1 + num_2) );
	}

}