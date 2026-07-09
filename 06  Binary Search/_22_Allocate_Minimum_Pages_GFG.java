package _06_Binary_Search;

public class _22_Allocate_Minimum_Pages_GFG {
    public int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) {
            return -1;
        }
        int i=0;
        long ans=-1;
        long sum=0;
        long low=0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
            if(low<arr[i]){
                low=arr[i];
            }
        }
        long high=sum;
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
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                sum=arr[i];
                students++;
            }else{
                sum+=arr[i];
            }
        }
        return students;
    }
}
