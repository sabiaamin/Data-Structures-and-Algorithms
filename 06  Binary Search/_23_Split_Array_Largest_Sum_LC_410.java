package _06_Binary_Search;

public class _23_Split_Array_Largest_Sum_LC_410 {
    public int splitArray(int[] arr, int k) {
        long ans=-1;
        long low=0;
        long high=0;
        for(int num: arr){
            high+=num;
            if(low<num){
                low=num;
            }
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            int s = checkStudents(arr,mid);
            if(s<=k){
                ans=mid;
                high=mid-1;
            }else if(s>k){
                low=mid+1;
            }
        }
        return (int)ans;
    }
    public int checkStudents(int[] arr,long mid){
        long sum=0;
        int students=1;
        for(int num : arr){
            if(sum+num>mid){
                sum=num;
                students++;
            }else{
                sum+=num;
            }
        }
        return students;
    }
}
