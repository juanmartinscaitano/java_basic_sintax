package OrientacaoObjetos.enums;

public class SistemaNumeracao {
    public static void main(String[] args) {
//         ultilizando esse parametro upper case o metodo consegue encontrar o valor/caminho do enum
//       String nomeStrig = "ceara";
//        EstadoBrasileiro eb = EstadoBrasileiro.valueOf(nomeStrig.toUpperCase());
        for (EstadoBrasileiro eb: EstadoBrasileiro.values()) {
            System.out.println("ESTADO LOCALIZADO");
            System.out.println(eb.getNome());
            System.out.println(eb.name());
            System.out.println(eb.getSigla());
            // enum = objetos imutaveis
        }
    }
}
