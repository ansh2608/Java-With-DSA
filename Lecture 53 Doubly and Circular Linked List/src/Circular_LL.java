public class Circular_LL {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }
    static void singly(Node head){
        Node temp=head;
        System.out.print(temp.val+" ");
        temp=temp.next;
        while (temp!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(5);
        Node c=new Node(4);
        Node d=new Node(3);
        Node e=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        singly(a);
    }
}
