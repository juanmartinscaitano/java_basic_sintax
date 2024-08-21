package Calendar;

//import java.sql.Time;
//import java.time.Clock;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class calendarJavaUtil {
    public static void main(String[] args) {
        Locale brazilLocale = new Locale("pt", "BR");
        Date date = new Date();
//        Timer time = new Time
//        System.out.println(time);

        Calendar calendar = Calendar.getInstance(brazilLocale);
        System.out.println(calendar);

        String calendarType = calendar.getCalendarType();
        System.out.println("Calendario tipo: " + brazilLocale);
        System.out.println("Current date and time in brazil: " + calendar.getCalendarType() + "| " + date);
    }
}
