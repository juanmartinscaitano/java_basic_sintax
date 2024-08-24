package ExerciciosJava;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha um número para iniciar o Loop: ");
        int inicio = in.nextInt();

        System.out.println("Agora escolha um para finaliza-la: ");
        int fim = in.nextInt();

        int escolha = inicio;
        int resultado = inicio;
       // int resultado = fim;

        while (escolha < fim ) {
            escolha++ ;
            resultado += escolha;
        }
        System.out.println(resultado);
    }
}
