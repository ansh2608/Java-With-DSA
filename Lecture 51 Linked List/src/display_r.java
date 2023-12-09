public class display_r {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void print(Node a){
        Node temp=a;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void rev(Node head){
        if (head==null)return;
        rev(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(15);
        Node c=new Node(25);
        Node d=new Node(35);
        Node e=new Node(45);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
        System.out.println();
        rev(a);
    }
}
