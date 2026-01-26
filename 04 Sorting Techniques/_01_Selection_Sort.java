package _04_Sorting_Techniques;

public class _01_Selection_Sort {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            int min_i=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_i]){
                    min_i=j;
                }
            }
            if(min_i==i){
                int temp=arr[i];
                arr[i]=arr[min_i];
                arr[min_i]=temp;
            }
        }
    }
}
