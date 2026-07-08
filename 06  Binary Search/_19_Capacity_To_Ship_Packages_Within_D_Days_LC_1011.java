package _06_Binary_Search;

public class _19_Capacity_To_Ship_Packages_Within_D_Days_LC_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int i=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<weights.length;i++){
            sum+=weights[i];
            if(max<weights[i]){
                max=weights[i];
            }
        }
        int low=max;
        int high=sum;
        int c=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            c=checkdays(weights,mid);
            if(c<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    int checkdays(int [] weights,int mid){
        int i=0;
        int c=1;
        int m=mid;
        while(i<weights.length){
            if(weights[i]<=m){
                m=m-weights[i];
                i++;
            }else if(weights[i]>m){
                c++;
                m=mid;
            }
        }
        return c;
    }
}
