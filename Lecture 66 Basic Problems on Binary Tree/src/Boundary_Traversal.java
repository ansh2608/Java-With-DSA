import java.util.LinkedList;
import java.util.Queue;

public class Boundary_Traversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public static int level(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void print(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        print(root.left,n-1);
        print(root.right,n-1);
    }
    public static TreeNode construct(String[] arr){
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
    public static void boundary(TreeNode root){
        left(root);
        print_leaf(root);
        right(root);
    }
    public static void right(TreeNode root){
        if (root==null) return;
        if (root.left==null && root.right==null) return;
        if (root.right!=null) right(root.right);
        else right(root.left);
        System.out.print(root.val+" ");
    }
    public static void print_leaf(TreeNode root){
        if (root==null) return;
        if (root.left==null && root.right==null) {
            System.out.print(root.val+" ");
            return;
        }
        print_leaf(root.left);
        print_leaf(root.right);
    }
    public static void left(TreeNode root){
        if (root==null) return;
        if (root.left==null && root.right==null) return;
        System.out.print(root.val+" ");
        if (root.left!=null) left(root.left);
        else left(root.right);
    }
    public static void main(String[] args) {
        String[] arr={  "1","2","3","4","5","","6","7","","8","","9","10","",
                        "11","", "12","","13","","14","15","16","","17","","",
                        "18","","19","","","","20","21","22","23","","24",
                        "25","26","27","","","28"   };
        TreeNode root=construct(arr);
//        int height=level(root)+1;
//        for (int i=1;i<=height;i++){
//            print(root,i);
//            System.out.println();
//        }
        boundary(root);
    }
}
