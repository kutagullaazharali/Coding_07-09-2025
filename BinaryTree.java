
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    public static void binaryTree(int start,Map<Integer,List<Integer>> graph){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<Integer>();
        queue.add(start);
        visited.add(start);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println("node : " + node);
            if()
            for (int neighbour : graph.get(node)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args) {
    Map<Integer, List<Integer>> treeMap = new HashMap<>();
    treeMap.put(0, Arrays.asList(3));
    treeMap.put(1, Arrays.asList(9, 20));
    treeMap.put(2, Arrays.asList(15, 7));
    binaryTree(1, treeMap);
    }
}
