package JavaNewIo;

import java.time.LocalDate;

public class Cadastro {
    String nome;
    String sexo;
    Long telefone;
    LocalDate dataNascimento;
    Double valorSugerido;
    boolean cliente;


    // este construtor é somemente para ilustrar este exemplo
    // evite propagar esta estratégia ao longo dos seus estudos e projetos


    public Cadastro(String nome, String sexo, Long telefone, LocalDate dataNascimento, Double valorSugerido, boolean cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.valorSugerido = valorSugerido;
        this.cliente = cliente;
    }

    //métodos getters para obter os dados dos objetos

}
