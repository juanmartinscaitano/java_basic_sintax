package je_09_ControleFluxo.EstruturaCondicional;

public class SwitchCase {
    public static void main(String[] args) {
        String plano = "2";
        String planoCombinado = "a";


        //exemplo de switch
        switch(plano) {
            case "1":{
                System.out.println("100 minutos de ligacao");
                break;
            }
            case "2":{
                System.out.println("100 minutos de ligacao + whatsapp e instagram ilimitado");
                break;
            }
            case "3":{
                System.out.println("100 minutos de ligacao + whatsapp e instagram ilimitado + 5Gb de youtube");
                break;
            }

        }


        //switch case de um plano de celular mas sem ultilizar o break
        switch (planoCombinado) {
            case "c":{
                System.out.println("5gb de youtube");
            }
            case "b":{
                System.out.println("whatsapp e instagram ilimitados");
            }
            case "a":{
                System.out.println("100 minutos de ligacao");
            }

        }
    }
}
