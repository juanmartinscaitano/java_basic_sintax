package ExerciciosJava;

import java.util.Scanner;

public class Ex03 {
    //faca um programa que peca o nome, idade e a cidade de nascimento do usuario
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = in.next();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();

        in.nextLine(); //esse comando limpa o buffer de memória

        System.out.println("Digite sua cidade: ");
        String cidadeNascimento = in.next();
        //string simples ultiliza se next || composta nextLine


        System.out.println("Olá meu nome é " + nome + ", sou natural de " + cidadeNascimento + " e tenho " + idade + " anos e estou aprendendo a programar");




    }
}
