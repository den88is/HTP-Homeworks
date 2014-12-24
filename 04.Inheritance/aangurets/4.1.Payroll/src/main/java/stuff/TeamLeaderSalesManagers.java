package stuff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aangurets on 16.12.2014.
 */
public class TeamLeaderSalesManagers extends Employee {
    public static List<SalesManager> salesManagers = new ArrayList<SalesManager>();
    private int departmentOfSales = Wages.departmentOfSales();
    private static int salesManagersCount = salesManagers.size();
    private static int wages = Wages.managerWages();

    public TeamLeaderSalesManagers(int salesManagersCount) {
        this.salesManagersCount = salesManagersCount;
    }

    public void addSalesManagers(SalesManager salesManager) {
        salesManagers.add(salesManager);
    }

    public static int getSalesManagersCount() {
        return salesManagersCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wages= " + wages +
                ", departmentOfSales= " + departmentOfSales +
                '}';
    }
}
