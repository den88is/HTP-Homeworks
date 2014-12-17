import staff.TeamLeaderProgrammers;
import staff.TeamLeaderSalesManagers;

import java.util.Random;

/**
 * Created by aangurets on 16.12.2014.
 */
public class Wages {
    static public void main(String[] args) {
        Random r = new Random();
        int directorWages = r.nextInt(5000) + 1000;
        int tLSMWages = directorWages / 3 * 2;
        int ordersSum = r.nextInt(50000) + 16700;
        int salesManagerWages = ordersSum / 100 * 3;
        int tLPWages = directorWages / 3 * 2;
        int programmerWages = directorWages / 100 * 80;
        int departmentOfProgrammers = tLPWages + programmerWages * TeamLeaderProgrammers.getProgrammersCount();
        int departmentOfSales = tLSMWages + (salesManagerWages * TeamLeaderSalesManagers.getSalesManagersCount());
        int totalSalary = directorWages + departmentOfProgrammers + departmentOfSales;

        System.out.println("Зарплата отдела программистов за месяц = " + departmentOfProgrammers +
                ",\n за квартал = " + (departmentOfProgrammers * 3) + ",\n за год = " + (departmentOfProgrammers * 12));
        System.out.println("Зарплата отдела продаж за месяц = " + departmentOfSales +
                ",\n за квартал = " + (departmentOfSales * 3) + ",\n за год = " + (departmentOfSales * 12));
        System.out.println("Общая зарплата = " + totalSalary +
                ",\n за квартал = " + (totalSalary * 3) + ",\n за год = " + (totalSalary * 12));
    }
}
