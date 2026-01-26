package _03_Basic_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//  You are given an array nums consisting of positive integers.
//  Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
//  The frequency of an element is the number of occurrences of that element in the array.

public class _03_Count_Elements_With_Maximum_Frequency {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        int max=0;
        for(int num : nums){
            int f=mp.getOrDefault(num,0)+1;
            mp.put(num,f);
            if(f>max){
                max=f;
            }
        }
        int sum=0;
        for(int f:mp.values()){
            if(f==max){
                sum+=f;
            }
        }
        return sum;

    }
}
