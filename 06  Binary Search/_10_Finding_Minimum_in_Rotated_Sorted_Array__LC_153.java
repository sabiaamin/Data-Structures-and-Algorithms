package _06_Binary_Search;

public class _10_Finding_Minimum_in_Rotated_Sorted_Array__LC_153 {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else {
                high=mid;
            }
        }
        return nums[low];
    }
    public int findMin1(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int min=nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=nums[low]){
                low=mid+1;
                if(nums[mid]<min){
                    min=nums[mid];
                }
            }else if(nums[mid]>nums[low]){
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=nums[high]){
                high=mid-1;
                if(nums[mid]<min){
                    min=nums[mid];
                }
            }else if(nums[mid]>nums[high]){
                low=mid+1;
            }
        }
        return min;
    }
}
