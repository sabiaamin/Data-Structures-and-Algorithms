package _07_Strings;

public class _09_Maximum_Nesting_Depth_Of_The_Parenthesis_LC_1614 {
    public int maxDepth(String s) {
        int depth=0;
        int max=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                depth++;
                if(max<depth){
                    max=depth;
                }
            }else if(ch==')'){
                depth--;
            }
        }
        return max;
    }
}
