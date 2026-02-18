import java.util.List;
import java.util.*;

public class DfsStack {

    public static void dfs(int node, List<List<Integer>> graph) {
        boolean visited[] = new boolean[graph.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            int n = stack.pop();
            visited[n] = true;
            System.out.println("Node : " + n);
            List<Integer> temp = graph.get(n);
            for (int i = temp.size() - 1; i >= 0; i--) {
                if (!visited[temp.get(i)]) {
                    stack.push(temp.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = 6;
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.println(graph);
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(3).add(6);
        System.out.println(graph);
        System.out.println("-----------Start----------");
        dfs(1, graph);
        System.out.println("-----------End----------");
    }
}