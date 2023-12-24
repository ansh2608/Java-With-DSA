import java.util.Stack;

public class Balanced_Brackets {
    static boolean isBalanced(String s){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='(') st.push(ch);
            else {
                if (st.size()==0) return false;
                if (st.peek()=='(') st.pop();
            }
        }
        if (st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        String s="()(()))";
        System.out.println(isBalanced(s));
    }
}
