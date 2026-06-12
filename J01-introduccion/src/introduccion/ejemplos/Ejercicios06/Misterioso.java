package introduccion.ejemplos.Ejercicios06;

public class Misterioso {

		public static int Misterioso (int n) {
			if (n<=9)	
				return 1;
			return 1+Misterioso(n/10);
		}
		public static int otroMisterioso (int n) {
			if (n<=9)	
				return n;
			return n%10 +otroMisterioso(n/10);
		}
		public static void main (String [] arg) {
//			System.out.println(otroMisterioso(9999999));
	//		System.out.println(otroMisterioso(999999));
//			System.out.println(otroMisterioso(99999));
//			System.out.println(otroMisterioso(9999));
//			System.out.println(otroMisterioso(999));
//			System.out.println(otroMisterioso(99));
//			System.out.println(otroMisterioso(9));
//			System.out.println(otroMisterioso(1));
		}
	}



