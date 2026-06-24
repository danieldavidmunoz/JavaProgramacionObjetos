package ejemploconstructor;
// Llama al constructor propio (y no llama al padre), solo lo hace el ultimo.
public class Cliente {
    String nombre;
    String apellido;
    double saldo;
    int edad;
    String domicilio;
    
    public Cliente(String nombre) {
        this.nombre=nombre;
    }
    
    public Cliente(String nombre, String apellido) {
        this(nombre);
        this.apellido=apellido;
    }
        
    public Cliente(String nombre, String apellido, double saldo) {
        this(nombre, apellido);
        this.saldo=saldo;
    }
        public Cliente(String nombre, String apellido, double saldo, int edad) {
        this(nombre, apellido,  saldo); //es una herencia que equivale athis.nombre=nombre;this.apellido=apellido; this.saldo=saldo; 
        this.edad=edad; // La ultima llamada es esta, y la primera es la super (llamada al padre) de Cliente (String nombre)-> la primera de todas.
    }
}