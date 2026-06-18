package introduccion.RANDOM_EJ;
// Crea un método llamado cuentaCaracter que reciba:
//String cadena
//char caracter
public class EjProbandoStrings02 {
    public static int cuentaCaracter (String s, char c) {
        int contador=0;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)==(c))
                contador++;
            
            }
        return contador;
       
    }
    public static void main(String[] args) {
        System.out.println(cuentaCaracter("casa",'a'));
        System.out.println(cuentaCaracter("programacion",'o'));
        System.out.println(cuentaCaracter("java",'z'));
    }


}
