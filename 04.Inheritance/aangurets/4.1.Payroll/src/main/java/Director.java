import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aangurets on 16.12.2014.
 */
public class Director extends Wages {
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private final Date startingDate;
    static SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
    private int wages = directorWages();

    public Director(String name, String surname, Date dateOfBirth, Date startingDate) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startingDate = startingDate;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name=" + name +
                ", surname=" + surname +
                ", dateOfBirth= " + df.format(dateOfBirth) +
                ", startingDate= " + df.format(startingDate) +
                ", wages= " + wages +
                '}';
    }
}
