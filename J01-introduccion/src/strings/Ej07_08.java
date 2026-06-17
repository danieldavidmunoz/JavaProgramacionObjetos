package strings;
// Desarrollar un método que reciba una cadena y retorne otra con la original invertida.
public class Ej07_08 {
   // 
   public static String cadenaInvertida (String s1) { 
        String G="";
            for (int i=0; i<=s1.length();i++) {
                char c=s1.charAt(i);
                G=""+c;

            }
       return G;
    }
    public static void main (String [] args){
        System.out.println(cadenaInvertida("el patio de mi casa"));
}
}