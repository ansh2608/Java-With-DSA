import java.util.*;

public class Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        while (!q.isEmpty()) st.push(q.remove());
        while (!st.isEmpty()) q.add(st.pop());
        System.out.println(q);
    }
}
