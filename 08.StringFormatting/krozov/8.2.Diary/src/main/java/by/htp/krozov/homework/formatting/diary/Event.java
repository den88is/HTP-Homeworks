package by.htp.krozov.homework.formatting.diary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by krozov on 27.12.14.
 */
public class Event {
    private final static DateFormat TODAY_FORMAT = new SimpleDateFormat("HH:mm");
    private final static DateFormat IN_7_DAYS_FORMAT = new SimpleDateFormat("dd MMM HH:mm");
    private final static DateFormat FUTURE_FORMAT = new SimpleDateFormat("EE dd MMM");

    private final String name;
    private final Date date;
    private final String description;

    public Event(String name, Date date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    private String dateFormat() {
        if (DateUtils.today(date)) {
            return TODAY_FORMAT.format(date);
        } else if (DateUtils.yesterday(date)) {
            return "Вчера";
        } else if (DateUtils.inLast7Days(date)) {
            Date now = new Date();

            int daysAgo = 0;
            while (!DateUtils.isSameDay(now, date)) {
                daysAgo++;
            }
            return String.format("%d дней назад", daysAgo);
        } else if (DateUtils.in7Days(date)) {
            return IN_7_DAYS_FORMAT.format(date);
        } else {
            Date now = new Date();
            if (date.after(now)) {
                return FUTURE_FORMAT.format(date);
            } else {
                return "Давно";
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s\n%s", name, dateFormat(), description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Event event = (Event) o;
        return date.equals(event.date)
                && description.equals(event.description)
                && name.equals(event.name);

    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }
}
