public class Circular_Queue {
    static class queue{
        int[] arr=new int[5];
        int n= arr.length;
        int f=-1,r=-1,size=0;
        public void add(int val) throws Exception {
            if (size==n) throw new Exception("Queue is Full !!");
            else if (size==0) {
                f=r=0;
                arr[0]=val;
            }
            else if (r<n-1) arr[++r]=val;
            else if (r==n-1) {
                r=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size==0) throw new Exception("Queue is empty");
            else {
                int val=arr[f];
                if (f==n-1)f=0;
                else f++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if (size==0) throw new Exception("Queue is empty");
            else return arr[f];
        }
        public void display() throws Exception{
            if (size==0) throw new Exception("Queue id Empty !! ");
            if (f<=r){
                for (int i=f;i<=r;i++) System.out.print(arr[i]+" ");
            }
            else {
                for (int i=f;i<=n-1;i++) System.out.print(arr[i]+" ");
                for (int i=0;i<=r;i++) System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) throws Exception{
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
    }
}
