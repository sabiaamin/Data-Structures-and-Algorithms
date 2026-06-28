package _06_Binary_Search;

public class _06_Find_First_And_Last_Position_Of_Element_In_An_Array_LC_34 {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int[] r=new int[2];
        r[0]=-1;
        r[1]=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                r[0]=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                r[1]=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }
        }
        return r;
    }
}
