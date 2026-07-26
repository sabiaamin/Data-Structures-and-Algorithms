package _09_Recursion;

import java.util.Stack;

public class _06_Reverse_Stack_GFG {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int y=st.pop();
        pushAtBottom(st,x);
        st.push(y);
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.size()==0){
            return ;
        }
        int x=st.pop();
        reverseStack(st);
        pushAtBottom(st,x);
    }
}
