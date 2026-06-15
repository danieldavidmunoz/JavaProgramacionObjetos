package introduccion.ejemplos.EjerciciosExtra;

//Crear un método que reciba un int(en base 10) y retorne un String(el nro en base 2)
public class E03_DecimalABinario {
	public static String decimalBinario(int num) {
		if (num==1)
			return "1";
		if (num==0)
			return "0";
		return  decimalBinario(num/2) + (num%2);
	}

	public static void main(String[] args) {
		System.out.println(decimalBinario(2798));
	}
}
