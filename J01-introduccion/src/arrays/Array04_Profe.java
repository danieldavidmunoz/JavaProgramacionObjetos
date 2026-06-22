package arrays;

public class Array04_Profe {
    public static int sum (int... v){ // Parametro variable. 1 Solo puede existir uno de esta naturaleza. 2
        int suma = 0;
        for (int i = 0; i < v.length; i++){
            suma +=v[i];
        }
        return suma;
    }
public static void main(String[] args){
    System.out.println(sum(1,2,3,4,5,6,7,8,9,23));
    System.out.println(sum(1,2,4,5,7,8,23));
    System.out.println(sum(1,2,3,4,5,6,7,8,9,23,56,78,98,100));



}
}
