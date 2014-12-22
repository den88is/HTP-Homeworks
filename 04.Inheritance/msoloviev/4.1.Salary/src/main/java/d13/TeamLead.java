package d13;

import java.util.ArrayList;

/**
 * Created by USER on 13.12.2014.
 */
public class TeamLead extends Developer {
    protected  ArrayList<Developer> developers=new ArrayList<Developer>();

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void deleteDeveloper(Developer developer){
        developers.remove(developer);
    }
public int countDevelopers(){

    return developers.size();
}
    @Override
    public String toString() {
        return "TeamLead{" +super.toString()+
                "\n developers of team=" + countDevelopers()+ " / " + developers +
                '}'+"\n";
    }
}

