package _05_Arrays;

import java.util.HashMap;

public class _32_Count_Subarray_with_XOR_Zero_GFG {
    public long subarrayXor(int arr[], int k) {
        // code here
        int i=0,f=0;
        long c=0;
        int sum=0;
        HashMap<Integer,Integer> hash= new HashMap<>();
        hash.put(0,1);
        for(i=0;i<arr.length;i++){
            sum^=arr[i];
            //if(sum==k){
            // c++;
            //}
            if(hash.containsKey(sum^k)){
                f=hash.get(sum^k);
                c=c+f;
                hash.put(sum,hash.getOrDefault(sum,0)+1);
            }else{
                f=hash.getOrDefault(sum,0)+1;
                hash.put(sum,f);
            }
        }
        return c;
    }
}
