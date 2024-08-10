package exeptions;

import java.text.NumberFormat;

public class ExemploException {
    public static void main(String[] args) {
        try{
            Number valor = Double.valueOf("a1.75");
        } catch (NumberFormatException e) {
            System.err.println("Favor digitar apenas numeros e com ponto");
        }
    }
}
