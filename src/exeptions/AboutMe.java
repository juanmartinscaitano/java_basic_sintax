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
            }
                System.err.println("Utilize apenas caracteres ");
                // nome = "";
                //reseta os valores
                scanner.reset();
        }
            Scanner sobreNome = new Scanner(System.in);
            System.out.println(sobreNome);

            while (true) {
            System.out.println("Digite seu sobrenome: ");
            sobrenome = sobreNome.next();

            boolean temNumeros = sobrenome.matches("[a-zA-Z ]+");
            System.out.println(temNumeros);

            if (temNumeros){
                break;
            }
                System.err.println("Utilize apenas caracteres ");
                sobreNome.reset();

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
            //fazer o scanner numIdade e numAltura receberem apenas parametros igual a vida real
            Scanner numIdade = new Scanner(System.in);
            Scanner numAltura = new Scanner(System.in);

        }catch (Exception ex) {
            //faca sua logica aqui

        }
    }
}
