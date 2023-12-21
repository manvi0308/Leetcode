package Graphs;

import java.util.*;

public class DFS {
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];
        visited[0] = true;
        dfsRecur(0, res, adj, visited);
        return res;
    }

    static void dfsRecur(int node, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        res.add(node);

        // iterating over neighbours
        for (Integer it : adj.get(node)) {
            if (visited[it] == false) {
                dfsRecur(it, res, adj, visited);
            }
        }
    }

}
