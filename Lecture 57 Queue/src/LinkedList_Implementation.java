import java.util.LinkedList;

public class LinkedList_Implementation {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static class queue{
        Node head=null,tail=null;
        int size=0;
        public void add(int val){
            Node temp=new Node(val);
            if (size==0) {
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if (size==0) {
                System.out.print("Empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if (size==0) {
                System.out.println("Empty");
                return -1;
            }
            int x= head.val;
            head=head.next;
            size--;
            return x;
        }
        public void display(){
            if (size==0) {
                System.out.println("Empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.display();
    }
}
