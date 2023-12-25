import java.util.*;
public class List_Interface_Examples {
    static void ArrayListExamples(){
        //ArrayList<Integer> l=new ArrayList<>();
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1,10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static void StackListExamples(){
        Stack<Integer> st=new Stack<>();
        System.out.println(st.empty());
        st.push(11);
        st.push(21);
        st.push(31);
        st.push(41);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
    public static void main(String[] args) {
       // ArrayListExamples();
        StackListExamples();
    }
}
