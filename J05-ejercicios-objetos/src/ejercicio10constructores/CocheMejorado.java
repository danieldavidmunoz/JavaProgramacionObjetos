package ejercicio10constructores;
import ejercicio10constructores.Vehiculo;
public class CocheMejorado extends Vehiculo {
    public int numeroPuertas;

    public CocheMejorado(String modelo, String marca, int numeroPuertas){
        super(modelo, marca);
        this.numeroPuertas = numeroPuertas;
    }
    public void mostrarDatos (){
        super.mostrarDatos();
        System.out.println(numeroPuertas);
    }

}
