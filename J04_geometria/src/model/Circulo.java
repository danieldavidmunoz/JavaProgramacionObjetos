package model;

public class Circulo extends Figura { //La clase Circulo desciende de Figura. Establecemos la relacion de herencia de Circulo
    public double radio;
    
    public Circulo (){}

    public Circulo (double x, double y, double radio){
        super(x,y);
        this.radio=radio; 

    }
    public double diametro(){
        return radio*2;
    }
    public double area(){
        return Math.PI*radio*radio;
    }
}
