package _06_Binary_Search;

public class _03_Implement_Upper_Bound_GFG {
    int upperBound(int[] arr, int target) {
        // code here
        int ans=arr.length;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=target){
                low=mid+1;
            }if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }//else if(arr[mid]==target){
            //    low=mid+1;
            //}
        }
        return ans;
    }
}
