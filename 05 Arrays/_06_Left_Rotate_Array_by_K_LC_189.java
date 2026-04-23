package _05_Arrays;

public class _06_Left_Rotate_Array_by_K_LC_189 {
    public void rotate(int[] arr, int k) {
        int n= arr.length;
        k=k%n;
        int []arr_new = new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++){
            arr_new[(k+i)%n]=arr[i];
        }
        for(i=0;i<n;i++){
            arr[i]=arr_new[i];
        }
    }
    public void main(String [] args){
        int []arr={-1,-100,3,99};
        rotate(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
