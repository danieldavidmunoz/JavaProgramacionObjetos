package ejercicio10constructores;
import ejercicio10constructores.Empleado;


//Si no se indica lenguaje, será "Java". 
//El constructor simple de Programador debe reutilizar el constructor completo usando this().
//El constructor completo debe llamar a super(nombre, salario).
public class Programador extends Empleado {
      private String lenguajePrincipal; 
        public Programador (String nombre) {
            this(nombre, 0,"Java");
        }
        public Programador (String nombre, double salario, String lenguajePrincipal){
            super(nombre, salario);
            if (lenguajePrincipal==null)
                this.lenguajePrincipal="Java";

            


      }
  



}
