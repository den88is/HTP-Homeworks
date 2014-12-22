import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        printSet(set2TreeSet(array2Set(fillingTheArray(random))));
    }
    public static Integer[] fillingTheArray(Random random) {
        Integer[] numbersArray = new Integer[new Random().nextInt(150) + 50];
        for (int g = 0; g < numbersArray.length; g++) {
            numbersArray[g] = random.nextInt(1000);
        }
        return numbersArray;
    }

    public static Set<Integer> array2Set(Integer[] array) {
        Set<Integer> numbersSet = new HashSet<Integer>();
        Collections.addAll(numbersSet, array);
        return numbersSet;
    }

    public static TreeSet<Integer> set2TreeSet(Set<Integer> numberSet) {
        TreeSet<Integer> mySet = new TreeSet<Integer>();
        mySet.addAll(numberSet);
        return mySet;
    }

    public static void printSet(TreeSet<Integer> name) {
        System.out.println(name);
    }
}
