package Pilares_Poo;

public class Computador01 {
    public static void main(String[] args) {
        SistemaMensagemInstantanea smi = null;
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new Msn();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();
        else if (appEscolhido.equals("facebook"))
            smi = new Facebook();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
