package stuff;

import java.text.SimpleDateFormat;

public class Programmer extends Employee {
    private int wages = Wages.programmerWages();
    private String technology;
    static SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "stuff.Programmer{" +
                "name=" + name +
                ", surname=" + surname +
                ", dateOfBirth= " + df.format(dateOfBirth) +
                ", startingDate= " + df.format(startingDate) +
                ", technology= " + technology +
                ", wages= " + wages +
                '}';
    }
}
