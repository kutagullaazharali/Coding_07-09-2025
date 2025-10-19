import java.util.*;
public class Queue {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.addLast(600);
        d.offer(100);
        d.offerFirst(200);
        d.offerLast(300);
        d.addFirst(500);
        
        System.out.println("Final Array : " + d);
        System.out.println("first element : " + d.peekLast());
        System.out.println("last element : " + d.peekFirst());
        System.out.println("remove element : " + d.pollFirst());
        System.out.println("remove element : "+ d.pollLast());
    }
}