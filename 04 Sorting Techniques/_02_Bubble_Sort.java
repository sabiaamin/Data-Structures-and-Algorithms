package _04_Sorting_Techniques;

public class _02_Bubble_Sort {
    public void swap(int arr[],int n,int m){
        int temp=arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
    public void bubbleSort(int[] arr) {
        // code here
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
