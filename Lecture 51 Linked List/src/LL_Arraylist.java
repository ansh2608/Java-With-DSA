public class LL_Arraylist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        void insertAtHead(int val){
            Node temp=new Node(val);
            if (head==null) head=tail=temp;
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if (head==null){
                head=temp;
            }
            else tail.next=temp;
            tail=temp;
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAt(int idx, int val){
            Node t=new Node(val);
            Node temp=head;
            for (int i=1;i<idx;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtHead(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAt(2,10);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
    }
}
