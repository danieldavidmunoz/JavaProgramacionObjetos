package tests;

import model.Circulo;

public class test01 {

    public static void main(String[] args) {
        Circulo c = new Circulo();

        c.x = 30;
        c.y = -40;
        c.radio =15.75;
        System.out.println(c.distanciaCentro());
        System.out.println(c.area());
        System.out.println(c.diametro());


    }



}
