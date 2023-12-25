import java.util.*;

public class Map_Interface_Examples {
    public static void main(String[] args) {
        Map<Integer,String> mp=new HashMap<>();
        mp.put(1,"Ansh");
        mp.put(2,"Siya");
        mp.put(3,"Aditya");
        System.out.println(mp);
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Siya"));
    }
}