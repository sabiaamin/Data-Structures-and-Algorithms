package _09_Recursion;

import java.util.ArrayList;
import java.util.List;

public class _10_Subsets_LC_78 {
    public void generate(int []nums, int i, List<Integer> subset, List<List<Integer>> s){
        if(nums.length==i){
            s.add(new ArrayList<>(subset));
            return ;
        }
        //add
        subset.add(nums[i]);
        generate(nums,i+1,subset,s);
        //backtrack
        subset.remove(subset.size()-1);
        //skip
        generate(nums,i+1,subset,s);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> s=new ArrayList<>();
        generate(nums,0,subset,s);
        return s;
    }
}
