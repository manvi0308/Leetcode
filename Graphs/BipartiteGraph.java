package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteGraph {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                return dfs(i, 0, color, adj);
            }
        }

        return true;
    }

    static boolean dfs(int node, int colour, int[] color, ArrayList<ArrayList<Integer>> adj) {
        color[node] = colour;

        for (Integer it : adj.get(node)) {
            // visit only the unvisited neighbours
            if (color[it] == -1) {
                if (dfs(it, 1 - colour, color, adj) == false)
                    return false;
            }

            else if (color[it] == colour) {
                // if previously visited and have the same color as neighbour
                return false;
            }
        }
        return true;
    }
}
