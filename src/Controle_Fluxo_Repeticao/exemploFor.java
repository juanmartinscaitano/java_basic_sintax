package Controle_Fluxo_Repeticao;

import java.util.Random;
import java.util.random.RandomGenerator;

public class exemploFor {
    public static void main(String[] args) {
        boolean dormiu = false;
        for(int carneirinhos = 1; carneirinhos <=20; carneirinhos = carneirinhos * 3) {
            System.out.println(carneirinhos + " - carneirinho(s)");

            if(new Random().nextInt(20) == carneirinhos) {
                break;
//            double numeroAleatorio = Math.random();
            }
        }

        String alunos[] = {"jhon", "pablo", "george", "kenedy"} ;

        for (String aluno : alunos ) {
            System.out.println(aluno);
        }
    }
}
