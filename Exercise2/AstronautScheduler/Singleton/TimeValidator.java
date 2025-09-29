package Singleton;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import Singleton.Task;

public class TimeValidator {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static boolean isValidTimeFormat(String time) {
        try {
            LocalTime.parse(time, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isEndAfterStart(String start, String end) {
        LocalTime s = LocalTime.parse(start, formatter);
        LocalTime e = LocalTime.parse(end, formatter);
        return e.isAfter(s);
    }

    public static boolean isOverlapping(Task t1, Task t2) {
        LocalTime s1 = LocalTime.parse(t1.getStartTime(), formatter);
        LocalTime e1 = LocalTime.parse(t1.getEndTime(), formatter);
        LocalTime s2 = LocalTime.parse(t2.getStartTime(), formatter);
        LocalTime e2 = LocalTime.parse(t2.getEndTime(), formatter);

        return s1.isBefore(e2) && s2.isBefore(e1);
    }
}
