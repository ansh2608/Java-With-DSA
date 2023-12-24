import java.util.Stack;

public class Next_Greater_Element {
    static int[] next_greater(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for (int i=n-2;i>=0;i--){
            while (st.peek()<arr[i] && st.size()>0) st.pop();
            if (st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] ans=next_greater(arr);
        for (int i:ans) System.out.print(i+" ");
    }
}
