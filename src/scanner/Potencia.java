package scanner;

import OrientacaoObjetos.Sistema;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = 2;

        System.out.println("Digite um numero: ");
        double expoente = scanner.nextDouble();

        double result = Math.pow(base, expoente);
        System.out.println(base + " Elevado a " + expoente + "é " + result);



    }
}
