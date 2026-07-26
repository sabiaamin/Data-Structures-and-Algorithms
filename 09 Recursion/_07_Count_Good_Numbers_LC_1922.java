package _09_Recursion;

public class _07_Count_Good_Numbers_LC_1922 {
    public long power(long m,long n){
        long MOD=1000000007;
        if(n==0){
            return 1;
        }
        long half=power(m,n/2);
        if(n%2==0){
            return half*half%MOD;
        }
        return (half*half*m)%MOD;
    }
    public int countGoodNumbers(long n) {
        long even=0;
        long odd=0;
        even=(n+1)/2;
        odd=n/2;
        long MOD=1000000007;
        long ans =power(5, even) * power(4, odd) % MOD;
        return (int) ans;


    }
}
