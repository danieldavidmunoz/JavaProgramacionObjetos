package introduccion.ejemplos;
import java.util.Scanner;

public class T03SumaEnteros {
	public static void main (String[] arg) {
		int num_1, num_2, resu;
		
		Scanner tec = new Scanner(System.in);

		System.out.print("Ingresa un numerito: ");
		num_1 = tec.nextInt();
		
		System.out.print("Ingresa otro numerito: ");
		num_2 = tec.nextInt();

		resu = num_1 + num_2;


		System.out.print(num_1 + " + " + num_2 + " = " + resu);
	}

}