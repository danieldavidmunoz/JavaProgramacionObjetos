package arrays;
//Desarrollar un método que muestre por pantalla un array de enteros de la siguiente forma: 
// [25, 32, -1567, 8]
public class Array06_01 {
    public static void muestraArray(int[] v){
        System.out.print("[");
        for (int i=0; i < v.length -1; i++){
            System.out.print( v[i] + ", ");
        }
        int j = v.length - 1;
        System.out.print(v[j]);
        System.out.print("]");
    }


public static void main (String [] args){
    int[] porDiez={1,10,100,1000,10000};
    muestraArray(porDiez);
}

}


