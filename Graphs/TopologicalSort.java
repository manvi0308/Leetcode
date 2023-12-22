package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static void dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[node] = 1;
        for (Integer it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, vis, adj, st);
            }
        }
        st.push(node);
    }

    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int V) {
        // ToDo Steps
        // Mark it as visited/
        //
        // ! Initial configuration
        int[] visited = new int[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, adj, stack);
            }

        }

        int topo[] = new int[N];
        int ind = 0;
        while (!stack.isEmpty()) {
            topo[ind++] = stack.pop();
        }
        // for(int i = 0;i<N;i++) System.out.println(topo[i] + " ");
        return topo;

    }

}
