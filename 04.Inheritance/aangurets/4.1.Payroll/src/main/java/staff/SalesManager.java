package staff;

import java.util.Date;

/**
 * Created by aangurets on 16.12.2014.
 */

public class SalesManager {
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private final Date startingDate;

    public SalesManager(String name, String surname, Date dateOfBirth, Date startingDate) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startingDate = startingDate;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "name=" + name +
                ", surname='" + surname + '\'' +
                ", dateOfBirth'" + dateOfBirth + '\'' +
                ", startingDate=" + startingDate +
                '}';
    }
}

