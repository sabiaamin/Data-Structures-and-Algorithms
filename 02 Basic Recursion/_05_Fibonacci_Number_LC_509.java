package _02_Basic_Recursion;

public class _05_Fibonacci_Number_LC_509 {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
