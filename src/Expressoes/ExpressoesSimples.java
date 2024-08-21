package Expressoes;

import java.time.LocalDate;
import java.time.LocalTime;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "jonas Martins Caitano";
        Integer matricula = 123;
        Double salario = 2100.25;
        LocalDate dataAdmissao = LocalDate.now();

        String dadosFuncionarios = String.format("Mat.: %05d Nome: %-10.30s | Sal.: %,.2f Data ad.: %td/%<tm/%<ty",
                matricula, nome, salario, dataAdmissao);
        //s, d, f, t

        System.out.println(dadosFuncionarios);
    }
}

