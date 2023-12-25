import java.util.*;

public class Print_Without_Inbuilt {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        Queue<Integer> helper=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        while (!helper.isEmpty()) q.add(helper.remove());
        System.out.println();
        System.out.println(q);
        System.out.println(helper);
    }
}
