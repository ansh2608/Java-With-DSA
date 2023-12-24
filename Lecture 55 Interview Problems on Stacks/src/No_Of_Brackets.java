import java.util.Stack;

public class No_Of_Brackets {
    static int countBalancedBrackets(String s){
        Stack<Character> st=new Stack<>();
        int count=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='(') st.push(ch);
            else {
                if (st.size()==0) count++;
                if (st.peek()=='(') st.pop();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="(())())";
        System.out.println(countBalancedBrackets(str));
    }
}
