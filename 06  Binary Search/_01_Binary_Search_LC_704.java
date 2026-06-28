package _06_Binary_Search;

public class _01_Binary_Search_LC_704 {
    public int search(int[] nums, int target) {
        int high=nums.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }
        }
        return -1;
    }
}
