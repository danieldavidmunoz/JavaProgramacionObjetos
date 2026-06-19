package introduccion.RANDOM_EJ;
// Crea un método llamado:nombreOperacion(char c)
public class EjSwitch00 {
    public static String diaDeLaSemana (int num){
        String dia="";
 //       String s=dia;
//        int numero=num;
        switch (num) {
            case 1 :
                if(num==1) 
                dia="lunes";
                break;
            case 2 :
                if(num==2)
                dia="martes";
                break;
            case 3 :
                if(num==3)
                dia="miercoles";
                break;
            case 4 :
                if(num==4);
                dia="jueves";
                break;
            case 5 :
                if(num==5)
                dia="viernes";
                break;
            case 6 :
                if(num==6)
                dia="sabado";
                break;
            case 7 :
                if(num==7)
                dia="domingo";
                break;
            default:

                dia="dime un numero entre el 0 y el 7";

        }
        return dia;
    }
    public static void main(String[] args) {
        System.out.println(diaDeLaSemana(1));
        System.out.println(diaDeLaSemana(2));
        System.out.println(diaDeLaSemana(3));
        System.out.println(diaDeLaSemana(4));
        System.out.println(diaDeLaSemana(5));
        System.out.println(diaDeLaSemana(6));
        System.out.println(diaDeLaSemana(7));
        System.out.println(diaDeLaSemana(10));

    }
}
