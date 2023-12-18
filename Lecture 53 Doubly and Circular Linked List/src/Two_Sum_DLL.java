public class Two_Sum_DLL {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    static void two_sum(Node head, int x){
        Node tail=head;
        while (tail.next!=null) tail=tail.next;
        Node h=head,t=tail;
        while (h.val<t.val){
            if (h.val+t.val==x) {
                System.out.println(h.val+" "+t.val);
                break;
            }
            if (h.val+t.val<x) h=h.next;
            if (h.val+t.val>x) t=t.prev;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=null;
        int x=6;
        two_sum(a,x);
    }
}
