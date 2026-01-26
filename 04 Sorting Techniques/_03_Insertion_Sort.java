package _04_Sorting_Techniques;

public class _03_Insertion_Sort {
    public void insertionSort(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>cur;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=cur;
        }
    }
}
