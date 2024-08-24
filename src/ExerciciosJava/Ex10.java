package ExerciciosJava;

import java.util.Map;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        int somaUnid = in.nextInt();
        int soma = 0;

        while (somaUnid > 0) {
            //int modulo = somaUnid % 10;
            soma += (somaUnid % 10);
            somaUnid /= 10;
            System.out.println("O valor da soma é: " + soma);

        }
        System.out.println("A soma dos algarismos é: " +  soma);
    }
}
