package je_09_ControleFluxo.EstruturaCondicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 30.20;
        double valorSolicitado = 17.90;

        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso, novo saldo: " + saldo);
        }else
            fluxoIntermediario();
    }
    static void  fluxoIntermediario(){
        System.out.println("Saldo insuficiente");
    }

}
