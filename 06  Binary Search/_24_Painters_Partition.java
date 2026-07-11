package _06_Binary_Search;

public class _24_Painters_Partition {
    public int paint(int A, int B, int[] C) {
        // Your code goes here
        long low=0;
        long high=0;
        for(int num :C ){
            if(low<num){
                low=num;
            }
            high+=num;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            int  c= checkTime(C,mid);
            if(c<=A){
                high=mid-1;
            }
            else if(c>A){
                low=mid+1;
            }
        }
        return (int)((low*(long)B) % 10000003);
    }
    public int checkTime(int []C,long mid){
        long sum=0;
        int t=1;
        for(int num: C){
            if(sum+num>mid){
                sum=num;
                t++;
            }else{
                sum+=num;
            }
        }
        return t;
    }
}
