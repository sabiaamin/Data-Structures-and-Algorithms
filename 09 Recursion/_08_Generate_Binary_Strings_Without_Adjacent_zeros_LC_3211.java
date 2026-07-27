package _09_Recursion;

import java.util.ArrayList;
import java.util.List;

public class _08_Generate_Binary_Strings_Without_Adjacent_zeros_LC_3211 {
    public void generate(int n,int i,char []cur,List<String> s){
        if(i==n){
            s.add(new String(cur));
            return;
        }
        cur[i]='1';
        generate(n,i+1,cur,s);

        if(i==0  || cur[i-1]!='0'){
            cur[i]='0';
            generate(n,i+1,cur,s);
        }

    }
    public List<String> validStrings(int n){
        char []cur=new char[n];
        List<String> s = new ArrayList<>();
        generate(n,0,cur,s);
        return s;
    }
}
