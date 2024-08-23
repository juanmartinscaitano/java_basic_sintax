package ExerciciosJava;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);

        String nomeValue = "Juan";
        String cpfValue = "012345678901";

        System.out.println("Digite seu nome: ");
        String nome = login.next();

        System.out.println("Digite sua cpf: ");
        String cpf = login.next();

        if (nome.equals(nomeValue) && cpf.equals(cpfValue)) {
            System.out.println("Entrando");

//

        } else
            System.out.println("Nome ou cpf inválidos");

    }


}