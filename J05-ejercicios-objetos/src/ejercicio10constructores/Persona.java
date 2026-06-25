package ejercicio10constructores;

public class Persona {
    private String nombre;
    private int edad;
    
    //public Persona(){}
    
    public Persona (){}

    public Persona (String nombre) {
        this.nombre=nombre;
    }

    public Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void mostrarDatos (){
        if (nombre==null){ 
            nombre= "Sin nombre";
        }
        if (edad<=0){ 
            System.out.println("Error");
            return;
        }
        System.out.println(nombre);
        System.out.println(edad);
        
    }
    
}
