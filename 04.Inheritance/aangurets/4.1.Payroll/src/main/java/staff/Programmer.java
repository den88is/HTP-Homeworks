package staff;

import java.util.Date;

public class Programmer {
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private final Date startingDate;
    private int wages;
    private final String technology;

    public Programmer(String name, String surname, Date dateOfBirth, Date startingDate, String technology) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.startingDate = startingDate;
        this.technology = technology;
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
