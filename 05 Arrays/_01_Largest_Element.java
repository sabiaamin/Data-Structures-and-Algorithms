package _05_Arrays;

public class _01_Largest_Element {
    public static int largest(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
