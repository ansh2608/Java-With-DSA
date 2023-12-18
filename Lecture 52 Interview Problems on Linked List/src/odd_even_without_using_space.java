public class odd_even_without_using_space {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    static ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        ListNode t2=new ListNode(1),t1=new ListNode(2);
        ListNode tOdd=t2, tEven=t1;
        while (temp!=null){
            if (temp.val%2==0){
                tEven.next=temp;
                tEven=temp;
            }
            else {
                tOdd.next=temp;
                tOdd=temp;
            }
            temp=temp.next;
        }
        tEven.next=null;
        tOdd.next=t1.next;
        return t2.next;
    }
    public static void main(String[] args) {
        ListNode a =new ListNode(2);
        ListNode b =new ListNode(1);
        ListNode c =new ListNode(3);
        ListNode d =new ListNode(5);
        ListNode e =new ListNode(6);
        ListNode f =new ListNode(4);
        ListNode g =new ListNode(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        ListNode ans=oddEvenList(a);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
