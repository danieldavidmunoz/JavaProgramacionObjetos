//5.Escribir un programa que pida al usuario un número, que representará una cantidad de dinero expresada en euros.
// A continuación, el programa le ofrecerá un menú al usuario en el que le preguntará a qué divisa quiere convertir del dinero 
// e imprimirá la conversión. Las posibles divisas son las siguientes (se indica el tipo de cambio):
// Dólares (1 dólar = 0,88 euros)
// Libra Esterlina (1 Libra = 1,20 euros)
// Yen (1 yen = 0,0077 euros).
// Dólares Canadienses (1 dólar C. = 0,71 euros)

package introduccion.ejemplos.Ejercicios03;

import java.util.Scanner;
public class Ej03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dinero;
		int divisa;
		Scanner tec = new Scanner (System.in);
		System.out.println("¿Cuanto dinero quieres cambiar?");
		dinero = tec.nextInt();
		System.out.println("¿Qué moneda quieres cambiar?");
		System.out.println("Marca 1 -> Dolar americano");
		System.out.println("Marca 2 -> Libras");
		System.out.println("Marca 3 -> Yenes");
		System.out.println("Marca 4 -> Dolar canadiense");
		
		divisa = tec.nextInt();
		

		
		switch (divisa) {
		case 1 -> System.out.println(dinero + " dolares son: " + dinero * 0.88 + " euros");
		case 2 -> System.out.println(dinero + " libras son: "+ dinero * 1.20 + " euros");
		case 3 -> System.out.println(dinero + " yenes son: "+ dinero * 0.077 + " euros");
		case 4 -> System.out.println(dinero + " dolares candienses son: "+ dinero * 0.71 + " euros");
		default -> System.out.println("ERROR");
		}
		System.out.println("Buen día");
	}
}
		
		

