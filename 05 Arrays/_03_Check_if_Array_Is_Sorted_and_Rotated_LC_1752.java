package _05_Arrays;

public class _03_Check_if_Array_Is_Sorted_and_Rotated_LC_1752 {
    public boolean check(int[] arr) {
        boolean swap = false;
        int issue =0;
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] <= arr[i+1]){
               if(issue==0){
                   swap=false;
               }else{
                   if(arr[i+1]<arr[0]){
                       swap=false;
                   }else{
                       swap=true;
                   }
               }
            }else {    //if (!(arr[i] <= arr[i + 1]))
                if (issue == 0) {
                    swap = true;
                    issue = 1;
                    if (arr[i + 1] <= arr[0]) {
                        swap = false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(swap==false){
            return true;
        }
        return false;
    }
    public void main(String []args){
        int arr[]={2,1,3,4};
        System.out.println(check(arr));
    }
}
