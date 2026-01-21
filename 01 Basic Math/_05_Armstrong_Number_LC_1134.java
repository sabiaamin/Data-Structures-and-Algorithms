public class _05_Armstrong_Number_LC_1134 {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int m =n;
        while(m!=0){
            int ld = m%10;
            sum += Math.pow(ld,3);
            m /= 10;
        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }
}
