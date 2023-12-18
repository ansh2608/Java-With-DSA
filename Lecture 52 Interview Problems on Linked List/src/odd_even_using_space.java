public class odd_even_using_space {
    static class ListNode {
           int val;
           ListNode next;
           ListNode(int val) {
               this.val = val;
           }
    }
    static ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(1);
        ListNode even=new ListNode(2);
        ListNode temp=head;
        ListNode tempO=odd,tempE=even;
        while (temp!=null){
            if (temp.val%2==0){
                ListNode a=new ListNode(temp.val);
                tempE.next=a;
                tempE=a;
            }
            else{
                ListNode a=new ListNode(temp.val);
                tempO.next=a;
                tempO=a;
            }
            temp=temp.next;
        }
        tempO.next=even.next;
        return odd.next;
    }
    public static void main(String[] args) {
        ListNode a =new ListNode(3);
        ListNode b =new ListNode(5);
        ListNode c =new ListNode(4);
        ListNode d =new ListNode(1);
        ListNode e =new ListNode(2);
        ListNode f =new ListNode(8);
        ListNode g =new ListNode(10);
        ListNode h =new ListNode(13);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        ListNode ans=oddEvenList(a);
        while (ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
