import java.util.Stack;

public class Stock_span_problem {
    public static int[] calculateSpan(int[] price, int n) {
        int[] ans = new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        ans[0]=1;
        for (int i=1;i<n;i++){
            while (!st.isEmpty() && price[i]>=price[st.peek()]) st.pop();
            if (st.isEmpty()) ans[i]=i+1;
            else ans[i]=i-st.peek();
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 7;
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] ans=calculateSpan(price,N);
        for (int i:ans) System.out.print(i+" ");
    }
}
