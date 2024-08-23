package ExerciciosJava;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int usuarioIdade = idade.nextInt();

        System.out.println("Digite a idade de sua mãe: ");
        int maeidade = idade.nextInt();
        int diff = maeidade - usuarioIdade;
        System.out.printf("A sua mãe é %d mais velha que você!", diff);
    }
}
