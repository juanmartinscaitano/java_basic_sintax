package je_09_ControleFluxo.EstruturaCondicional;

public class FluxoTernario {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperacion" : "Reprovado";
        System.out.println(resultado);
    }
}
