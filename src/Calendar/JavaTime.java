package Calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class JavaTime {
    public static void main(String[] args) {
        String stringDataBr = "02-05-1989";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        //aniversario.plusYears(); .minusWeeks for exemple is to subtract
        //contara os anos amais que forem passados

        LocalDate dataFinal = LocalDate.parse(stringDataBr, formatter);

        // fazendo a data seguir os parametros convertidos
        String formattedDate = dataFinal.format(formatter);

        System.out.println(formattedDate);

    }
}
