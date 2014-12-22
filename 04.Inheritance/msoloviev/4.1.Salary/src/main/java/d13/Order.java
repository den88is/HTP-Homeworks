package d13;

import java.util.Date;

/**
 * Created by USER on 13.12.2014.
 */
public class Order {
    protected double castOrder;
    private static int nextNumberOrder = 1;
    final int numberOrder;
    protected Date dayStartOrder;
    Order(double castOrder) {
        this.castOrder = castOrder;
        numberOrder = nextNumberOrder++;
    }

    @Override
    public String toString() {
        return "Order{" +
                "castOrder=" + castOrder +
                ", numberOrder=" + numberOrder +
                '}';
    }

    public Date getDayStartOrder() {
        return dayStartOrder;
    }

    public void setDayStartOrder(Date dayStartOrder) {
        this.dayStartOrder = dayStartOrder;
    }
}
