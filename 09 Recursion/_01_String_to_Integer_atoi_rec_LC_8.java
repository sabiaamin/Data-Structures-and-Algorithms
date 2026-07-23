package _09_Recursion;

public class _01_String_to_Integer_atoi_rec_LC_8 {
    public long count(String s,int i,long num,int sign ){
        if(i==s.length() || ! (Character.isDigit(s.charAt(i))) ){
            return num*sign;
        }
        num=num*10+(s.charAt(i)-'0');
        if(num*sign>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(num*sign<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return count(s,i+1,num,sign);
    }
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.charAt(0)==' '){
            return myAtoi(s.substring(1,s.length()));
        }
        long num=0;
        int i=0;
        int sign=+1;
        if( i<s.length() && ( s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        num=count(s,i,num,sign);
        return (int)num;
    }
}
