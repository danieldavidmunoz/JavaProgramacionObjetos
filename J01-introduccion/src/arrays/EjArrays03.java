package arrays;

import java.util.Arrays;

//Desarrollar un método que reciba un array de enteros y retorne otro con los elementos 
//ordenados exactamente al revés que el original. 
public class EjArrays03 {
    public static int[] arrayInverso (int[] v){
  
    int[] nums2= new int[v.length];
       for (int i=v.length-1; i>=0;i--){
        nums2[v.length -1 -i]=v[i];
    }


    return nums2;
    }
    public static void main(String [] args) {
        int [] nums1 ={2,3,4,5,5};
        int[] resultado = (arrayInverso(nums1));
        System.out.println(Arrays.toString(resultado));

    }


}
