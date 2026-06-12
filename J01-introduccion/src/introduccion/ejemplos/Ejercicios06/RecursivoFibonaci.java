
// Chequear el recursivo de Fibonaci
package introduccion.ejemplos.Ejercicios06;

public class RecursivoFibonaci {
	public static int calculaFibonaci (int num1) {
		if (num1<=1)	
			return num1;
		
	
		return calculaFibonaci(num1-1)+calculaFibonaci(num1-2);
		
		
	}
	public static void main (String [] arg) {
		System.out.println(calculaFibonaci(0));
		System.out.println(calculaFibonaci(1));
		System.out.println(calculaFibonaci(2));
		System.out.println(calculaFibonaci(3));
		System.out.println(calculaFibonaci(4));
		System.out.println(calculaFibonaci(5));
		System.out.println(calculaFibonaci(6));
		System.out.println(calculaFibonaci(7));
		System.out.println(calculaFibonaci(8));
	}
}
