package _05_Arrays;

public class _38_Reverse_Pairs_LC_493 {
    class Solution {
        public int reversePairs(int[] nums) {
            return mergeSort(nums,0,nums.length-1);
        }
        public int mergeSort(int[] nums,int low,int high){
            if(low>=high){
                return 0;
            }
            int mid=low+(high-low)/2;
            int count=0;
            count+=mergeSort(nums,low,mid);
            count+=mergeSort(nums,mid+1,high);
            count+=countpairs(nums,low,mid,high);
            merge(nums,low,mid,high);
            return count;
        }
        public void merge(int [] nums,int low,int mid,int high){
            int left=low;
            int right=mid+1;
            int k=0;
            int[] temp = new int[high - low + 1];
            while(left<=mid && right <= high){
                if(nums[left]<=nums[right]){
                    temp[k]=nums[left];
                    left++;
                }else{
                    temp[k]=nums[right];
                    right++;
                }
                k++;
            }
            while(left<=mid){
                temp[k]=nums[left];
                k++;
                left++;
            }
            while(right<=high){
                temp[k]=nums[right];
                k++;
                right++;
            }
            for(int i=low;i<=high;i++){
                nums[i]=temp[i-low];
            }
        }
        public int countpairs(int nums[],int low,int mid,int high){
            int right=mid+1;
            int count=0;
            for(int left=low;left<=mid;left++){

                while(right<=high &&(long) nums[left]>2L*nums[right]){
                    right++;
                }
                count+=right-(mid+1);
            }
            return count;
        }
    }
}
