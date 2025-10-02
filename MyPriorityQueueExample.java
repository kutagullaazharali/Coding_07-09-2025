import java.util.PriorityQueue;

public class MyPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>();
        maxPQ.offer(10);
        maxPQ.add(5);
       maxPQ.offer(100);
        System.out.println(maxPQ);
        System.out.println("get first element and without remove : "+maxPQ.peek());
       System.out.println("get first element and remove : "+maxPQ.poll());
        System.out.println(maxPQ);
        System.out.println("remove method : "+maxPQ.remove());
        System.out.println(maxPQ);
    }
}
