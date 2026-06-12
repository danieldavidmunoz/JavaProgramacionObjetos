package introduccion.ejemplos;

import java.util.Scanner;

public class T09For {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Ingrese cantidad de valores");
		int n =tec.nextInt();
		for (int i = 1; i <= n; i++){
//			for (int j=1; j<= n;i++)
						System.out.print(i);
		}
		
	}
}
