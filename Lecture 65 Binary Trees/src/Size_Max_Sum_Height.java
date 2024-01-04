public class Size_Max_Sum_Height {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static int size(Node root){
        if (root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if (root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int maxVal(Node root){
        if (root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maxVal(root.left),maxVal(root.right)));
    }
    public static int height(Node root){
        if (root==null) return 0;
        if (root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int minValue(Node root){
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
    }
    public static int prod(Node root){
        if (root==null) return 1;
        return root.val*prod(root.left)*prod(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
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
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(maxVal(root));
        System.out.println(height(root));
        System.out.println(minValue(root));
        System.out.println(prod(root));
    }
}
