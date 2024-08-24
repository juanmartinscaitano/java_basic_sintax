package ExerciciosJava;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
//         ultilizar somente 4 linhas
//        Scanner in = new Scanner(System.in);

//        System.out.println("Simplificando expressoes para reduzir o numero de linhas");
//        int x = 0;
//        x = in.nextInt();
//        if(x > 10) {
//            System.out.println("O numero digitado é maior que 10");
//        }else {
//            System.out.println("O numero digitado é menor que 10");
//        }

        //Scanner in = new Scanner(System.in);

        System.out.println("Simplificando expressoes para reduzir o numero de linhas");
        int x = new Scanner(System.in).nextInt();
        String maiorMenor = (x > 10) ? "maior" : "menor ou igual"  ;
        System.out.printf("O numero é %s que 10", maiorMenor);

    }


}
