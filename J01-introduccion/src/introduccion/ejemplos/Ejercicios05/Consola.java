package introduccion.ejemplos.Ejercicios05;
import java.util.Scanner;
public class Consola {
	
	public static Scanner tec = new Scanner(System.in);
	
			public static int leeInt(String mensaje) {
				System.out.println(mensaje);
				int n =tec.nextInt(); //borramos acumulado en consola, siempre con Int.
				tec.nextLine();
				return n;
			}
			public static int leeInt() {
				return leeInt("");
				
				
			}
			
			public static String leeCadena(String mensaje) {
				System.out.println(mensaje);
				return tec.nextLine();
			}
			public static String leeCadena() {
				return leeCadena("");
				
				
			}
}
