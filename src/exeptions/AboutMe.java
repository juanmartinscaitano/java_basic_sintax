package exeptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class AboutMe {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String nome = "";
        String sobrenome = "";
        boolean preencheuNome = false;

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println(scanner);



            while (true) {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();

            boolean contemNumeros = nome.matches("[a-zA-Z]+");
            System.out.println(contemNumeros);

            //ou == para comparar
            if (contemNumeros){
                break;
            }else {
                System.err.println("Utilize apenas caracteres ");
                nome = "";
                //reseta os valores
                scanner.reset();
            }
        }
        while (true) {
            Scanner niu = new Scanner(System.in);
            System.out.println("Digite seu sobrenome: ");
            sobrenome = niu.next();
            boolean contemNumeros = nome.matches("[a-zA-Z]+");
            if (contemNumeros){
                break;
            }
            System.out.println("Utilize apenas caracteres ");
            sobrenome = "";
            niu.reset();

        }

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Dgite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }catch (InputMismatchException ex) {
            //faça sua lógica aqui
            System.err.println("Ultilize um valor válido");
        }catch (Exception ex) {
            //faca sua logica aqui

        }
    }
}
