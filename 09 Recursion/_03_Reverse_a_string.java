package _09_Recursion;

public class _03_Reverse_a_string {
    public String solve(String s,int i,int n ){
        if(i==n){
            return "";
        }
        return solve(s,i+1,n) + s.charAt(i);
    }
    public String reverse(String s){
        return solve(s,0,s.length());
    }
    public void main(String args[]){
        String s="Geeks";
        System.out.println(s);
        System.out.println(reverse(s));
    }
}
