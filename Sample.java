import java.util.PriorityQueue;

class Sample {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(0);
        System.out.println("PriorityQueue: " + numbers);
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);
        int number = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number);

    }
}