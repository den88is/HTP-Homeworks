package stuff;

/**
 * Created by aangurets on 16.12.2014.
 */

public class SalesManager extends Employee {
    private int wages = Wages.salesManagerWages();

    @Override
    public String toString() {
        return super.toString() +
                ", wages= " + wages +
                '}';
    }
}

