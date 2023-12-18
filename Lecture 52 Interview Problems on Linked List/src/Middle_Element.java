public class Middle_Element {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    //For Right side
    static int Right_Middle(ListNode head){
        ListNode slow=head, fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
    //For Left side
    static int Left_Middle(ListNode head){
        ListNode slow=head, fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(100);
        ListNode b=new ListNode(13);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(5);
        ListNode e=new ListNode(12);
        ListNode f=new ListNode(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(Right_Middle(a));
        System.out.println(Left_Middle(a));
    }
}
