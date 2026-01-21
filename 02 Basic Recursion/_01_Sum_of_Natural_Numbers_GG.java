package _02_Basic_Recursion;

public class _01_Sum_of_Natural_Numbers_GG {
    public static int findSum(int n) {
        // code here
        if(n<=0){
            return 0;
        }
        else{
            return (n + findSum(n-1));
        }

    }
}

