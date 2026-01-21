package _02_Basic_Recursion;

public class _02_Factorial_GG {
    int factorial(int n) {
        // code here
        if(n==0 || n==1){
            return 1;
        }
        else{
            return (factorial(n-1)*n);
        }
    }
}
