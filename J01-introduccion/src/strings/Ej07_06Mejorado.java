package strings;
// Método que cuente el número de veces que aparece un carácter en una cadena.
public class Ej07_06Mejorado {
     public static int cuentaCaracter (String cadena,char caracter) {   
    int veces=0;
    for (int i=0;i<cadena.length(); i++) {

        if (cadena.charAt(i)==caracter) veces++;
    } 
    return veces;
}
    public static void main (String [] args) {
        System.out.println(cuentaCaracter("casa", 'a'));
        System.out.println(cuentaCaracter("coche de calle", 'a'));
		}
    }



