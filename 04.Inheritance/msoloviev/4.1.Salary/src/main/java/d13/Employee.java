package d13;


import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by USER on 13.12.2014.
 */
public abstract class Employee {
    protected String name;
    protected String soname;
    protected Date dayBirthday;
    protected Date dayStartWork;
    protected String characters = "QWEERTYYUUIOOPAASDFGHJKLZXCVBNM";

    /* create string variable length=length */
    public static String generateString(String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(new Random().nextInt(characters.length()));
        }
        return new String(text);
    }

    /* create date variable from beginTime to now */
    public static Date generateDate(Date beginTime) {


        long now = new Date().getTime();
        long startTime = beginTime.getTime();
        long randomTime = startTime + (long) ((now-startTime ) * Math.random());
        return new Date(randomTime);
    }


    /*
    * */
    Employee() {

        name = generateString(characters, new Random().nextInt(20) + 1);
        soname = generateString(characters, new Random().nextInt(20) + 2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String s="03.10.1998";
        Date beginDate=simpleDateFormat.parse(s, new ParsePosition(0));
        this.dayStartWork = generateDate(beginDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public Date getDayBirthday() {
        return dayBirthday;
    }

    public void setDayBirthday(Date dayBirthday) {
        this.dayBirthday = dayBirthday;
    }

    public Date getDayStartWork() {
        return dayStartWork;
    }

    @Override
    public String toString() {
        return "personal data of employee{" +
                "name='" + name + '\'' +
                ", soname='" + soname + '\'' +
                ", dayBirthday=" + dayBirthday +
                ", dayStartWork=" + dayStartWork  +
                '}';
    }
}
