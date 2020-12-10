import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class ArrayBlockingQue{
    public static void main(String[] args){
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<Integer>(10);
    
        try{

            numbers.put(2);
            numbers.put(4);
            numbers.put(6);
            numbers.put(7);
            numbers.put(12);
            numbers.put(30);
            System.out.println("Que: " + numbers);
            int removedNumber = numbers.take();
            System.out.println("Removed Number " + removedNumber);
            System.out.println("contains 2 : " + numbers.contains(4));

            Iterator<Integer> iterate = numbers.iterator();

            System.out.println("Array blocking elements are : ");

            while(iterate.hasNext()){
                System.out.println(iterate.next() + ",");
            }
        } 
        catch(Exception e){
            e.getStackTrace();
        }

    }
}