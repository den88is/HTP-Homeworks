package d13;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by USER on 13.12.2014.
 */
public class Company {
    final static double millSecInMonth = 2592000000.0;
    protected int managerCount;
    protected int teamLeadCount;
    protected int developerCount;
    protected int directorCount;
    protected double rateManagers;
    protected double managersPercent;
    protected double rateTeamLider;
    protected double rateDeveloper;
    protected double rateDirector;
    protected ArrayList<Developer> developers = new ArrayList<Developer>();
    protected ArrayList<TeamLead> teamLeads = new ArrayList<TeamLead>();
    protected ArrayList<SalesManager> salesManagers = new ArrayList<SalesManager>();
    protected ArrayList<Director> directors = new ArrayList<Director>();
    int developerRateMin = 400;
    int developerRateMax = 5400;
    int teamLeadSurchargeMax = 2000;
    int directorRateMin = 5000;
    int directorRateMax = 10000;
    int managerRateMin = 400;
    int managerRateMax = 1400;

    /*create a new company with random employs and their rates*/
    Company(int directorCount, int developerCount, int managerCount, int teamLeadCount) {
        this.developerCount = developerCount;
        this.directorCount = directorCount;
        this.managerCount = managerCount;
        this.teamLeadCount = teamLeadCount;
        setManagersPercent(3);
        setRateDeveloper(new Random().nextInt(developerRateMax - developerRateMin) + developerRateMin);
        setRateTeamLider(rateDeveloper + new Random().nextInt(teamLeadSurchargeMax));
        setRateDirector(new Random().nextInt(directorRateMax - directorRateMin) + directorRateMin);
        setRateManagers(new Random().nextInt(managerRateMax) + managerRateMin);
        for (int i = 0; i < developerCount; i++) {
            addDeveloper(new Developer());
        }
        for (int i = 0; i < directorCount; i++) {
            addDirector(new Director());
        }
        for (int i = 0; i < teamLeadCount; i++) {
            addTeamLead(new TeamLead());
        }
        for (int i = 0; i < managerCount; i++) {
            addSalesManager(new SalesManager());
        }

        int team = 0;
        for (Developer developer : developers) {
            teamLeads.get(team).addDeveloper(developer);
            ++team;
            if (team == teamLeadCount) {
                team = 0;
            }
        }
    }

    public double salaryCalcTeam(String dateBegin, String dateEnd, int numberTeam) {
        double salary = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date beginDate = simpleDateFormat.parse(dateBegin, new ParsePosition(0));
        Date endDate = simpleDateFormat.parse(dateEnd, new ParsePosition(0));
        double kofTime = (endDate.getTime() - beginDate.getTime()) / millSecInMonth;
        for (Developer developer : teamLeads.get(numberTeam).developers) {
            if (developer.dayStartWork.after(beginDate) && developer.dayStartWork.before(endDate)) {
                salary += kofTime * rateDeveloper;
            }
        }
        return salary + kofTime * rateDeveloper;
    }

    public double salaryCalcManager(String dateBegin, String dateEnd, int numberManager) {
        double salary = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date beginDate = simpleDateFormat.parse(dateBegin, new ParsePosition(0));
        Date endDate = simpleDateFormat.parse(dateEnd, new ParsePosition(0));
        double kofTime = (endDate.getTime() - beginDate.getTime()) / millSecInMonth;
        for (Order order : salesManagers.get(numberManager).orders) {
            if (order.getDayStartOrder().after(beginDate) && order.getDayStartOrder().before(endDate)) {
                salary += order.castOrder * managersPercent / 100;
            }
        }
        return salary + kofTime * rateManagers;
    }

    public double salaryCalcCompany(String dateBegin, String dateEnd) {
        double salary = 0;
        for (int i = 0; i < teamLeadCount; i++) {
            salary += salaryCalcTeam(dateBegin, dateEnd, i);
        }
        for (int i = 0; i < managerCount; i++) {
            salary += salaryCalcManager(dateBegin, dateEnd, i);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date beginDate = simpleDateFormat.parse(dateBegin, new ParsePosition(0));
        Date endDate = simpleDateFormat.parse(dateEnd, new ParsePosition(0));
        double salaryDirector = rateDirector * (endDate.getTime() - beginDate.getTime()) / millSecInMonth;
        return (salary + salaryDirector);
    }

    public void addDeveloper(Developer developer) {
        this.developers.add(developer);
    }

    public void addTeamLead(TeamLead teamLead) {
        this.teamLeads.add(teamLead);
    }

    public void addDirector(Director director) {
        this.directors.add(director);
    }

    public void addSalesManager(SalesManager salesManager) {
        this.salesManagers.add(salesManager);
    }

    public void setRateManagers(double rateManagers) {
        this.rateManagers = rateManagers;
    }

    public double getRateManagers() {
        return rateManagers;
    }

    public void setManagersPercent(double managersPercent) {
        this.managersPercent = managersPercent;
    }

    public double getManagersPercent() {
        return managersPercent;
    }

    public double getRateTeamLider() {
        return rateTeamLider;
    }

    public void setRateTeamLider(double rateTeamLider) {
        this.rateTeamLider = rateTeamLider;
    }

    public double getRateDeveloper() {
        return rateDeveloper;
    }

    public void setRateDeveloper(double rateDeveloper) {
        this.rateDeveloper = rateDeveloper;
    }

    public double getRateDirector() {
        return rateDirector;
    }

    public void setRateDirector(double rateDirector) {
        this.rateDirector = rateDirector;
    }


}
