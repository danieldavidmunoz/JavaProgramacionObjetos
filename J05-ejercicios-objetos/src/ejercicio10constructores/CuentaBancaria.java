package ejercicio10constructores;

public class CuentaBancaria {
    
    public String titular;
    public double saldo;



    public CuentaBancaria (){}
    public CuentaBancaria (String titular){
        this.titular=titular;
    }
    public CuentaBancaria (String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    } 
    
     
    

    public void mostrarCuenta(){

             System.out.println(titular);
             System.out.println(saldo);
        }

    
    public void ingresarDinero(double ingreso){
        if (ingreso <= 0){
            System.out.println("Error");
            return;
        }
        
        else{
           saldo+=ingreso;
        }  
    
    
}
   public void retirarDinero(double cantidadRetirada){
       if (cantidadRetirada<saldo){ 
        System.out.println("Error. No puedes retirar mas de lo que tienes.");
                return;   
    } else{
        saldo-=cantidadRetirada;
       }
}
}
