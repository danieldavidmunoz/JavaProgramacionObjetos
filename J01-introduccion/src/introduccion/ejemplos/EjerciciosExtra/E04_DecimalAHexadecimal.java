package introduccion.ejemplos.EjerciciosExtra;

//Crear un método que reciba un int(en base 10) y retorne un String(el nro en base 16)
public class E04_DecimalAHexadecimal {

	
	
	// recibe un nro entre 0 y 15
	public static String digitoHex(int num) {
		if (num <= 9)
			return num + "";
		return "" + (char)('A' + num - 10);
	}
	public static String digitaHexadecimal(int num) {
		if (num < 16)
			return digitoHex(num);
		return digitaHexadecimal(num/16)+digitoHex(num%16);
	}

	public static void main(String[] args) {
		System.out.println(digitaHexadecimal(14587));
		
	//	for (int i = 0; i <= 15; i++) {
	//		System.out.println(digitoHex(i));
	//	}
	}
}
