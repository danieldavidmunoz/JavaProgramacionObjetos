//Desarrolle un método que reciba una cadena con una expresión de una operación simple (+, -, *, /) 
// con dos operandos y retorne el resultado como double 
package strings;

public class Ej07_15 {

//    public static double transformaADoble (String s) {
    public static double calculadoraSimple (String s) {
    //    double valor;
        
        String s1 =s;
        char suma =  '+';
        char resta = '-';
        char multi = '*';
        char divi = '/';
        String num1="";
        String num2="";
        double resu=0.0;

      
    //    String[] partes = s1.split(" ");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==suma){
                num2=s1.substring(s1.indexOf("+")+1);
                num1=s1.substring(0,s1.indexOf("+"));
                double num1Double=Double.parseDouble(num1);
                double num2Double=Double.parseDouble(num2);
                resu=(num1Double)+(num2Double);


            }
            else if(s1.charAt(i)==resta){
                num2=s1.substring(s1.indexOf("-")+1);
                num1=s1.substring(0,s1.indexOf("-"));
                double num1Double=Double.parseDouble(num1);
                double num2Double=Double.parseDouble(num2);
                resu=(num1Double)-(num2Double);
  
        }
            else if(s1.charAt(i)==multi){
                num2=s1.substring(s1.indexOf("*")+1);
                num1=s1.substring(0,s1.indexOf("*"));
                double num1Double=Double.parseDouble(num1);
                double num2Double=Double.parseDouble(num2);
                resu=(num1Double)*(num2Double);
            
            }    
            else if (s1.charAt(i)==divi) {
                num2=s1.substring(s1.indexOf("/")+1);
                num1=s1.substring(0,s1.indexOf("/"));
                double num1Double=Double.parseDouble(num1);
                double num2Double=Double.parseDouble(num2);
                resu=(num1Double)/(num2Double);

            }
    
    }
        return resu;
}
    public static void main(String[] args) {
        System.out.println(calculadoraSimple("4/20"));
    }
    }

