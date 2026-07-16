package _07_Strings;

public class _11_String_To_Integer_atoi_LC_8 {
    public int myAtoi(String s) {
        long num=0;
        int i=0;
        int sign=+1;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                i++;
            }else{
                break;
            }
        }
        if( i<s.length() && ( s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            if(!Character.isDigit(ch)){
                break;
            }
            num=num*10+(ch-'0');
            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)num*sign;
    }
    public int myAtoi1(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;

        char[] ch = s.toCharArray();

        int i = 0;
        char sign = '+';

        if (ch[0] == '+' || ch[0] == '-') {
            sign = ch[0];
            i = 1;
        }

        int start = -1;
        int end = -1;

        while (i < ch.length) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                start = i;
                end = i;
                break;
            } else {
                return 0;
            }
        }

        if (start == -1)
            return 0;

        while (i < ch.length && ch[i] >= '0' && ch[i] <= '9') {
            end = i;
            i++;
        }

        s = s.substring(start, end + 1);

        try {
            long num = Long.parseLong(s);

            if (sign == '-')
                num = -num;

            if (num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            return (int) num;

        } catch (NumberFormatException e) {
            return sign == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
