package _05_Arrays;

import java.util.HashMap;

public class _17_Maximum_Subarray_LC_53 {
    public int maxSubArray(int[] arr) {
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(max<cur){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        return max;
    }
    public int maxSubArray1(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int sum=0;
        int i,j;
        int cur;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int min_idx=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
            map.put(i,sum);
            if(sum>max){
                max=sum;
            }
            if(min_idx>=0){
                cur=map.get(min_idx);
                if(sum-cur>max){
                    max=sum-cur;
                }
            }
            if(sum<min){
                min=sum;
                min_idx=i;
            }
        }
        return max;
    }
}
