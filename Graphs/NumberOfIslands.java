package Graphs;

import java.util.*;

class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class NumberOfIslands {
    static void bfs(int[][] visited, int row, int col, int[][] grid) {
        visited[row][col] = 1;
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(row, col));

        while (!queue.isEmpty()) {
            int r = queue.peek().row;
            int c = queue.peek().col;

            queue.remove();
            for (int dR = -1; dR <= 1; dR++) {
                for (int dC = -1; dC <= 1; dC++) {
                    int nRow = r + dR;
                    int nCol = c + dC;

                    // check if valid
                    if (nRow >= 0 && nRow <= grid.length &&
                            nCol >= 0 && nCol <= grid[0].length
                            && grid[nRow][nCol] == 1 && visited[nRow][nCol] == -1) {
                        visited[nRow][nCol] = 1;
                        queue.add(new Pair(nRow, nCol));
                    }
                }
            }
        }
    }

    static int numIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        Arrays.fill(visited, -1);
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 1) {
                    bfs(visited, i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }
}
