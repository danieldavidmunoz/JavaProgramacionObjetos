package introduccion.RANDOM_EJ;
//// Método que indique si una cadena empieza por un carácter determinado.
public class EjString05 {
    public static boolean empiezaPorCaracter (String s, char c){
        boolean verdad=false;
        if (s.charAt(0)==(c))
            verdad=true;
        return verdad;
        }

    public static void main(String[] args) {
        System.out.println(empiezaPorCaracter("camino de Santiago", 'c'));
        System.out.println(empiezaPorCaracter("camino de Santiago", 'a'));
    }
}


