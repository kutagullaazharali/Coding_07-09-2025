import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class DfsOriginal {
    public static void dfsMethod1(int node, Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            int element = stack.pop();
            if (!visited.contains(element)) {
                visited.add(element);
                System.out.println("node : " + element);
                List<Integer> neighbours = graph.get(element);
                Collections.reverse(neighbours);
                for (int neighbour : neighbours) {
                    if (!visited.contains(neighbour)) {
                        stack.push(neighbour);
                    }
                }
                Collections.reverse(neighbours);
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
        dfsMethod1(1, graph);
    }
}