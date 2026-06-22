package arrays;
//Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma 
//total de todos los elementos. 
public class Array09_02 {
    public static int SumaDimensionesArray(double[][] arrays) {
        int contador=0;
        for(int i=0;i<arrays.length;i++){
            
            for(int j=0; j<arrays[i].length;j++){
            contador++;                   
             }
         }
        return contador;
     }
     public static void main(String[] args) {
        double[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(SumaDimensionesArray(nums));
       ;
     }
}

