//Desarrollar un método que reciba un array de dos dimensiones de double y retorne la suma 
// de cada fila. 
package arrays;

public class Array09_04 {
    public static double[] sumaFilaArrays(double[][] v){
     
     int suma=0;
     double [] fila=new double[v.length];   
        for(int i=0;i<v.length;i++){
            suma=0;
            for(int j=0; j<v[i].length;j++){
                suma+=v[i][j];
            }
            fila[i]=suma;
        } 
        return fila;
    }
public static void main(String[] args) {
    double[][] nums = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    ArrayUtilProfe.muestra(sumaFilaArrays(nums));

}
    
}