import java.util.*;

public abstract class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[new Random().nextInt(150) + 50];

        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = random.nextInt(1000);
        }

        Set<Integer> collectionOfValues = new HashSet<Integer>();

        for (int c = 0; c < numbers.length; c++) {
            collectionOfValues.add(numbers[c]);
        }
        Set<Integer> mySet = new TreeSet<Integer>();
        mySet.addAll(collectionOfValues);

        for (int item : mySet) {
            System.out.println(item);
        }
    }
}
