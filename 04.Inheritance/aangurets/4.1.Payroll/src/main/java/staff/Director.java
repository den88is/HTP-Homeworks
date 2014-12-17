package staff;

import java.util.Date;
import java.util.Random;

/**
 * Created by aangurets on 16.12.2014.
 */
public class Director {
    private final String name;
    private final String surname;
    private final String dateOfBirth;
    private final String startingDate;

    public Director(String name, String surname, String dateOfBirth, String startingDate) {
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
                ", dateOfBirth= " + dateOfBirth +
                ", startingDate= " + startingDate +
                '}';
    }
}
