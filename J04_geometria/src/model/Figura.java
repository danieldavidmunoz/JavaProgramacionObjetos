package model;

public class Figura {
    public double x;
    public double y;

    public Figura (){}

    public Figura (double x, double y){
        this.x=x; // chequear el this"
        this.y=y;
    }

    public double distanciaCentro() {
        return Math.sqrt(x*x+y*y);
        }
    public double area () {
        return 0;
        }
    public double perimetro (){
        return 0;
    }
}
