package Graphs;

import java.util.ArrayList;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        // convert adj matrix to adj list
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        int V = isConnected.length;

        for (int i = 0; i < V; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        // dfs logic
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                dfs(i, visited, adjLs);
                count++;
            }
        }

        return count;
    }

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adjLs) {
        visited[node] = true;
        for (Integer it : adjLs.get(node)) {
            dfs(it, visited, adjLs);
        }
    }
}
