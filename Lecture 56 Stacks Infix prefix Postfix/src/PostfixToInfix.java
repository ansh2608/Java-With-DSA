import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if ((int)ch>=48 && (int)ch<=57) st.push((int)ch-48);
            else {
                int val2=st.pop();
                int val1=st.pop();
                if (ch=='-') st.push(val1-val2);
                if (ch=='+') st.push(val1+val2);
                if (ch=='*') st.push(val1*val2);
                if (ch=='/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}
