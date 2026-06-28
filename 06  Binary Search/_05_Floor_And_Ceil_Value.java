package _06_Binary_Search;

public class _05_Floor_And_Ceil_Value {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        int [] fac=new int[2];
        fac[0]=-1;
        fac[1]=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==x){
                fac[0]=nums[mid];
                fac[1]=nums[mid];
                break;
            }else if(nums[mid]>x){
                fac[1]=nums[mid];
                high=mid-1;
            }else if(nums[mid]<x){
                fac[0]=nums[mid];
                low=mid+1;
            }
        }
        return fac;
    }
}
