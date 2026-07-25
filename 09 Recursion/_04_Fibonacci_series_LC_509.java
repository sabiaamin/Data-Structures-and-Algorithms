package _09_Recursion;

public class _04_Fibonacci_series_LC_509 {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int f_1=1;
        int f_2=0;
        int f=0;
        for(int i=2;i<=n;i++){
            f=f_2+f_1;
            f_2=f_1;
            f_1=f;
        }
        return f_1;
    }
    public int fib1(int n) {
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
