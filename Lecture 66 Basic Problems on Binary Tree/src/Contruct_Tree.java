import java.util.LinkedList;
import java.util.Queue;

public class Contruct_Tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public static int height(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void print(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        print(root.left,n-1);
        print(root.right,n-1);
    }
    public static TreeNode constructBFS(String[] arr){
        int x=Integer.parseInt(arr[0]);
        TreeNode root=new TreeNode(x);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while (i<arr.length-1){
            TreeNode temp=q.remove();
            TreeNode left=new TreeNode(0);
            TreeNode right=new TreeNode(0);
            if (arr[i].equals("")) left=null;
            else {
                int l=Integer.parseInt(arr[i]);
                left.val=l;
                q.add(left);
            }
            if (arr[i+1].equals("")) right=null;
            else {
                int r=Integer.parseInt(arr[i+1]);
                right.val=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    public static void main(String[] args) {
        String[] arr={"1","2","3","4","5","","6","","7","","","8","","","","9",""};
        TreeNode root=constructBFS(arr);
        int level=height(root)+1;
        for (int i=1;i<=level;i++){
            print(root,i);
            System.out.println();
        }
    }
}
