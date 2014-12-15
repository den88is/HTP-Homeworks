import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        TreeSet mySet = new TreeSet();
        Random rand = new Random();

        Integer num;
        while(mySet.size() < 50) {
            num = Integer.valueOf(rand.nextInt(500));
            mySet.add(num);
        }

        while(mySet.size() < 200) {
            num = Integer.valueOf(rand.nextInt(500));
            mySet.add(num);
        }

        Iterator num1 = mySet.iterator();

        while(num1.hasNext()) {
            Integer i = (Integer)num1.next();
            System.out.println(i);
        }

    }
}
