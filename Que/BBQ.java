import java.util.Queue;
import java.util.LinkedList;

public class BBQ{
    public static void main(String[] args){
        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("jackson");
        bbqLine.add("Chanelle");
        bbqLine.add("Susan");
        bbqLine.offer("Susanjhggjh");

//        System.out.println(bbqLine.poll());
//
        System.out.println(bbqLine.peek());
//        System.out.println(bbqLine.peek());
        System.out.println(bbqLine);
    }
}