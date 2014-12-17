package staff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by aangurets on 16.12.2014.
 */
public class TeamLeaderProgrammers {
    private static List<Programmer> programmers = new ArrayList<Programmer>();
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private final Date startingDate;
    private static int programmersCount = programmers.size();

    public TeamLeaderProgrammers(String name, String surname, Date dateOfBirth, Date startingDate, int programmersCount) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.startingDate = startingDate;
        this.programmersCount = programmersCount;
    }

    public List<Programmer> getProgrammers() {
        return programmers;
    }

    public void addPragrammer(String name, String surname, Date dateOfBirth, Date startingDate, String technology) {
        this.programmers.add(
                new Programmer(name, surname, new Date(), new Date(), technology)
        );
    }

    public static int getProgrammersCount() {
        return programmersCount;
    }
}

