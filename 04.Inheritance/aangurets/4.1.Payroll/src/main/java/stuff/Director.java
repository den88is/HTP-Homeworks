package stuff;

/**
 * Created by aangurets on 16.12.2014.
 */
public class Director extends Employee {
    private int wages = Wages.directorWages();

    @Override
    public String toString() {
        return super.toString() +
                ", wages= " + wages +
                '}';
    }
}
