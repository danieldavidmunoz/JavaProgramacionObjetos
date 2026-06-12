// 2. Crea un programa que intercambie los valores de dos variables sin usar una variable temporal

package introduccion.ejemplos.EjerciciosExtra;

public class EjExtra02 {
	public static void main (String[] args) {
		int variable1=6;
		int variable2=2;
		variable1=(variable2+variable1)+(-variable1);
		System.out.println("la variable 1 tiene un valor de: " +variable1);
		variable1=6;
		variable2=(variable2+variable1)+(-variable2);
		System.out.println("la variable 2 tiene un valor de: " +variable2);
//		System.out.println(variable1);

//				System.out.println(variable1);
//				System.out.println(variable2);
//			variable1=(variable2+variable1)+(-variable1);


//			

		}

	}
