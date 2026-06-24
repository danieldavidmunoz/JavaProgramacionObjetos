package arrays;

public class Arra09_07MejoradaChatGpT {

public static double[] retornaFilaArray(double[][] nums1, int num) {
    if (num < 0 || num >= nums1.length) {
        System.out.println("No hay ese número de fila");
        return null;
    }
    return nums1[num].clone(); // genera una nueva conexion

}

    public static void main(String[] args) {
        double[][] nums1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{1, 2, 3,6},{4, 5, 6},{7, 8, 9}};
        //int num =3;
        // retornaFilaArray(nums1,0);
        ArrayUtilProfe.muestra(retornaFilaArray(nums1,5));
    }
}
