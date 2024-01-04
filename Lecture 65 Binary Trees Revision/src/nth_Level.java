public class nth_Level {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int level(TreeNode root){
        if (root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    static void print_level(TreeNode root,int n){
        if (root==null) return;
        if (n==1) System.out.print(root.val+" ");
        print_level(root.left,n-1);
        print_level(root.right,n-1);
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
        TreeNode e=new TreeNode(6);
        b.right=e;
        TreeNode f=new TreeNode(7);
        d.left=f;
        TreeNode g=new TreeNode(8);
        TreeNode h=new TreeNode(9);
        e.left=g;
        e.right=h;
        int height=level(root)+1;
        for (int i=1;i<=height;i++){
            print_level(root,i);
            System.out.println();
        }
    }
}
