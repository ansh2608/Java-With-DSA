import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reverse_K_Elements {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int k=3;
        Stack<Integer> st=new Stack<>();
        while (q.size()>k) st.push(q.remove());
        while (!st.isEmpty()) q.add(st.pop());
        System.out.println(q);
    }
}
