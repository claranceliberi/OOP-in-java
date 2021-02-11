package Multhreading;

public class ThreadRunner {

    public static void main(String[] args){
        ExtendThread thread = new ExtendThread(10,"A");
        thread.start();
    }
}
