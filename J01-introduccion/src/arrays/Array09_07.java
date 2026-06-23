//Desarrollar un método que reciba un array de dos dimensiones de double y un número de 
//fila y retorne la fila indicada. 
package arrays;

public class Array09_07 {
    public static double[] retornaFilaArray(double [][]nums1, int num) {

        double [] nums2= new double [nums1[num].length]; 
    //    for (i int=0; i<nums1[0].length; i++){
    //        if(nums1[i]==num){
    //        nums2=nums1[num];
    //    }

    //    }   


        return nums2;
    }
    public static void main(String[] args) {
        double[][] nums1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{1, 2, 3,6},{4, 5, 6},{7, 8, 9}};
        int num =3;
         retornaFilaArray(nums1,3);
        ArrayUtilProfe.muestra(retornaFilaArray(nums1,3));
    }

}
