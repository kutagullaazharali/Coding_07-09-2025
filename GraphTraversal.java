import java.util.*;

public class GraphTraversal {

    // Build graph with V vertices
    static List<List<Integer>> buildGraph(int V, int[][] edges, boolean directed) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < V; i++)
            g.add(new ArrayList<>());
        for (int[] e : edges) {
            int u = e[0], v = e[1];
            g.get(u).add(v);
            if (!directed)
                g.get(v).add(u);
        }
        return g;
    }

    // BFS from source
    static List<Integer> bfs(List<List<Integer>> g, int src) {
        int V = g.size();
        boolean[] vis = new boolean[V];
        List<Integer> order = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(src);
        vis[src] = true;

        while (!q.isEmpty()) {
            int u = q.poll();
            order.add(u);
            for (int v : g.get(u)) {
                if (!vis[v]) {
                    vis[v] = true;
                    q.offer(v);
                }
            }
        }
        return order;
    }

    // DFS recursive
    static void dfsRecUtil(int u, List<List<Integer>> g, boolean[] vis, List<Integer> order) {
        vis[u] = true;
        order.add(u);
        for (int v : g.get(u)) {
            if (!vis[v])
                dfsRecUtil(v, g, vis, order);
        }
    }

    static List<Integer> dfsRecursive(List<List<Integer>> g, int src) {
        List<Integer> order = new ArrayList<>();
        boolean[] vis = new boolean[g.size()];
        dfsRecUtil(src, g, vis, order);
        return order;
    }

    // DFS iterative (stack)
    static List<Integer> dfsIterative(List<List<Integer>> g, int src) {
        int V = g.size();
        boolean[] vis = new boolean[V];
        List<Integer> order = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(src);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (vis[u])
                continue;
            vis[u] = true;
            order.add(u);
            // push neighbors in reverse order if you want same order as recursive
            List<Integer> neighbors = g.get(u);
            for (int i = neighbors.size() - 1; i >= 0; i--) {
                int v = neighbors.get(i);
                if (!vis[v])
                    stack.push(v);
            }
        }
        return order;
    }

    // Demo
    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {
                { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }
        };
        boolean directed = false; // set true for directed graph
        List<List<Integer>> g = buildGraph(V, edges, directed);

        System.out.println("BFS from 0: " + bfs(g, 0));
        System.out.println("DFS Recursive from 0: " + dfsRecursive(g, 0));
        System.out.println("DFS Iterative from 0: " + dfsIterative(g, 0));
    }
}
