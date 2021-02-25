package Syncronisation;

public class Synchronization {
    public static void main(String[] args){
        Multiplication multi = new Multiplication();

        FirstMultiplication thread1 = new FirstMultiplication(10L,multi);
        SecondMultiplication thread2 = new SecondMultiplication(10L,multi);

        thread1.start();
        thread2.start();

    }
}
