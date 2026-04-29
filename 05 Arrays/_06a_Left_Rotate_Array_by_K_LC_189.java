package _05_Arrays;

public class _06a_Left_Rotate_Array_by_K_LC_189 {
    public void reverse(int []arr,int start,int end){
        int i=start;
        int j=end;
        int temp=0;
        for(;i<j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public void rotate(int []arr ,int k ){
        int n=arr.length;
        k=k%n;
        if(k==0 || n==0){
            return;
        }
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
}
