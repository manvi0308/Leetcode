import java.util.*;
class RCPair{
    int r;
    int c;
    RCPair(int r, int c){
        this.r = r;
        this.c = c;
    }
}
public class FourSum{
    static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, RCPair> map = new HashMap<Integer, RCPair>();
        int[] tem = new int[n];
        Arrays.fill(tem, 0);
        //& Putting values in HashMap
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                map.put(arr[i] + arr[j], new RCPair(i, j));
            }
        }

        //& Iterating throught array, finding sum for pairs
        //& and check if target - sum is present in Map or not

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int sum = arr[i] + arr[j];

                if(map.containsKey(target - sum)){
                    //! check for unique indexes
                    RCPair temp = map.get(target - sum);
                    if(i != temp.r && i != temp.c &&
                    j != temp.r && j != temp.c && tem[temp.r] == 0 && tem[temp.c] == 0 
                    && tem[i] == 0 && tem[j] == 0){
                        ArrayList<Integer>restemp = new ArrayList<>();
                        restemp.add(i);
                        restemp.add(j);
                        restemp.add(temp.r);
                        restemp.add(temp.c);
                        tem[i] = 1;
                        tem[j] = 1;
                        tem[temp.r] = 1;
                        tem[temp.c] = 1;
                        res.add(restemp);
                    }

                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 1, 2};
        int target = 91;
        ArrayList<ArrayList<Integer>> res = fourSum(nums, target);
        System.out.println(res);
    }
}
