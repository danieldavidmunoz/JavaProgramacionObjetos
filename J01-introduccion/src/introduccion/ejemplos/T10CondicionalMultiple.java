package introduccion.ejemplos;

import java.util.Scanner;

public class T10CondicionalMultiple {
	public static void main (String[] arg) {
		
		Scanner tec = new Scanner(System.in);
		
		String mes;
		
		System.out.println("Ingrese nro mes: ");
		int nroMes= tec.nextInt();
		
		switch(nroMes) {
		case 1:
			mes = "Enero";
		case 2:
			mes = "Febrero";
		case 3:
			mes = "Marzo";
		case 4:
			mes = "Abril";
		case 5:
			mes = "Mayo";
		case 6:
			mes = "Junio";
		case 7:
			mes = "Julio";
		case 8:
			mes = "Agosto";
		case 9:
			mes = "Septiembre";
		case 10:
			mes = "Octubre";
		case 11:
			mes = "Noviembre";
		case 12:
			mes = "Diciembre";
		default:
			mes = "ERROR";
		}
	}
}
