    import java.util.*;
    import java.util.List;

    public class GraphRepresentation {
        private Map<Integer, Integer> addList;

        public GraphRepresentation() {
            addList = new HashMap<>();
        }

        public void addEdges(int u, int v) {
            addList.putIfAbsent(u, v);
        }

        public void printGraph() {
            for (Map.Entry<Integer, Integer>  entry : addList.entrySet()) {
                System.out.println("node key : " +  entry.getKey() +" node value "+entry.getValue());
            }
        }
        public static void main(String[] args) {
            GraphRepresentation graph = new GraphRepresentation();
            graph.addEdges(0, 1);
            graph.addEdges(1, 10);
            graph.addEdges(2, 20);
            graph.addEdges(3, 30);
            graph.addEdges(4, 40);
            graph.addEdges(5, 50);
            graph.printGraph();
        }
    }
