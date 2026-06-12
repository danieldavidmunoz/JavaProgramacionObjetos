// 13 Escribir un programa que imprima por pantalla todas las fichas de dominó, 
// de una por línea y sin repetir. 
// 0 : 0
// 0 : 1
package introduccion.ejemplos.Ejercicios02;

public class Ej02_13 {
	public static void main (String [] arg) {
		int num=0;
		int cont=0;
		int acum=0;
		
			while (num<7) {
				
				while (cont<7) {
					
				System.out.println(num+ " : "+cont);
				cont=cont +1;
				
					}
				System.out.println("     ");
			cont=0;
			num=num+1;
				}
			}
		
	}


