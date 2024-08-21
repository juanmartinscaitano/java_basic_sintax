package scanner;

import java.util.Scanner;

public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Bem vindo " + nome);
    }
}
