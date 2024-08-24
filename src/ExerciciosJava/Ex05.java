package ExerciciosJava;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);

        String nomeValue = "Juan";
        String cpfSenhaValue = "01234567890";

        System.out.println("Digite seu nome de login: ");
        String nome = login.nextLine();

        System.out.println("Digite sua senha(cpf): ");
        String cpfSenha = login.nextLine();

        // se o valor for numeral pode se ultilizar ==
        // mas quando é string ultiliza-se o nome da varivel.equal(variavel para ser comparada);

        if (nome.equals(nomeValue) && cpfSenha.equals(cpfSenhaValue)) {
            System.out.println("Entrando...");
            login.close();
        } else
            System.err.println("Nome ou/e cpf inválidos");
    }

}