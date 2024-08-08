package Controle_Fluxo_Repeticao;

public class ForExe {
    public static void main(String[] args) {
        for (int a = 0; a <= 10; a++) {
            System.out.println(a);
        }
    }

    public String java() {
        return "Ola java";
    }

}



class Teste {
    public static void main(String[] args) {
        String[] args1 = {""};
        ForExe.main(args1);

        new ForExe().java();

    }
}