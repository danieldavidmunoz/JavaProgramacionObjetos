// Crea un programa que intercambie los valores de dos variables.

package introduccion.ejemplos.EjerciciosExtra;

public class EjExtra01 {
	public static void main (String[] args) {
		int variable1=6;
		int variable2=2;
//		if (variable1!=variable2) {
			int variable3;
			variable3=variable2-variable1;
	//		System.out.println( variable3);
			variable1=(variable1)+(variable3);
			variable2=variable2-(variable3);
			
			System.out.println(variable1);
			System.out.println(variable2);

		}

	}
