package _05_Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _28_Majority_Element_II_LC_229 {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int cand2=0;
        int c1=0;
        int c2=0;
        int n=nums.length;
        for(int num : nums){
            if(cand1==num){
                c1++;
            }
            else if(cand2==num){
                c2++;
            }
            else if(c1==0){
                cand1=num;
                c1=1;
            }
            else if(c2==0){
                cand2=num;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num : nums){
            if(num==cand1){
                c1++;
            }else if(num==cand2){
                c2++;
            }
        }
        List<Integer> ls= new ArrayList<>();
        if(c1>n/3){
            ls.add(cand1);
        }
        if(c2>n/3){
            ls.add(cand2);
        }
        return ls;
    }
    public List<Integer> majorityElement2(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer> ls= new ArrayList<>();
        int n=nums.length;
        int i=0;
        int c=0;
        for(i=0;i<n;i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e : hash.entrySet()){
            c=e.getValue();
            if(c>n/3){
                ls.add(e.getKey());
            }
        }
        return ls;
    }
}
