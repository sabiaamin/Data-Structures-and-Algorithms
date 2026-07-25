package _09_Recursion;

import java.util.Stack;

public class _05_Sort_Stack {
    public void insert(Stack<Integer> st,int x){
        if(st.isEmpty() ||st.peek()<=x){
            st.push(x);
            return;
        }
        int temp=st.pop();
        insert(st,x);
        st.push(temp);
    }
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty() || st.size()==1){
            return ;
        }
        int x=st.pop();

        sortStack(st);
        insert(st,x);

    }
    public void insert1(Stack<Integer> st,int x){
        Stack<Integer> s=new Stack<>();
        while(!st.isEmpty()){
            int temp=st.pop();
            if(temp<=x){
                st.push(temp);
                break;
            }
            s.push(temp);
        }
        st.push(x);
        while(!s.isEmpty()){
            st.push(s.pop());
        }
    }

}
