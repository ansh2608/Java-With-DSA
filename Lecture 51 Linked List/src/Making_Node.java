public class Making_Node {
    public static class Node{
        int data; // Data
        Node next; // Address
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(10);
        Node d=new Node(7);
        Node e=new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
    }
}
