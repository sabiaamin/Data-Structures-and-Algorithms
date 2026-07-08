package _06_Binary_Search;

import java.util.Arrays;

public class _21_Aggressive_Cows_GFG {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1]-arr[0];
        int i=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int cows=1;
            int l=arr[0];
            for(i=1;i<arr.length;i++){
                if(arr[i]-l>=mid){
                    l=arr[i];
                    cows++;
                }
            }
            if(cows>=k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}
