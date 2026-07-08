package _06_Binary_Search;
//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
// The guards have gone and will come back in h hours.
//Koko can decide her bananas-per-hour eating speed of k.
// Each hour, she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//Return the minimum integer k such that she can eat all the bananas within h hours.
public class _16_Koko_Eating_Bananas_LC_875 {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(piles[i],high);
        }
        while(low<high){
            long hours=0;
            int mid=low+(high-low)/2;
            for(int i=0;i<piles.length;i++){
                hours+=(piles[i]+mid-1)/mid;
            }
            if(hours<=h){
                high=mid;
            }else if(hours>h){
                low=mid+1;
            }
        }
        return low;
    }
        public int minEatingSpeed1(int[] piles, int h) {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<piles.length;i++){
                if(max<piles[i]){
                    max=piles[i];
                }
            }
            int low=1;
            int high=max;

            int ans=0;
            while(low<=high){
                long hours=0;
                int mid=low+(high-low)/2;
                for(int i=0;i<piles.length;i++){
                    hours+=(int)Math.ceil((double)piles[i]/mid);
                }
                if(hours<=h){
                    if(ans>mid || ans==0){
                        ans=mid;
                    }
                    high=mid-1;
                }else if(hours>h){
                    low=mid+1;
                }
            }
            return ans;
        }
}
