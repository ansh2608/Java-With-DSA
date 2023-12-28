import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("Ansh");
        st.add("Siya");
        st.add("Adi");
        System.out.println(st);
        System.out.println(st.contains("Siya"));
        System.out.println(st.size());
        System.out.println(st.remove("James"));
    }
}
