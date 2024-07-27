package je06_operadores;

import java.util.Date;

public class Atribuicoes {
    public static void main(String[] args) {
        String nome = "jonas" + " martins ";
        double peso =60.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println(nome + dataNascimento + peso);

    }
}
