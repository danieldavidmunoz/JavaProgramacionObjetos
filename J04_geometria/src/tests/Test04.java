package tests;

import model.Circulo;
import model.Figura;

public class Test04 {
    public static void main(String[] args) {
        Circulo c = new Circulo(1,2,3);
        System.out.println(c.radio);
         Figura f = c;
         System.out.println(f.area());

         Object o = c;
         System.out.println((o));

    }
}
