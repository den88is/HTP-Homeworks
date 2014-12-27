package by.htp.krozov.homework.formatting.diary;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by krozov on 27.12.14.
 */
public final class DateUtils {
    private DateUtils() {
    }

    public static boolean today(Date date) {
        Date now = new Date();
        return isSameDay(date, now);
    }

    public static boolean isSameDay(Date date1, Date date2) {
        Calendar date1Calendar = Calendar.getInstance();
        date1Calendar.setTime(date1);

        Calendar date2Calendar = Calendar.getInstance();
        date2Calendar.setTime(date2);
        return date2Calendar.get(Calendar.YEAR) == date1Calendar.get(Calendar.YEAR)
                && date2Calendar.get(Calendar.MONTH) == date1Calendar.get(Calendar.MONTH)
                && date2Calendar.get(Calendar.DAY_OF_MONTH) == date1Calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static boolean yesterday(Date date) {
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_YEAR, -1);
        return isSameDay(c.getTime(), now);
    }

    public static boolean inLast7Days(Date date) {
        Calendar now = Calendar.getInstance();
        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTime(date);
        if (dateCalendar.before(now)) {
            Calendar weekAgoCalendar = Calendar.getInstance();
            weekAgoCalendar.setTime(now.getTime());
            weekAgoCalendar.add(Calendar.DAY_OF_YEAR, -7);
            return dateCalendar.after(weekAgoCalendar)
                    || isSameDay(weekAgoCalendar.getTime(), dateCalendar.getTime());
        } else {
            return false;
        }
    }

    public static boolean in7Days(Date date) {
        Calendar now = Calendar.getInstance();
        Calendar dateCalendar = Calendar.getInstance();
        dateCalendar.setTime(date);
        if (dateCalendar.after(now)) {
            Calendar after7DaysCalendar = Calendar.getInstance();
            after7DaysCalendar.setTime(now.getTime());
            after7DaysCalendar.add(Calendar.DAY_OF_YEAR, 7);
            return dateCalendar.after(after7DaysCalendar)
                    || isSameDay(after7DaysCalendar.getTime(), dateCalendar.getTime());
        } else {
            return false;
        }
    }
}
