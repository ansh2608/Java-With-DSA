import java.util.*;
public class Queue_Interface_Examples {
    static void QueueExamples(){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(26);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
    static void dequeExamples(){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
    }
    static void PriorityQueueExamples(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq_max=new PriorityQueue<>(Comparator.reverseOrder()); // max
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
    public static void main(String[] args) {
        //QueueExamples();
        //PriorityQueueExamples();
        dequeExamples();
    }
}
