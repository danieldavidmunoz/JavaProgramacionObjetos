// 9 Solicitando al usuario la cantidad de números a procesar, emitir el siguiente informe: 
// Cantidad de nos Ingresados: xx 
// Sumatoria: xxx 
// Cantidad de nros positivos  
// 0: xx 
// Cantidad de nros negativos: xx 
// Cantidad de nros pares: xx 
// Cantidad de nros impares: xx 
// Mayor valor: xxx – ingresado en el lugar: xx 
// Menor valor: xxx – ingresado en el lugar: xx 
// Media: xx
package introduccion.ejemplos.Ejercicios02;

import java.util.Scanner;

public class Ej02_09 {
	
	public static void main(String [] arg) {
		int cont = 0;
		int acum = 0;
		int pos = 0;
		int sum0 = 0;
		int par = 0;
		int neg = 0;
		int impar = 0;
		int posMax =0;
		int posMin = 0;
		
		

		Scanner tec = new Scanner(System.in);
		System.out.print("Dime un numero: ");
		int resp = tec.nextInt();
		int mayor =resp;
		int menor = resp;

		while (resp >= 0) {
			
			
			System.out.print("Dime un numero: ");
			int num = tec.nextInt();
			
			
			
			if (num > 0) pos= pos +1;
			if (num == 0) sum0 = sum0 + 1;
			if (num < 0) neg = neg + 1;
			if (num % 2 == 0) par = par + 1;
			if (num % 2 == 1) impar = impar + 1;
			if (mayor < num) {mayor = num;
				posMax=cont;
			}else {menor= num; 
				posMin=cont;
				}
			

			
			acum =acum + num;
			resp = resp - 1;
			cont = cont +1;
		

		}
	System.out.println("Cantidad de numeros ingresados: " + cont);
	System.out.println("Sumatorio: " + acum);
	System.out.println("Sumatorio positivos: " + pos);	
	System.out.println("Sumatorio 0: " + sum0);
	System.out.println("Sumatorio negativos: " + neg);
	System.out.println("Sumatorio pares: " + par);
	System.out.println("Sumatorio impares: " + impar);
	System.out.println("Nro mayor: " + mayor+ " posicion " +posMax);
	System.out.println("Nro menor: " + menor+ " posicion " +posMin);
	System.out.println("Media: " + acum/cont);




	}		

}
