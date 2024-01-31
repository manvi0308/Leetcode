package Sheet.SubsetTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal {
    // only difference is in storage of elements, we will sort the array and optimize the insertion of elements using HashSet.

    // ds is temporary data structure.
    static void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] != nums[i - 1]){
                continue;
            }

            ds.add(nums[i]);
            findSubsets(index + 1, nums, ds, ansList);
            ds.remove(ds.size() - 1); // Back tracking.
        }
    }
    static List<List<Integer>> subsetWithDups(int[] nums){
        // Initial confgn
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<Integer>();
        
        findSubsets(0, nums, new ArrayList<>(), ansList);

    }
}
