package Calendar;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime dataHora = localDate.atTime(LocalTime.now());
        esperaDataHora(dataHora);
    }
    static void esperaDataHora(LocalDateTime data) {

    }
}
