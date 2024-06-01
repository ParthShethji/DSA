import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    // just like trees but in trees there is hierarchy here there is none you can connect anything to anyone in here you can connect any node to anything

    // here there are verices and edges its a non linear data structure

    // tnere are 2 types of edges direction and undirectional\
    // 2 types of connections connected grapphs and disconected graphs\

    // Rrepresentation done by = adjacency matris and adjacency List
    // Adjacency matrix consumes more space and is inefficient

    public static void addEdge(ArrayList<ArrayList<Integer>> a, int u, int v){
        a.get(u).add(v);
        a.get(v).add(u);
    } 

    public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> graph){       // T = O(V+E), S = O(V)
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[graph.size()];
        dfsHelper(0, vis, ans,  graph);
        System.out.println(ans);
        return ans;
    }


    public static void dfsHelper(int start, boolean[] vis, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> graph) {
        vis[start] = true;
        ans.add(start);
        for (int i : graph.get(start)) {
            if (!vis[i]) {
                dfsHelper(i, vis, ans, graph);
            }
        }
    }


    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[adj.size()];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        
        while(!q.isEmpty()){
            int x = q.remove();
            if(vis[x]==false){
                vis[x] = true;
                ans.add(x);
                for(int i : adj.get(x)){
                    q.add(i);
                }
            }
        }
        System.out.println(ans);
        return ans;
    }






    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0, 4);
        addEdge(graph, 0, 3);
        addEdge(graph, 0, 1);
        addEdge(graph, 3,4);
        addEdge(graph, 4,2);

        bfs(graph);
        DFS(graph);
    }

}