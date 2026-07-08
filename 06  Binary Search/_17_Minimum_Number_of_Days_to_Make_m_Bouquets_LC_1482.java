package _06_Binary_Search;

public class _17_Minimum_Number_of_Days_to_Make_m_Bouquets_LC_1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num:bloomDay){
            high=Math.max(num,high);
            low=Math.min(num,low);

        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int j=0;
            int bouquet=0;
            int c=0;
            while(j<bloomDay.length){
                if(bloomDay[j]<=mid){
                    c++;
                    if(c==k){
                        bouquet++;
                        c=0;
                        if (bouquet >= m)
                            break;
                    }
                }else{
                    c=0;
                }
                j++;
            }
            if(bouquet>=m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int minDays1(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num:bloomDay){
            high=Math.max(num,high);
            low=Math.min(num,low);

        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int j=0;
            int bouquet=0;
            while(j<bloomDay.length){
                if(j+k>bloomDay.length){
                    break;
                }
                boolean flag=true;
                for(int x=0;x<k;x++){
                    if(bloomDay[x+j]>mid){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    j+=k;
                    bouquet++;
                }else{
                    j++;
                }
            }
            if(bouquet>=m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
