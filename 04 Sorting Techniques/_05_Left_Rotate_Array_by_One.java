package _05_Arrays;

public class _05_Left_Rotate_Array_by_One {
    public void rotate(int []arr){
        int cur=arr[0];
        int i=0;
        int n=arr.length;
        for(;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=cur;
    }
    public void main(String [] args){
        int []arr={7,1,2,3,4};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
