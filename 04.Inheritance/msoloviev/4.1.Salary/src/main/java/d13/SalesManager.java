package d13;

import java.util.ArrayList;

/**
 * Created by USER on 13.12.2014.
 */
public class SalesManager extends Employee {
    protected ArrayList<Order> orders=new ArrayList<Order>();

    public void addOrder(Order order){
        orders.add(order);
    }
    public void deleteOrder(Order order){
        orders.remove(order);
    }

    @Override
    public String toString() {
        return "SalesManager{" +super.toString()+"\n"+
                "orders=" + orders +
                '}';
    }
}
