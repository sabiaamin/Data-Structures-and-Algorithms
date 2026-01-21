package _01_Basic_Math;

public class _07_Check_for_Primes_GG {
    static boolean isPrime(int n) {
        // code here
        int count=0;
        if(n==1){
            return false;
        }
        for (int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
