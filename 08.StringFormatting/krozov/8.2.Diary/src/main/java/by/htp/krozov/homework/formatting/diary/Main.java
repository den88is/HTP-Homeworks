package by.htp.krozov.homework.formatting.diary;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by krozov on 27.12.14.
 */
public class Main {
    public static void main(String[] args) {
        Diary diary = new Diary();
        Calendar calendar = Calendar.getInstance();
        Event e1 = new Event("Event1", calendar.getTime(), "Descr");
        diary.add(e1);

        calendar.add(Calendar.DAY_OF_YEAR, -1);
        Event e2 = new Event("Event2", calendar.getTime(), "Descr");
        diary.add(e2);

        calendar.add(Calendar.DAY_OF_YEAR, -2);
        Event e3 = new Event("Event3", calendar.getTime(), "Descr");
        diary.add(e3);

        System.out.println(diary);
    }
}
