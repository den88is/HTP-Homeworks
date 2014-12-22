import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] numbersArray = new Integer[new Random().nextInt(150) + 50];

        for (int g = 0; g < numbersArray.length; g++) {
            numbersArray[g] = random.nextInt(1000);
        }

        Set<Integer> numbersSet = new HashSet<Integer>();

        Collections.addAll(numbersSet, numbersArray);

        TreeSet<Integer> mySet = new TreeSet<Integer>();
        mySet.addAll(numbersSet);

        System.out.println(mySet);
    }
  }
