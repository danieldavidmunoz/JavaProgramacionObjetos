//Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma 
//de cada columna. 

package arrays;

public class Array09_05 {
    public static double[] sumaColumnaArrays(double[][] nums) {
     int suma=0;
     double [] columna=new double[nums.length];   
  
         for(int i=0;i<nums[i].length;i++){
           suma=0;
               
            for(int j=0; j<nums.length;j++){
                suma+=nums[j][i];

            }
            columna[i]=suma;

        } 
        return columna;

    }
    public static void main (String[] args){
        double[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{1, 2, 3},{4, 5, 6},{7, 8, 9}};
         ArrayUtilProfe.muestra(sumaColumnaArrays(nums));
    }
}
