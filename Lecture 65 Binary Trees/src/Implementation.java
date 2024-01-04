public class Implementation {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node root){
        if (root==null) return;
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val+" ");
        if(root.right!=null) System.out.print(root.right.val+" ");
        if(root.left==null || root.right==null) System.out.print("null"+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        root.left=a;
        Node b=new Node(3);
        root.right=b;
        Node c=new Node(4);
        a.left=c;
        Node d=new Node(5);
        a.right=d;
        Node e=new Node(6);
        b.right=e;
        display(root);
    }
}
