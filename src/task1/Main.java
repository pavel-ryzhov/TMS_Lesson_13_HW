package task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Получить день недели по дате
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
