package _05_Arrays;

public class _12_Single_Number_LC_36 {
    public int singleNumber(int[] arr) {
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor ^= arr[i];
        }
        return xor;
    }
}
