import java.util.List;

public class Question_19 {
    static class ListNode {
       int val;
       ListNode next;
       ListNode(int val) {
           this.val = val;
       }
    }
    static void removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        int n=2;
        removeNthFromEnd(a,n);
        ListNode temp=a;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
