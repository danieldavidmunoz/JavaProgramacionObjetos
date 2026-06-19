package strings;

public class Ej_015Mejorado {
    public static double calculadoraSimpleMejorada (String s) {
double resu = 0.0;
        String s1 = s.trim();
        char[] signo = {'+','-','*','/'};
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            for (char sig : signo) {
                if (ch == sig) {
                    String num1 = s1.substring(0, i).trim();
                    String num2 = s1.substring(i + 1).trim();
                    double a = Double.parseDouble(num1);
                    double b = Double.parseDouble(num2);
                    switch (sig) {
                        case '+': resu = a + b; break;
                        case '-': resu = a - b; break;
                        case '*': resu = a * b; break;
                        case '/': resu = a / b; break;
                    }
                    return resu;
                }
            }
        }
        return resu;
    }

    public static void main(String[] args) {
        System.out.println(calculadoraSimpleMejorada("12356-21453"));
        System.out.println(calculadoraSimpleMejorada("4332256325+3214532"));
        System.out.println(calculadoraSimpleMejorada("7859*1526"));
        System.out.println(calculadoraSimpleMejorada("888888/20000"));
    }
    }
// ...existing code...