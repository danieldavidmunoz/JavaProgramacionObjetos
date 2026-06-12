
//Escribe un método que retorne la suma de los dígitos de un número entero (ejemplo: 1234 -> 1+2+3+4 = 10)
package introduccion.ejemplos.EjerciciosExtra;

public class EjExtra03 {

	public static int digitosEnteros(int num) {
		int acum = 0;
		while (num > 0) {
			acum = acum + num % 10;
			num = num / 10;
		}
		return acum;

	}

	public static void main(String[] arg) {

		System.out.println(digitosEnteros(152652));
		System.out.println(digitosEnteros(888));
		System.out.println(digitosEnteros(741));
		System.out.println(digitosEnteros(6));
	}
}
