package _05_Arrays;

public class _02_Second_Largest_Element {
        public int getSecondLargest(int[] arr) {
            // code here
            int max1=-1;
            int max2=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max1){
                    max2=max1;
                    max1=arr[i];
                }
                else if(arr[i]>max2 && arr[i]!=max1){
                    max2=arr[i];
                }
            }
            if(max1==max2){
                return -1;
            }
            return max2;
        }
        public void main(String [] args){
            int arr[]={10,10,10};
            System.out.println(getSecondLargest(arr));

        }
}

