package tests;

import model.Rectangulo;

public class Test02 {



    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.lado1 =10;
        r.lado2 =20;
        r.x = 5;
        r.y = 10;

        System.out.println(r.distanciaCentro());
        System.out.println(r.perimetro());
        System.out.println(r.area());
        System.out.println(r.diagonal());

    }
}
