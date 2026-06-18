package arrays;
// Desarrollar un método que reciba un array de enteros y retorne otro con los elementos 
// ordenados exactamente al revés que el original.
public class Array03 {
    public static int[] arrayOrdenInverso (int[] v){
        int[] resu = new int[v.length]; 
        int i= v.length;
        while (v.length!=0){ 
            v[i]=resu[i];
            i--;
        }
        return resu;  

            } 
    public static void main (String [] args){
        int []nums={5,24,36,95,105};
        int []numsCuad=arrayOrdenInverso(nums);
        Array06_01.muestraArray(numsCuad);
    }  
        }
  

