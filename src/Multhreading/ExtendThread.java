package Multhreading;

public class ExtendThread extends Thread {
    private long number;
    private String threadName;


    public ExtendThread(long number, String threadName) {
        this.number = number;
        this.threadName = threadName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public void run(){
        for(int i=0; i< getNumber(); i++){
            System.out.println("inside thread "+ getName() + getNumber() + i);
        }
    }
}
