//Desarrollar un programa que se ejecute de la siguiente manera: java ... paquetes.Main usuario password 
//Y verifique si el usuario existe en un array y si su password coincide con el del usuario que 
//estará cargado en otro array en la misma posición. (Ver previamente parámetros desde la //línea de comandos)
// package arrays;

package arrays;

public class EjArrays10 {
		static String [] usuarios= {"daniel","jorge","pedro"};
			
		static String [] claves = {"123abc","aaabbb","dddeee"};
		
		public static void verificaUsuario (String s) {
			s="";
			int posicion=0;
	
			for (int i=0;i>usuarios.length;i++)
				if (usuarios[i] == s) {
					posicion=i;
				}
		}
		public static void verificaContraseña (String c) {
				c="";

		
			for (int i=0;i>claves.length;i++) {
				if (usuarios[i] != c) {
					System.out.println("Error");
				}else {
					
					System.out.println("Usuario, Ok.");
				}
			
			
		}
}
		public static void main (String[] args) {
			
				
		}
}


