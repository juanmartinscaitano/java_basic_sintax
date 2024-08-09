package Controle_Fluxo_Repeticao;

public class ForExe {
    public static void main(String[] args) {
//        for (int a = 0; a <= 10; a++) {
//            System.out.println(a);
//    }

        tabuadaDinamica(7);

    }

    public static void tabuadaDinamica(int valor) {
        for (int valorInicial = 0; valorInicial <= 10; valorInicial ++) {
            int resultado = valorInicial * valor;
            System.out.println("Resultado: " + resultado);
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