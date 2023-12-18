public class Nth_Node_from_Last {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static Node nth(Node a,int n){
        Node slow=a;
        Node fast=a;
        for (int i=1;i<=n;i++) fast=fast.next;
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(14);
        Node c=new Node(24);
        Node d=new Node(34);
        Node e=new Node(44);
        Node f=new Node(54);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        int n=5;
        Node q=nth(a,n);
        System.out.println(q.val);
    }
}
