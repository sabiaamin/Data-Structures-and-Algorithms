package _05_Arrays;

import java.util.HashMap;

public class _31_Largest_Subarray_With_Sum_Zero_GFG {
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i=0;
        int sum=0;
        int idx=0;
        int max=0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                max=i+1;
            }
            if(hash.containsKey(sum)){
                idx=hash.get(sum);
                if(max<i-idx){
                    max=i-idx;
                }
            }else{
                hash.put(sum,i);
            }

        }
        return max;
    }
}
