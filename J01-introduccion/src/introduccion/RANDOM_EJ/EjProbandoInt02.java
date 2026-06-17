//Write a method public static void divisibleByThreeInRange(int beginning, int end)
// that prints all the numbers divisible by three in the given range. 
// The numbers are to be printed in order from the smallest to the greatest.
package introduccion.RANDOM_EJ;

public class EjProbandoInt02 {
    public static void divisibleByThreeInRange(int beginning, int end){
        for (int i=beginning; i<=end;i++){
            if (i%3==0) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        divisibleByThreeInRange(5,15);
      //  divisibleByThreeInRange(0,5);
        divisibleByThreeInRange(1,21);
    }
}
