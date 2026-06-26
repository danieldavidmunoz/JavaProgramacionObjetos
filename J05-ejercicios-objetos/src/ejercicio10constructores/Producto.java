package ejercicio10constructores;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto (String nombre) {
        this(nombre, 0, 0);
    }
    public Producto (String nombre, double precio) {
        this(nombre, precio,0);
   
            }

    public Producto (String nombre, double precio, int stock) {
        this.nombre=nombre;
        //this.stock=stock < 0 ? precio:0;
        //this.precio=precio < 0 ? precio:0;
        if (stock<0) {
            this.stock=0;
        }else 
            this.stock=stock;

        if (precio<0) {
            this.precio=0;
        }else{
            this.precio=precio;
        }
        }

    } 
//Si solo se indica el nombre, el precio será 0 y el stock será 0. 
//Si se indica nombre y precio, el stock será 0. 
//Todos los constructores deben acabar llamando al constructor más completo. 
//No se permite precio negativo. 
//No se permite stock neg


