package ejercicio10constructores;
//Ejercicio 8. Herencia con varios constructores
//Objetivo: Combinar this() y super() en clases relacionadas por herencia
public class Empleado {
    private String nombre;
    private double salario;
    private String lenguajePrincipal; 


    //• Si no se indica salario, será 1000. 
    //• Usa this() para reutilizar constructores. 

    public Empleado(String nombre){
        this(nombre,1000);
    }

    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
        
    }
}
