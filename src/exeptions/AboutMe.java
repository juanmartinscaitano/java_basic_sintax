package exeptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class AboutMe {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Dgite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }catch (InputMismatchException ex) {
            //faca sua logica aqui
        }catch (Exception ex) {
            //faca sua logica
        }
    }
}
