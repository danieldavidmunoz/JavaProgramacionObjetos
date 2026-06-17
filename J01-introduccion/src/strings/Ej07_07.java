package strings;
//Método que reciba una cadena y retorne el número de vocales que contiene.

public class Ej07_07 {
    public static int cuentaVocales(String s) {
        String vocales = "aeiou";
        int cont = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vocales.indexOf(c) >= 0) {
                cont++;
            }
        }

        return cont;
    }   


    public static void main (String [] args) {
        System.out.print(cuentaVocales("el camino es verde"));
    }
}