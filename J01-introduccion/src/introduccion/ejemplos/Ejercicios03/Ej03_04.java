// 4.Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. 
//En cada paso, el programa propone un número y el usuario debe contestar, 
//introduciendo su contestación como dato, si ha acertado,
// o bien si el número que ha propuesto el ordenador es mayor o es menor que el que tenía pensado. 
//Por ejemplo, ingresando: 
//0 –> Acierto 
//1 –> El valor propuesto es mayor 
//-1 –> El valor propuesto es Menor
package introduccion.ejemplos.Ejercicios03;
import java.util.Scanner;

public class Ej03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Piensa un numero entre 0 y 100");
		int num = tec.nextInt();
		int adivina = 50;
		boolean salir = false;

		System.out.println("Es " + adivina + " ?");

	
		while (! salir) {
			System.out.println("Dame si acerte, 1 es mayor , y -1 si es menor");
			num = tec.nextInt();
			
			if (num== 1) {System.out.println("el numero es mayor");
			adivina++;
			System.out.println(adivina);
			}

			else if (num==-1){ System.out.println("el numero es menor");
			adivina--;
			System.out.println(adivina);
			}

			else if (num == 0) salir = true;

	//		System.out.println("Es correcto. Si es correcto: dime 0, si es mayor uno, y si es menor -1");
	//		num = tec.nextInt();
			
		}
			System.out.println("Acerte. Gracias");
	
	}

}
