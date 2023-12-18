public class Doubly_LL {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void display_rev(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void print(Node random){
        Node temp=random;
        while (temp.prev!=null) temp=temp.prev;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node insert(Node head, int index, int val){
        Node temp=head;
        for (int i=1;i<=index-1;i++) temp=temp.next;
        Node r=temp.next;
        Node a=new Node(val);
        temp.next=a;
        a.prev=temp;
        temp.next=r;
        r.prev=temp;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        display_rev(e);
        print(e);
        Node ans=insert(a,3,50);
        display(a);
    }
}
