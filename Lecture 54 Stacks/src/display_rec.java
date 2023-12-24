import java.util.*;
public class display_rec {
    static void display(Stack<Integer> st){
        if (st.size()==0) return;
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
    }
}
