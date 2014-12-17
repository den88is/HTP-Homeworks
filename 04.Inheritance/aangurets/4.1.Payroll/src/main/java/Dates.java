import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aangurets on 16.12.2014.
 */

public abstract class Dates {
    static SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public static String NewDateOfBirth() {
        return df.format(new Date());
    }

    public static String NewStartingDate() {
        return df.format(new Date());
    }
}

