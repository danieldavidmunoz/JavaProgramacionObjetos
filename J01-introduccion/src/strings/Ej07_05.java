package strings;
// 5. Método que pida un carácter c y un número n y que devuelva una cadena con c repetido n veces. Ej: repite(‘a’, 4) debe retornar “aaaa”
import introduccion.ejemplos.Ejercicios05.Consola;

public class Ej07_05 {
	public static void repiteCaracteres (String s, int n) {
	
		for(int i=0; i<n; i++) {
			System.out.print(s);
		}

	}
	public static void main (String [] args) {
		
		int n=Consola.leeInt("dime un numero");
		String s=Consola.leeCadena("Dime una letra");				
		repiteCaracteres(s,n);
		
	}

	
}
