package arrays;
//Desarrollar un método que  reciba una matriz matemática (dos dimensiones) de  double y 
//retorne la matriz traspuesta. La matriz traspuesta se genera cambiando filas por columnas:  
public class Array09_06 {

    public static double[][] creaMatrizTraspuesta(double[][] nums) {
        double[][] nums2 = new double[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums2[j][i] = nums[i][j];
            }
        }
        return nums2;
    }
    public static void main(String[] args) {
        double[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{1, 2, 3},{4, 5, 6},{7, 8, 9}};
         creaMatrizTraspuesta(nums);
        ArrayUtilProfe.muestra(creaMatrizTraspuesta(nums));
    }
   
}
