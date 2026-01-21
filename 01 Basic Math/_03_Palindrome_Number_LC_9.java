class _03_Palindrome_Number_LC_9 {
    public boolean isPalindrome(int no) {
        int rev=0;
        int n=no;
        if(n<0){
            return false;
        }
        while(n>0){
            int ld= n % 10;
            rev = rev*10 + ld;
            n /= 10;
        }
        if(rev==no){
            return true;
        }else{
            return false;
        }
    }
}