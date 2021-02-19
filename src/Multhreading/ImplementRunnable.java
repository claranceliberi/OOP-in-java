package Multhreading;


public class ImplementRunnable implements Runnable{

    private Thread th;


    public Thread getTh() {
        return th;
    }

    public void setTh(Thread th) {
        this.th = th;
    }

    public void run(){
        System.out.println("running in Implement Runnable");
    }

    public void start(){
        th = new Thread(this,"Test");
        th.start();
    }
}
