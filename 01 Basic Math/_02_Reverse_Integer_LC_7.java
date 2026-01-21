public class _02_Reverse_Integer_LC_7 {
    public int reverse(int n) {
        long rev=0;
        while(n>0||n<0){
            int ld = n % 10;
            rev = (rev*10) + ld;
            n /= 10;
        }
        if(rev >= Integer.MAX_VALUE || rev <=Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}
