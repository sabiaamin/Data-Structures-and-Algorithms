package _06_Binary_Search;

public class _09_Search_In_Rotated_Sorted_Array_II_LC_81 {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        boolean b=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                b=true;
                break;
            }
            if (nums[low]==nums[mid] && nums[mid]==nums[high]) {
                low++;
                high--;
            }
            else if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target <nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]<=nums[high]){
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return b;
    }
}

