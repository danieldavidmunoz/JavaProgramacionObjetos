package introduccion.ejemplos;

import java.util.Scanner;

public class T16MenuDani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		int op = 0;
		
		do {
			System.out.println("1 -Primera funcionalidad");
			System.out.println("2 -Segunda funcionalidad");
			System.out.println("3 -Tercera funcionalidad");
			System.out.println("4 -Cuarta funcionalidad");
			System.out.println("5 -Quinta funcionalidad");
			System.out.println("99- Salir");
			
			
			System.out.println(">");
			op = tec.nextInt();
			tec.nextLine();
			
			switch(op) {
			case 1 -> System.out.println("Elegiste" + op);
			case 2 -> System.out.println("Elegiste" + op);
			case 3 -> System.out.println("Elegiste" + op);
			case 4 -> System.out.println("Elegiste" + op);
			case 5 -> System.out.println("Elegiste" + op);
			}
		
		} while (op != 99);
		
	}

}
