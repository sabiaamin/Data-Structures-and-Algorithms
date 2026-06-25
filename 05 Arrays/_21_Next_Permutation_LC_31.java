package _05_Arrays;

public class _21_Next_Permutation_LC_31 {
    public void swap(int []arr,int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void nextPermutation(int[] arr) {
        int i;
        for(i=arr.length-2;i >= 0;i--){
            if(arr[i]<arr[i+1]){
                break;
            }
        }
        if(i>=0){
            int min=Integer.MAX_VALUE;
            int min_idx=0;
            for(int j=arr.length-1;j>i;j--){
                if(min >arr[j] && arr[j]>arr[i]){
                    min=arr[j];
                    min_idx=j;
                }
            }
            swap(arr,min_idx,i);
        }
        int start = i + 1;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
