public class Inorder {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static void in_order(TreeNode root){
        if (root==null) return;
        in_order(root.left);
        System.out.print(root.val+" ");
        in_order(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(4);
        TreeNode d=new TreeNode(5);
        a.left=c;
        a.right=d;
        in_order(root);
    }
}
