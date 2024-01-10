import java.util.LinkedList;
import java.util.Queue;

public class Delete_Node_No_child {
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
    static TreeNode delete(TreeNode root,int val){
        if (root==null) return null;
        if (root.val>val) {
            if (root.left.val==val) root.left=null;
            delete(root.left,val);
        }
        else {
            if (root.right.val==val) root.right=null;
            delete(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        String[] arr={"36","24","50","18","26","44","54","2","","","28"};
        TreeNode root=constructTree(arr);
        int level=height(root)+1;
        for (int i=1;i<=level;i++){
            nthLevel(root,i);
            System.out.println();
        }int val=54;
        TreeNode del=delete(root,val);
        int hi=height(del)+1;
        for (int i=1;i<=hi;i++){
            nthLevel(del,i);
            System.out.println();
        }
    }
}
