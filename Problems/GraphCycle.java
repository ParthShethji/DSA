import java.util.ArrayList;

public class GraphCycle {

    // we need to ignore parent vertex while checking for connections
    // Revisiting a non-parent node means cycle is there

    public static boolean dfs(int s, int p, boolean[] vis, ArrayList<ArrayList<Integer>> graph) {
        vis[s] = true;
        for (int i : graph.get(s)) {
            if (vis[i] == false) {
                if (dfs(i, p, vis, graph)) {
                    return true;
                }
            } else if (vis[i] && i != p) {
                return true;
            }

        }
        return false;
    }

    public static boolean cycleUndirected(int V, ArrayList<ArrayList<Integer>> graph) {
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) { // for undirected graph we need to check for everyone
            if (vis[i] == false) {
                if (dfs(i, -1, vis, graph)) { // for start parent will be -1
                    return true;
                }
            }
        }

        return false;
    }

    // public static void cycleDirected(int V, ArrayList<ArrayList<Integer>> graph) {

    // }

    public static void main(String[] args) {
        // Directed Graph Example
        int V_directed = 4; // Number of vertices
        ArrayList<ArrayList<Integer>> graph_directed = new ArrayList<>();

        // Initialize adjacency list representation of the directed graph
        for (int i = 0; i < V_directed; i++) {
            graph_directed.add(new ArrayList<>());
        }

        // Add directed edges to the graph (example)
        graph_directed.get(0).add(1);
        graph_directed.get(1).add(2);
        graph_directed.get(2).add(3);
        graph_directed.get(3).add(0);

        // Check for cycle in the directed graph
        // if (GraphCycle.cycleDirected(V_directed, graph_directed)) {
        //     System.out.println("Directed graph contains cycle.");
        // } else {
        //     System.out.println("Directed graph does not contain cycle.");
        // }

        // Undirected Graph Example
        int V_undirected = 4; // Number of vertices
        ArrayList<ArrayList<Integer>> graph_undirected = new ArrayList<>();

        // Initialize adjacency list representation of the undirected graph
        for (int i = 0; i < V_undirected; i++) {
            graph_undirected.add(new ArrayList<>());
        }

        // Add undirected edges to the graph (example)
        graph_undirected.get(0).add(1);
        graph_undirected.get(1).add(0);
        graph_undirected.get(1).add(2);
        graph_undirected.get(2).add(1);
        graph_undirected.get(2).add(3);
        graph_undirected.get(3).add(2);

        // Check for cycle in the undirected graph
        if (GraphCycle.cycleUndirected(V_undirected, graph_undirected)) {
            System.out.println("Undirected graph contains cycle.");
        } else {
            System.out.println("Undirected graph does not contain cycle.");
        }
    }
}
