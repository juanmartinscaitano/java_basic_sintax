package Controle_Fluxo_Repeticao;

public class ExemploBrackContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==2)
                continue;
            if (numero==4)
                break;
            System.out.println(numero);
        }
        //Qual a saida no console
    }
}
