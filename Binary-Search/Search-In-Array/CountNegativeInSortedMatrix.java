public class CountNegativeInSortedMatrix {
    public int countNegatives(int[][] grid) {
        /*
         * Thought process is since rows and cols are sorted in non-increasing order, so
         * if i start from
         * left most and bottom most position, say i and j
         * If grid[i][j] is < 0
         * that entire row will be surely negative, since first number of every row is
         * greatest .
         * 
         * If grid[i][j] > 0
         * we need to check in that row, jth col is surely entirely positive.
         * 
         */
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int i = rows - 1; // bottom most
        int j = 0; // left most

        while (i >= 0 && j < cols) {
            if (grid[i][j] < 0) {
                // entire ith row is negative, starting from jth column
                count += cols - j;
                --i;
            } else {
                // entire jth col is surely positive, we need to check for ahead columns
                ++j;
            }
        }

        return count;
    }
}