// Método que indique si una cadena contiene un carácter determinado.
package introduccion.RANDOM_EJ;

public class EjString03 {
    public static boolean caracterDeterminado (String s, char c){
        boolean cierto= false;
        int i = 0;
        while (!cierto && i < s.length()){
            if (s.charAt(i)==(c))
                cierto=true;
            i++;              
        }
        return cierto;
    }
    public static void main(String[] args) {
        System.out.println(caracterDeterminado("coche", 'c'));
        System.out.println(caracterDeterminado("camicadcagrfa", 'u'));

    }
}

