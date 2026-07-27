package _09_Recursion;

import java.util.ArrayList;
import java.util.List;

public class _09_Generate_Parantheses_LC_22 {
    public void generate(int n,int open,int close,int i,char[]cur,List<String> s){
        if(close==open && open==n){
            s.add(new String(cur));
            return;
        }
        if(open>=close && open<n){
            cur[i]='(';
            generate(n,open+1,close,i+1,cur,s);
        }
        if(close<open && close<n){
            cur[i]=')';
            generate(n,open,close+1,i+1,cur,s);
        }


    }
    public List<String> generateParenthesis(int n) {
        List<String> s=new ArrayList<>();
        char []cur=new char[n*2];
        generate(n,0,0,0,cur,s);
        return s;
    }
}
