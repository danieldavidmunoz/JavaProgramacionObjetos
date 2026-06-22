//3. Modifique el programa anterior para que imprima el perímetro del cuadrado de la siguiente manera:
// ****
// *  *
// *  *
// ****


package introduccion.ejemplos.Ejercicios04;
//import util.Consola;
public class Ej04_03 {
    public static void dibujaPermitroCuadrado (int num){
        //int lado=Consola.leeInt("dime un numero");
        for (int i=0; i<=num; i++){
            if (i==0||i==num){
                for (int j=0; j<=num;j++){
                System.out.print("*");

                }
            }
            else {
                for(int j=0; j<=num; j++){
                    if (j==0 || j==num)
                        System.out.print("*");
                    else System.out.print(" ");
                    }
                }
        System.out.println("");
            }
        }
    public static void main(String[] args) {
        dibujaPermitroCuadrado(6);
    }
}

