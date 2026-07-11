package _06_Binary_Search;

public class _25_Minimize_Max_Distance_to_Gas_Station_LC_774 {
    public double minimiseMaxDistance(int[] arr, int k) {
        double low=0;
        double high=0;
        int i=0;
        for(i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]>high){
                high=arr[i]-arr[i-1];
            }
        }
        while(high-low > 1e-6){
            double mid=(high+low)/2;
            int c=stations(arr,mid);
            if(c<=k){
                high=mid;
            }else if(c>k){
                low=mid;
            }
        }
        return low;
    }
    public int stations(int [] arr,double mid){
        int count=0;
        double gap=0;
        int i=0;
        for(i=1;i<arr.length;i++){
            gap=arr[i]-arr[i-1];
            count+=(int)(gap/mid);
        }
        if (Math.abs(count * mid - gap) < 1e-9) {  // this was done bcz of double otherwise we could have simply done gap%mid==0
            count--;
        }
        return count;
    }
}
