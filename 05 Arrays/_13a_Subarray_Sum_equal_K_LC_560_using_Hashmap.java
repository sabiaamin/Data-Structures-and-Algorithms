package _05_Arrays;

import java.util.HashMap;

public class _13a_Subarray_Sum_equal_K_LC_560_using_Hashmap {
    public int subarraySum(int[] arr, int k) {
        int count=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        int sum=0;
        int i=0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
            count += h.getOrDefault(sum-k,0);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
