package Controle_Fluxo_Repeticao;

import java.util.Random;

public class ExemploDoWhile {
    private static int numeroTentativas = 0;
    public static void main(String[] args) {
        System.out.println("Ligando...");


        do{
           //executando repetidas vezes ate alguem atender
            System.out.println("Telefone tocando");
        }
        while(tocando());
        if (numeroTentativas < 5)
            System.out.println("Alo !!!");
        else
            System.out.println("Nao atendeu");
    }
        private static boolean tocando() {
            numeroTentativas++;
            boolean atendeu = new Random().nextInt(5)==1;
            if(numeroTentativas >=5)
                return false;
            else
                return !atendeu;
        }

}
