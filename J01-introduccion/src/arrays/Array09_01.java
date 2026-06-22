// Desarrollar un método que muestre por pantalla un array de dos dimensiones de double. 

package arrays;

public class Array09_01 {
   // public static void muestraArrayDosDimensiones (double[][] v){
    public static void main(String[] args){
        double [][] v1= {
             {1, 2, 3,4},
             {4, 5, 6},
             {7, 8, 9}
                };
        for(int i=0;i<v1.length;i++){
              System.out.println(i);
            for(int j=0; i<v1[i].length;j++){
                System.out.println(v1[i][j]);
                

            }
   
        }
    }

}
