public class Question_237 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static void display(Node a){
        Node temp=a;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    static void deleteNode(Node node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(6);
        Node d=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
        deleteNode(b);
        System.out.println();
        display(a);
    }
}
