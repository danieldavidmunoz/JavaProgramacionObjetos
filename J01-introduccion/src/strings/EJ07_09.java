package strings;
//Desarrollar un método que indique si una palabra es un palíndromo. 
// a. Modificarlo para que indique si una frase es un palíndromo.
public class EJ07_09 {
    public static boolean esPalindromo (String s){
        boolean esPalindromo=false;
        String s2= ""; 
        s=s.replace(" ","").trim().toLowerCase();
    
        for (int i=s.length() -1; i >= 0; i-- ){
            s2+=s.charAt(i);
                }

        if (s.equals(s2)){
            esPalindromo=true;
        }
    return esPalindromo;
    }

    public static void main (String [] args ) {
        System.out.println(esPalindromo("Analavaaval ana"));
        System.out.println(esPalindromo("coche"));
    }
}

    