package arrays;
// import arrays.Array06_01;
//Desarrollar  un  método  que  reciba  un  array  de  enteros  y  retorne  otro  con  los  valores 
// originales elevados al cuadrado. 
public class Array02 {
    public static int[] arrayElevaCuadrado (int[] v){
        int[] nums1= new int[v.length];
        for (int i=0;i<v.length;i++){
            nums1[i]=v[i]*v[i];
        }

        return nums1;
    }
    public static void main (String [] args){
        int []nums2={5,24,36,95,105};
        int []numsCuad=arrayElevaCuadrado(nums2);
        Array06_01.muestraArray(numsCuad);
    }
}
