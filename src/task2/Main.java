package task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Получить дату следующего вторника
 */
public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY)
            calendar.add(Calendar.DAY_OF_MONTH, 7);
        else
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        System.out.println(calendar.getTime());
    }
}
