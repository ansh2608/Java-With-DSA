import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Ansh")); //null
        mp.put("Akash",25);
        System.out.println(mp.get("Akash")); //25
    }
}
