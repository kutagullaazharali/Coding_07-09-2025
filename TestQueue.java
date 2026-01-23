import java.util.*;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.List;

class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> persons = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            persons.add(i);
        }
        System.err.println(persons);
    }
}