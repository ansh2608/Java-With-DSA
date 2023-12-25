import java.util.*;

public class Leetcode_225 {
    static class MyStack {
        Queue<Integer> q=new LinkedList<>();
        public void push(int x) {
            q.add(x);
        }
        public int pop() {
            for (int i=1;i<=q.size()-1;i++) q.add(q.remove());
            int x=q.remove();
            return x;
        }
        public int top() {
            for (int i=1;i<=q.size()-1;i++) q.add(q.remove());
            int x=q.peek();
            q.add(q.remove());
            return x;
        }
        public boolean empty() {
            if (q.isEmpty()) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        MyStack st=new MyStack();
        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        System.out.println(st.empty());
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
    }
}
