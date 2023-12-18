public class Palindrome_Doubly_LL {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
             this.val=val;
        }
    }
    static boolean isPalindrome(Node head){
        Node tail=head,temp=head;
        while (tail.next!=null) tail=tail.next;
        while (temp!=tail){
            if (temp.val!= tail.val) return false;
            temp=temp.next;
            tail=tail.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(3);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=null;
        System.out.println(isPalindrome(a));
    }
}
