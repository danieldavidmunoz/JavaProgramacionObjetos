package arrays;

public class Array03Parametrs {
    public static void cambia(int a){
        System.out.println(a);
        a=0;
    }

     public static void cambia (int[] v) {
        ArrayUtilProfe.muestra(v);
        for(int i=0;i<v.length;i++){
        v[i] = 0;
    }
}

    public static void main(String[] args) {
        int a= 55;
        cambia(a);
        System.out.println(a);
        System.out.println("---------------------------");

        int[] numeros = {55,55,55,55,55};
        cambia(numeros);
        ArrayUtilProfe.muestra(numeros);
    }
}
