package _05_Arrays;

public class _19_Best_Time_To_Buy_And_Sell_Stock_LC_121 {
    public int maxProfit(int[] arr) {
        int mp=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mp){
                mp=arr[i];
            }
            else if(arr[i]-mp>profit){
                profit=arr[i]-mp;
            }
        }
        return profit;
    }
    public int maxProfit1(int[] arr) {
        int min=arr[0];
        int min_idx=0;
        int max_idx;
        int max=arr[0];
        int i=0,j=0;
        int prev_min=0;
        int prev_max=0;
        while(j<arr.length){
            if(arr[j]<min){
                if(prev_max-prev_min<max-min){
                    prev_min=min;
                    prev_max=max;
                }
                min=arr[j];
                max=arr[j];
                i=j;
            }
            if(arr[j]>max){
                max=arr[j];
            }
            j++;
        }
        int r=0;
        if(prev_max-prev_min>max-min){
            r=prev_max-prev_min;
        }else{
            r=max-min;
        }
        return r;
    }
}
