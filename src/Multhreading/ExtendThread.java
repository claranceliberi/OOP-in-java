package Multhreading;

public class ExtendThread extends Thread {
    private int number;
    private String threadName;
    private Thread th;


    public ExtendThread(int number, String threadName) {
        this.number = number;
        this.threadName = threadName;
    }


    public Thread getTh() {
        return th;
    }

    public void setTh(Thread th) {
        this.th = th;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void start(){
//        if(th == null){
            th = new Thread(this,"Test");
            th.start();
//        }
    }

    public void run(){
        for(int i=0; i< getNumber(); i++){
            System.out.println("inside thread "+ this.getThreadName() + " : " + getNumber() + " => " + i);
        }
    }
}
