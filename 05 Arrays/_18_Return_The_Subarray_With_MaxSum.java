package _05_Arrays;

public class _18_Return_The_Subarray_With_MaxSum {
    public void subArrayMaxSum(int arr[]){
        int cur=0;
        int max=arr[0];
        int start_new=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(max<cur){
                max=cur;
                end=i;
                start=start_new;

            }
            if(cur<0){
                cur=0;
                start_new=i+1;
            }
        }
        for(int i=start;i<=end;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("sum = "+max);
    }
    public void main(String []args){
        int arr[] = {-2, -5, 6, -2, -3, 1, 5, -6};
        subArrayMaxSum(arr);
    }
}
