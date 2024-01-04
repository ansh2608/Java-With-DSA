public class Pre_In_Post_Order {
    static class Node{
                int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    static void Pre_Order(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        Pre_Order(root.left);
        Pre_Order(root.right);
    }
    static void In_Order(Node root){
        if (root==null) return;
        In_Order(root.left);
        System.out.print(root.val+" ");
        In_Order(root.right);
    }
    static void Post_Order(Node root){
        if (root==null) return;
        Post_Order(root.left);
        Post_Order(root.right);
        System.out.print(root.val+" ");
    }
    public static void nthLevel(Node root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        Pre_Order(root);
        System.out.println();
        In_Order(root);
        System.out.println();
        Post_Order(root);
        System.out.println();
        nthLevel(root,3);
    }
}
