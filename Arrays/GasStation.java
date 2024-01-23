public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total_surplus = 0;

        int surplus = 0;
        int start = 0;

        for (int index = 0; index < n; index++) {
            total_surplus += gas[index] - cost[index];
            surplus += gas[index] - cost[index];
            if(surplus < 0){
                // change the starting index
                start = index + 1;
                surplus = 0;
            }
            
        }

        return (total_surplus < 0) ?  -1 : start;
    }
}
