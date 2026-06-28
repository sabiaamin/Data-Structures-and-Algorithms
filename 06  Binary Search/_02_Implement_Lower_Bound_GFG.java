package _06_Binary_Search;

public class _02_Implement_Lower_Bound_GFG {
    int lowerBound(int[] arr, int target) {
        // code here
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
