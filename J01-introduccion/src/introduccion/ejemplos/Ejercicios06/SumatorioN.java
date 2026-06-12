package introduccion.ejemplos.Ejercicios06;

public class SumatorioN {
	public static int SumatorioN (int x) {
		if (x==1)	
			return 1;
		return x+SumatorioN(x-1);
	}
	public static void main (String [] arg) {
		System.out.println(SumatorioN(9));
	}
}

