package _02_Basic_Recursion;

public class _04_Valid_Palindrome_LC_125 {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l=0;
        int h=s1.length()-1;
        while(l<h){
            if(s1.charAt(l)!=s1.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
