import java.util.*;

public class TestPriorityQueue {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        pq.offer(60);
        System.out.println(pq);
    }
}
