public class Array_Implementation {
    static class Queue{
        int[] arr=new int[30];
        int f=-1,r=-1,size=0;
        public void add(int val){
            if (r==arr.length-1) {
                System.out.println("Queue is Full!!");
                return;
            }
            if (f==-1) {
                f=r=0;
                arr[0]=val;
            }
            else arr[++r]=val;
            size++;
        }
        public int remove(){
            if (size==0) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            return arr[f];
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }
        public void display(){
            if (size==0) {
                System.out.print("Empty!!!");
                return;
            }
            else {
                for (int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.isEmpty();
        q.add(1);
        q.display();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.display();
    }
}
