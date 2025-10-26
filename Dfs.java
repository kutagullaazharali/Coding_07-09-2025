
import java.util.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class Dfs {

    public static void dfsMethod(int start, Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        System.out.println("node : " + start);
        for (int neighbour : graph.get(start)) {
            if (!visited.contains(neighbour)) {
                dfsMethod(neighbour, graph);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, new ArrayList<>(Arrays.asList(2, 3)));
        graph.put(2, new ArrayList<>(Arrays.asList(4)));
        graph.put(3, new ArrayList<>(Arrays.asList(5, 6)));
        graph.put(4, new ArrayList<>(Arrays.asList()));
        graph.put(5, new ArrayList<>(Arrays.asList()));
        graph.put(6, new ArrayList<>(Arrays.asList()));
        dfsMethod(1, graph);
    }
}
