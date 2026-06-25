package ejercicio10constructores;

public class PerroHerencia extends AnimalHerencia {
    public String raza;
  //  public PerroHerencia (){}
    public PerroHerencia (String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza=raza;

    }
    //PerroHerencia p =new PerroHerencia("Toby", 4, "Labrador");
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(raza);
    }



}
