package _01_Basic_Math;

public class _08_Count_Primes_LC_204 {
    public int countPrimes(int n){
        int count=0;
        boolean[] isNotPrime = new boolean[n];
        for(int i=2;i<n;i++){
            if(isNotPrime[i]==false ){
                count++;
                for(long j=(long)i*i;j<n;j=j+i){
                    isNotPrime[(int)j]=true;
                }

            }
        }
        return count;
    }
}
