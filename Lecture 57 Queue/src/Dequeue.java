import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.addFirst(10);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
