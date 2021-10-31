package task1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Получить день недели по дате
 */
public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek[new GregorianCalendar().get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
