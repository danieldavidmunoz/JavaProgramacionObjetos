package introduccion.RANDOM_EJ;
// Método que devuelva la primera posición en la que aparece un carácter dentro de una cadena.
public class EjStrings04 {
    public static int cuentaPosicion (String s, char c){
        return s.indexOf(c);
    }
    public static void main(String[] args) {
        System.out.println(cuentaPosicion("camino de Santiago", 'c'));
        System.out.println(cuentaPosicion("camino de Santiago", 'g'));
        System.out.println(cuentaPosicion("camino de Santiago", 'u'));
    }
}
