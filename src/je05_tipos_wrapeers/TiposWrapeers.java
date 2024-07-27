package je05_tipos_wrapeers;

public class TiposWrapeers {
    public static void main (String[] args) {
        double numeroDouble = 123.34;
        int numeroInt = (int) numeroDouble;// convencao explicita

        Double d = 23.98;
        Integer i = d.intValue();

        System.out.println(numeroInt + i);
    }
}
