package OrientacaoObjetos;

public class Sistema {
    public static void main(String[] args) {
        Client jonas = new Client("jonas");
        System.out.println(jonas.nome + " seu limite de crédito é: R$" + jonas.limiteCartao);
        jonas.solicitarLimiteCredito(200.0);
        System.out.println(jonas.nome + " seu limite de crédito é: R$" + jonas.limiteCartao);

        jonas.comprar(20.0);
        System.out.println(jonas.limiteCartao);

        Client iza = new Client("iza");
        System.out.println(iza.nome + " Seu limite de crédito é: R$" + iza.limiteCartao);
        iza.solicitarLimiteCredito(120.0);
        System.out.println(iza.nome + " seu limite de crédito é: R$" + iza.limiteCartao);
        iza.comprar(42.0);

    }
}
