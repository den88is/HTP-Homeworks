package stuff;

import java.util.Random;

/**
 * Created by aangurets on 16.12.2014.
 */
public class Wages {
    public static int directorWages() {
        Random r = new Random();
        int directorWages = r.nextInt(5000) + 1000;
        return directorWages;
    }

    public static int managerWages() {
        Random r = new Random();
        int managers = r.nextInt(4000) + 500;
        return managers;
    }

    public static int salesManagerWages() {
        Random r = new Random();
        int ordersSum = r.nextInt(50000) + 16700;
        int salesManagerWages = ordersSum / 100 * 3;
        return salesManagerWages;
    }

    public static int programmerWages() {
        Random r = new Random();
        int programmerWages = r.nextInt(4000) + 500;
        return programmerWages;
    }

    public static int departmentOfProgrammers() {
        int departmentOfProgrammers = managerWages() +
                programmerWages() * TeamLeaderProgrammers.getProgrammersCount();
        return departmentOfProgrammers;
    }

    public static int departmentOfSales() {
        int departmentOfSales = managerWages() +
                salesManagerWages() * TeamLeaderSalesManagers.getSalesManagersCount();
        return departmentOfSales;
    }

    int totalSalary = directorWages() + departmentOfProgrammers() + departmentOfSales();
}
