package ExerciciosJava;

public class Ex08 {
    public static void main(String[] args) {
        System.out.print("A soma dos 100 primeiros numeros é: ");

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
            //soma = soma + i;

        }
        System.out.println(soma);

        System.out.print("Soma ultilizando o Loop While: ");
        int soma2 = 0, i2 = 0;

        while (i2 <= 100) {
            soma2 += i2;
            i2++;

        }
        System.out.println(soma2);
    }
}
