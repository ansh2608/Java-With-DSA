import java.util.*;
public class Mirror_Tree {
    public static class Node{
        int val;
        List<Node> child;
        Node(int val){
            this.val=val;
            child=new ArrayList<>();
        }
    }
    public static void formTree(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static void mirrorTree(Node root){
        if (root.child.isEmpty()) return;
        int n=root.child.size();
        if (n==1) return;
        for (int i=0;i<n;i++){
            mirrorTree(root.child.get(i));
            Collections.reverse(root.child);
        }
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        formTree(root);
    }
}
