package staff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aangurets on 16.12.2014.
 */
public class TeamLeaderSalesManagers {
    public static List<SalesManager> salesManagers = new ArrayList<SalesManager>();
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private final Date startingDate;
    private static int salesManagersCount = salesManagers.size();

    public TeamLeaderSalesManagers(String name, String surname, Date dateOfBirth,
                                   Date startingDate, int salesManagersCount) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.startingDate = startingDate;
        this.salesManagersCount = salesManagersCount;
    }

    public void addPragrammer(String name, String surname, Date dateOfBirth, Date startingDate) {
        this.salesManagers.add(
                new SalesManager(name, surname, new Date(), new Date())
        );
    }

    public static int getSalesManagersCount() {
        return salesManagersCount;
    }
}
