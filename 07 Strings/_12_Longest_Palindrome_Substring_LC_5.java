package _07_Strings;

public class _12_Longest_Palindrome_Substring_LC_5 {
    public int expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int l = s.length();
        if (l < 2) {
            return s;
        }
        int len = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < l; i++) {
            int l1 = expand(s, i, i);
            int l2 = expand(s, i, i + 1);
            len = Math.max(l1, l2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
         return s.substring(start, end + 1);

    }

}
