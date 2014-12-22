package d13;

/**
 * Created by USER on 13.12.2014.
 */
public class Developer extends Employee {


    protected String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Developer() {
         technology=".Net";
    }

    @Override
    public String toString() {
        return "Developer data {" +
                "technology='" + technology +"  "+super.toString()+ '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Developer developer = (Developer) o;

        if (getSoname() != null ? !getSoname().equals(developer.getSoname()) : developer.getSoname() != null) return false;

        return true;
    }


}
