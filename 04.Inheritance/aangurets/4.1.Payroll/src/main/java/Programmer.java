import java.text.SimpleDateFormat;
import java.util.Date;

public class Programmer extends Wages {
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private final Date startingDate;
    private int wages = programmerWages();
    private final String technology;
    static SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public Programmer(String name, String surname, Date dateOfBirth, Date startingDate, String technology) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startingDate = startingDate;
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name=" + name +
                ", surname=" + surname +
                ", dateOfBirth= " + df.format(dateOfBirth) +
                ", startingDate= " + df.format(startingDate) +
                ", technology= " + technology +
                ", wages= " + wages +
                '}';
    }
}
