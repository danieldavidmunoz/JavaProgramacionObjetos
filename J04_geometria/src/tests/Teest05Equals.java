package tests;

import model.Circulo;
import model.Rectangulo;

public class Teest05Equals {
    public static void main(String[] args) {
        Circulo c1 = new  Circulo(1, 3, 3);
        Circulo c2 = new  Circulo(1, 3, 3);

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        Rectangulo r1 = new Rectangulo(1,2,3,4);
        Rectangulo r2 = new Rectangulo(1,2,3,4);

        System.out.println(r1.equals(r2));
        
    }
}
