import java.util.LinkedList;
import java.util.Queue;

public class height_nthLevel_pre_in_post_order_contruct {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    static void nthLevel(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    static TreeNode constructTree(String[] arr){
        int x=Integer.parseInt(arr[0]);
        TreeNode root=new TreeNode(x);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while (i<arr.length-1){
            TreeNode temp=q.remove();
            TreeNode left=new TreeNode(0);
            TreeNode right=new TreeNode(0);
            if (arr[i].isEmpty()) left=null;
            else {
                left.val=Integer.parseInt(arr[i]);
                q.add(left);
            }
            if (arr[i+1].isEmpty()) right=null;
            else {
                right.val=Integer.parseInt(arr[i+1]);
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    static void preOrder(TreeNode root){
        if (root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(TreeNode root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    static void postOrder(TreeNode root){
        if (root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        String[] arr={"36","24","50","18","26","44","54","2","","","28"};
        TreeNode root=constructTree(arr);
        int level=height(root)+1;
        for (int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
