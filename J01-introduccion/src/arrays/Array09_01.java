// Desarrollar un método que muestre por pantalla un array de dos dimensiones de double. 

package arrays;

public class Array09_01 {
  public static void muestraArrayDosDimensiones (double[][] v){

        for(int i=0;i<v.length;i++){
            
            for(int j=0; j<v[i].length;j++){
                System.out.print( v[i][j]+"\t");
                
                
            }
            System.out.println("\n");
        }
    }
    public static void main (String [] args){
        double[][] matriz = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        muestraArrayDosDimensiones(matriz);
    }

}
