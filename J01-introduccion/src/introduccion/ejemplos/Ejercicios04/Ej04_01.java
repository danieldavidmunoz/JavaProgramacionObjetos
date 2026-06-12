//1.Calculadora de 4 operaciones. 
// El usuario ingresa dos números y un carácter (+, -, *, / ) 
//y el programa debe mostrar la operación y su resultado. 
// Por ejemplo: 
//	Ingrese valor: 12.5 
//	Ingrese valor: 2 
//	Ingrese operación: - 12.5 – 2 = 10.5

package introduccion.ejemplos.Ejercicios04;

import java.util.Scanner;

public class Ej04_01 {

	public static void main(String[] args) {
		int num1;
		int num2;
		String op;
	
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1 = tec.nextInt();
	
		
		System.out.println("Introduce otro numero");
		num2 = tec.nextInt();
	
		
		System.out.println("Introduce uno de estos operadores (+, -, *, / )");
		op = tec.next();
		tec.nextLine();
			
		switch (op) {
			case "+" : System.out.println(+ num1 + "-" + num2 + "=" + (num1 + num2) );
				break;
			case "-" : System.out.println(+ num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case "*" : System.out.println(+ num1 + "*" + num2 + "=" + (num1 * num2) );
				break;
			case "/" : System.out.println(+ num1 + "/" + num2 + "=" + (num1 / num2));
				break;
			
		}
	}
}

		
		
		


