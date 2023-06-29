import java.util.ArrayList;

public class WeGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 5));
        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 3));
        

    }
    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);

        for (int i = 0; i < graph[0].size(); i++) {
            Edge e = graph[0].get(i);
            System.out.println(e.dest);
        }
    }
}
