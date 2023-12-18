public class Question_160 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static Node intersection(Node a, Node b){
        if (a==null || b==null) return null;
        Node tempA=a, tempB=b;
        int lengthA=0;
        while (tempA!=null) {
            lengthA++;
            tempA=tempA.next;
        }
        tempA=a;
        int lengthB=0;
        while (tempB!=null) {
            lengthB++;
            tempB=tempB.next;
        }
        tempB=b;
        if (lengthA>lengthB){
            int steps=lengthA-lengthB;
            for (int i=1;i<=steps;i++) tempA=tempA.next;
        }
        else {
            int steps=lengthB-lengthA;
            for (int i=1;i<=steps;i++) tempB=tempB.next;
        }
        while (tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node c=new Node(1);
        Node d=new Node(8);
        Node e=new Node(4);
        Node f=new Node(5);
        Node b=new Node(5);
        Node g=new Node(6);
        Node h=new Node(1);
        a.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        b.next=g;
        g.next=h;
        h.next=d;
        Node q=intersection(a,g);
        System.out.println(q.val);
    }
}
