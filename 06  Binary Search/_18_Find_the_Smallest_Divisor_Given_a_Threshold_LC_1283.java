package _06_Binary_Search;

public class _18_Find_the_Smallest_Divisor_Given_a_Threshold_LC_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int i=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];

            }
        }
        int low=1;
        int high=max;
        int div=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(i=0;i<nums.length;i++){
                sum += (nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                div=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return div;
    }
}
