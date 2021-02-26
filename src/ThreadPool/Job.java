package ThreadPool;

import java.time.LocalDateTime;

public class Job implements Runnable{
    private String name;

    public Job(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void run(){
        try{

            System.out.println("Entered thread: " + getName() + " now: " + LocalDateTime.now().toString());
            Thread.sleep(1000);

            for(int i=0; i < 5; i++){
                System.out.println(" Executing Task " + i + " from: " + getName() + " now: " + LocalDateTime.now().toString());
                Thread.sleep(200);
            }

            System.out.println("Completed thread: " + getName() + " now: " + LocalDateTime.now().toString());

        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
