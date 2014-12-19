package net.k6;


public class NumberException extends Exception {


    private int number;


    public NumberException(String message, int number) {

        super(message);
        this.number = number;
    }

    public void printStackTrace() {
        System.out.print(getMessage() + " " + number);
    }
}
