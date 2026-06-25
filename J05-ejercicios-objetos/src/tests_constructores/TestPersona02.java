package tests_constructores;
import ejercicio10constructores.Persona;

public class TestPersona02 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Carlos");
        Persona p3 = new Persona("Lucia",22);
    
        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();
    }

}
