package _06_Binary_Search;

public class _08_Search_In_Rotated_Sorted_Array_I_LC_33 {
    public int search(int[] nums, int target) {
        int low=0;
        int idx=-1;;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                idx= mid;
                break;
            }
            else if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<=nums[high] ){
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return idx;
    }
    public int binarySearch(int[] nums, int l,int h,int target) {
        int high=h;
        int low=l;
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
    public int search1(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int pivot=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (mid < nums.length-1 && nums[mid] > nums[mid+1]) {
                pivot =mid+1;
                break;
            }
            if (nums[mid]>= nums[0]) {
                low=mid + 1;
            } else {
                high=mid - 1;
            }
        }
        if(pivot==nums.length){
            pivot=0;
        }
        int idx=binarySearch(nums,0,pivot-1,target);
        if(idx!=-1){
            return idx;
        }
        return binarySearch(nums,pivot,nums.length-1,target);
    }
}
