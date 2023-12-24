import java.util.*;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer> gt=new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
