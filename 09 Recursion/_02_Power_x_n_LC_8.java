package _09_Recursion;

public class _02_Power_x_n_LC_8 {
    public double power(double x,long n){
        if(n==0){
            return 1;
        }
        double half=power(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return x*half*half;
    }
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            return 1.0/power(x,-N);
        }
        return power(x,N);
    }
}
