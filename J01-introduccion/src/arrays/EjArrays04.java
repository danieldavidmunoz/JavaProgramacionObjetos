// Desarrollar un método que reciba un array de enteros y retorne otro con el doble de 
//tamaño y con los valores originales almacenados en las mismas posiciones que en el 
// origina
// Array recibido: [25, 32, -1567, 8]  Array devuelto: [25, 32, -1567, 8, 0, 0, 0, 0]
package arrays;

import java.util.Arrays;

public class EjArrays04 {

    public static int[] creaArraysDobles (int[] v){
        //int numero=0;
        //for(int i=0;i<v.length;i++){
        //    numero+=i;
        //}
       //System.out.println(numero);
        int[]nums=new int[v.length*2];
        for(int i=0;i<v.length;i++){
           nums[i]=v[i];
        
       
        
    }
        return nums;

}
    public static void main(String [] args) {
        int[] v1 ={25,32,-1567,8};
        int[] resultado = (creaArraysDobles(v1));
        System.out.println(Arrays.toString(resultado));


}
}