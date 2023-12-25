import java.util.HashSet;

public class Set_Interface_Examples {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(4);
        st.add(5);
        System.out.println(st);
        st.remove(2);
        System.out.println(st.contains(2));
        System.out.println(st.size());
    }
}
