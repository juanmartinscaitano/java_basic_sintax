package OrientacaoObjetos.enums;

public enum EstadoBrasileiro {
    PIAUI ("Piaui", "PI"),
    MARANHAO ("Maranhão", "MA"),
    SAO_PAULO ("São paulo", "SP"),
    RIO_JANEIRO ("Rio de Janeiro", "RJ"),
    CEARA ("Ceara", "CE")
            ;
    private String nome;
    private String sigla;
    private EstadoBrasileiro (String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
}
