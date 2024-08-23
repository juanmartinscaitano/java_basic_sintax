package Calendar;

public class Casting {
    public static void main(String[] args) {
        int idade1 = 20;
        double idade2 = idade1;
        int idade3 = (int) idade2;
        float cpf = 01345678901F;

        System.out.println(idade3);

        char letra = 'M';
        String sexoM = String.valueOf(letra);
        letra = sexoM.charAt(0);
        String num = String.valueOf(idade3);

         int idade4 = Integer.parseInt(num);
    }
}
