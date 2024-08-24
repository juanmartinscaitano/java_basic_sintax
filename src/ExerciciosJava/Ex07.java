package ExerciciosJava;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner tabuada1 = new Scanner(System.in);
//        int umDez = 10;

        System.out.println("Informe a tabuada desejada: ");
        int tabuada = tabuada1.nextInt();


        for (int i = 10 ; i >= 1 ; i--) {
            //ax * bx = cx
            int result = i * tabuada;
            System.out.printf("%d x %d = %d\n" , i, tabuada, result);
        }

    }
}
