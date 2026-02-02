
import java.util.PriorityQueue;
import java.util.*;

public class PriorityQueueTaskNew {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.add(50);
        pq.peek();
        System.out.println(pq);
        System.out.println(pq.remove(50));
        System.out.println(pq);
        System.out.println("==============================");
        PriorityQueue<Integer> pqnew = new PriorityQueue<>(Collections.reverseOrder());
        pqnew.offer(10);
        pqnew.offer(20);
        pqnew.offer(30);
        pqnew.add(50);
        pqnew.peek();
        System.out.println(pqnew);
        System.out.println(pqnew.remove(50));
        System.out.println(pqnew);
    }
}
