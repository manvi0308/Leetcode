package Sheet.GridUniquePaths;

public class Optimal {
    //^ Combinatorics
    int gridUniquePaths(int n, int m){
        int N = n + m - 2;
        int r = m - 1;

        double res = 1;
        for(int i = 1; i <= r; i++){
            res *= (N - r + 1)/i;
        }


        return (int)res;
    }
}
