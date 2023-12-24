import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int num=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>idx) rt.push(st.pop());
        st.push(num);
        while (rt.size()>0) st.push(rt.pop());
        System.out.println(st);
    }
}
