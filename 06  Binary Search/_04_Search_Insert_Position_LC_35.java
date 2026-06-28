package _06_Binary_Search;

public class _04_Search_Insert_Position_LC_35 {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int idx=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                idx= mid;
                break;
            }if(nums[mid]<target){
                low=mid+1;
            }if(nums[mid]>target){
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }
}
