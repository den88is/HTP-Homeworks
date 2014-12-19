package net.k6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int number = new Random().nextInt(50) + 1;
        try {
            checkNumber(number);
        } catch (NumberException e) {
            e.printStackTrace();
        }
    }

    static void checkNumber(int number) throws NumberException {
        if (number % 2 == 0 && number > 25) {
            throw new NumberException("Number is not valid:", number);
        } else if (number % 2 != 0 && number != 0) throw new RuntimeException();
        System.out.println(number);


    }
}
