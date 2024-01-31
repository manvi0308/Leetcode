package Sheet.SubsetTwo;

import java.util.*;

public class Brute {

    static void func(int[] nums, int index, List<Integer> ds, HashSet<String> res){
        if(index == nums.length){
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }

        ds.add(nums[index]);
        func(nums, index + 1, ds, res);
        

        // this is backtracking to remove elements and consider the not pick case
        ds.remove(ds.size() - 1);
        func(nums, index + 1, ds, res);
    }
    static List<String> subsetWithDups(int[] nums){
        List<String> ans = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        List<Integer> ds = new ArrayList<>();

        func(nums, 0, ds, res);
        for(String it : res){
            ans.add(it);
        }
        
        return ans;


    }
}
