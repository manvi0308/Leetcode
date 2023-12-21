package Graphs;

import java.util.*;

public class BFS {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<Integer> res = new ArrayList<>();

        // * Initial configuration
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int data = queue.poll();
            res.add(data);

            for (Integer it : adj.get(data)) {
                if (visited[it] = false) {
                    visited[it] = true;
                    queue.add(it);
                }
            }
        }
        return res;
    }
}
