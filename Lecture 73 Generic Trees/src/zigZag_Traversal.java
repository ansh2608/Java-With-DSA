import java.util.*;
public class zigZag_Traversal {
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
    public static void zigZag(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while (!q.isEmpty()){
            int levelSize=q.size();
            List<Node> currLevel=new ArrayList<>();
            while (levelSize-- > 0){
                Node currNode=q.peek();
                currLevel.add(currNode);
                q.remove();
                int n=currNode.child.size();
                for (int i=0;i<n;i++){
                    q.add(currNode.child.get(i));
                }
            }
            if (flag==false) printNodeList(currLevel);
            else {
                Collections.reverse(currLevel);
                printNodeList(currLevel);
            }
            flag=!flag;
        }
    }
    public static void printNodeList(List<Node> nodeList){
        for (int i=0;i< nodeList.size();i++){
            System.out.print(nodeList.get(i).val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        formTree(root);
        zigZag(root);
    }
}
