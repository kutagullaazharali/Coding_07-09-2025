import java.util.ArrayList;
import java.util.List;

public class Dfsimplement {
    public static void dfs(int n, boolean visit[], List<List<Integer>> graph) {
        visit[n] = true;
        System.out.println("Node : " + n);
        for (int o : graph.get(n)) {
            if (!visit[o]) {
                dfs(o, visit, graph);
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
        boolean visited[] = new boolean[n + 1];
        System.out.println("-----------Start----------");
        dfs(1, visited, graph);
    }
}
