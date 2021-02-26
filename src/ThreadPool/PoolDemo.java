package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolDemo {
    public static void main(String[] args) throws Exception{
        Job job1 = new Job("Thread 1");
        Job job2 = new Job("Thread 2");
        Job job3 = new Job("Thread 3");
        Job job4 = new Job("Thread 4");
        Job job5 = new Job("Thread 5");
        Job job6 = new Job("Thread 6");
        Job job7 = new Job("Thread 7");
        Job job8 = new Job("Thread 8");
        Job job9 = new Job("Thread 9");
        Job job10 = new Job("Thread 10");

        ExecutorService pool = Executors.newFixedThreadPool(3);
                        pool.execute(job1);
                        pool.execute(job2);
                        pool.execute(job3);
                        pool.execute(job4);
                        pool.execute(job5);
                        pool.execute(job6);
                        pool.execute(job7);
                        pool.execute(job9);
                        pool.execute(job10);

                        pool.shutdown();
    }
}
