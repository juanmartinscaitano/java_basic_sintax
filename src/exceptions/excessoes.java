package exceptions;

public class excessoes {
    public static void main(String[] args) {
        try {
            checkEstado("CE");
        } catch (EstadoValidacoException e) {
            System.err.println(e.getMessage());
            System.err.println("Selecione um estado válido");
        }
    }
    static void checkEstado(String nomeEstado)  throws EstadoValidacoException{
        if (!nomeEstado.equals(("PI")))
            throw new EstadoValidacoException();
        System.out.println("Bem-Vindo ao (a): " + nomeEstado.toUpperCase());
    }

}
