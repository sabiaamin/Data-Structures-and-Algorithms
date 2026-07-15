package _07_Strings;

public class _06_Rotate_string_LC_796 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
    public boolean rotateString1(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String str= s+s;
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
}
