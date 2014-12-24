package stuff;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aangurets on 16.12.2014.
 */
public class TeamLeaderProgrammers extends Employee {
    private static List<Programmer> programmers = new ArrayList<Programmer>();
    private int departmentOfProgrammers = Wages.departmentOfProgrammers();
    private static int programmersCount = programmers.size();
    private static int wages = Wages.managerWages();


    public TeamLeaderProgrammers(int programmersCount) {
        this.programmersCount = programmersCount;
    }

    public List<Programmer> getProgrammers() {
        return programmers;
    }

    public void addPragrammer(Programmer programmer) {
        programmers.add(programmer);
    }

    public static int getProgrammersCount() {
        return programmersCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", wages= " + wages +
                ", departmentOfProgrammers= " + departmentOfProgrammers +
                '}';
    }
}

