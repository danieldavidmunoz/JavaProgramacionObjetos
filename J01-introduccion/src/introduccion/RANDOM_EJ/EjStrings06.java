package introduccion.RANDOM_EJ;

public class EjStrings06 {
        public static boolean terminaPorCaracter (String s, char c){
        boolean verdad=false;
        if (s.charAt(-1)==(c))
            verdad=true;
        return verdad;
        }

    public static void main(String[] args) {
        System.out.println(terminaPorCaracter("camino de Santiago", 'o'));
        System.out.println(terminaPorCaracter("camino de Santiago", 'a'));
    }
}


