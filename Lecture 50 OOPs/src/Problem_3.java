import java.util.*;

public class Problem_3 {
    public static class Arraylist{
        int[] arr=new int[2];
        int idx=0;
        int size=0;
        public void add(int el){
            if (size== arr.length) {
                int[] brr=Arrays.copyOf(arr,arr.length*2);
                arr=new int[brr.length];
                arr=Arrays.copyOf(brr,brr.length);
            }
            arr[idx]=el;
            idx++;
            size++;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr.size());
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
