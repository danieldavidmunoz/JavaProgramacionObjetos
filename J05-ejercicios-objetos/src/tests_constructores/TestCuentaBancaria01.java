package tests_constructores;
import ejercicio10constructores.CuentaBancaria;
public class TestCuentaBancaria01 {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Marta");
        CuentaBancaria c2 = new CuentaBancaria("Luis",500);
        CuentaBancaria c3 = new CuentaBancaria("Jose",-500);
    
    c1.mostrarCuenta();
    c2.mostrarCuenta();
    c3.mostrarCuenta();
   // System.out.println(c2.mostrarDatos());
    //System.out.println(c3.mostrarDatos());
 
   
   
    //c2.retirarDinero(-2500.0);
    //System.out.println(c2.mostrarDatos());

   }
}
