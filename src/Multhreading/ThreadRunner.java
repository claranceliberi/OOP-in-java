package Multhreading;

public class ThreadRunner {

    public static void main(String[] args){
//        ExtendThread thread = new ExtendThread(40,"A");
//        thread.start();
//        thread = new ExtendThread(40,"B");
//        thread.start();

        ImplementRunnable thread2 = new ImplementRunnable();
        thread2.start();


    }
}
