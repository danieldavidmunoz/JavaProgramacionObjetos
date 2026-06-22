package arrays;

public class Array01 {
    public static void main (String [] args){
        int[] nums1 = new int[10];
        muestraArray(nums1);
        for(int i = 0; i< nums1.length; i++) {
            nums1[i]=(int)Math.pow(2,i);
        }
       int[] porDiez={1,10,100,1000,10000};
       muestraArray(porDiez);
    }public static void muestraArray(int[] v){
    System.out.print("[");
    for (int i=0; i < v.length -1; i++){
        System.out.print( v[i] + ", ");
    }
    int j = v.length - 1;
    System.out.print(v[j]);
    System.out.print("]");

}
public static void muestraArray(double[] v){
    System.out.print("[");
    for (int i=0; i < v.length -1; i++){
        System.out.print( v[i] + ", ");
    }
    int j = v.length - 1;
    System.out.print(v[j]);
    System.out.print("]");
}
}
