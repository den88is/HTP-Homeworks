package stuff;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aangurets on 23.12.2014.
 */
public abstract class Employee {
    public static String name;
    public static String surname;
    public static Date dateOfBirth;
    public static Date startingDate;
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public Employee() {
        name = name;
        surname = surname;
        dateOfBirth = new Date();
        startingDate = new Date();
    }

    public static Date getStartingDate() {
        return startingDate;
    }

    public static void setStartingDate(Date startingDate) {
        Employee.startingDate = startingDate;
    }

    public static Date getDateOfBirth() {
        return dateOfBirth;
    }

    public static void setDateOfBirth(Date dateOfBirth) {
        Employee.dateOfBirth = dateOfBirth;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Employee.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", surname=" + surname +
                ", dateOfBirth= " + df.format(dateOfBirth) +
                ", startingDate= " + df.format(startingDate) +
                '}';
    }
}
