package strings;
//Elabora un método que escriba todos los caracteres de una cadena cada uno en una línea.

public class Ej07_03 {


	public static void descomponeCadenas(String cadena) {
		

		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
			}
	}
		


	public static void main (String [] args ) {

		descomponeCadenas("hola");

	}
}

	


