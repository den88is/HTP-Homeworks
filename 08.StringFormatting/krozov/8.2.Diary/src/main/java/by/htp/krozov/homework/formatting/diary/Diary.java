package by.htp.krozov.homework.formatting.diary;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by krozov on 27.12.14.
 */
public class Diary {
    private final Set<Event> events = new HashSet<Event>();

    public void add(@NotNull Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Can't add null event.");
        }
        events.add(event);
    }

    public void remove(@NotNull Event event) {
        if (event == null) {
            throw new IllegalArgumentException("Can't remove null event.");
        }
        events.remove(event);
    }

    @Override
    public String toString() {
        return String.valueOf(events);
    }
}
