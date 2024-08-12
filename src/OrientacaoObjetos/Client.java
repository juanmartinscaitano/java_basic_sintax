package OrientacaoObjetos;

public class Client {
    String nome;
    Double limiteCartao = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado) {
        limiteCartao = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteCartao = limiteCartao - valorProduto;
    }
    public Client (String nome){
        this.nome = nome;
    }
}
