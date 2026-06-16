//Método que cuente el número de veces que aparece un carácter en una cadena.

package strings;

public class Ej07_06 {
	public static int cuentaCaracteres(String s) {
		int contador=0;
		while (contador<s.length())
		contador++; 			
		return contador;
		}
	public static void main (String [] args) {
		System.out.println(cuentaCaracteres("hola"));
		System.out.println(cuentaCaracteres("terremotos"));
		System.out.println(cuentaCaracteres("cochecito"));
	}

}
