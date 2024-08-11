import java.util.Scanner;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        String country = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coutry: ");
        country = scanner.next();
        System.out.println("Your country is: " + country);
    }
}
