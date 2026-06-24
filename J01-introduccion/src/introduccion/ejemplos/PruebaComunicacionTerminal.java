package introduccion.ejemplos;

public class PruebaComunicacionTerminal {

  
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No has pasado argumentos");

            return;

        }

        System.out.println(args[0]);

    }

}

