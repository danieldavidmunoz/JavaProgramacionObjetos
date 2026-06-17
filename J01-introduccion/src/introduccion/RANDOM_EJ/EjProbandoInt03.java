package introduccion.RANDOM_EJ;

public class EjProbandoInt03 {
    public static void division(int numerator, int denominator) {
    if (denominator == 0) {
        System.out.println("Can not divide by 0!");
        return;
    }

    System.out.println("" + numerator + " / " + denominator + " = " + (1.0 * numerator / denominator));
    }
}