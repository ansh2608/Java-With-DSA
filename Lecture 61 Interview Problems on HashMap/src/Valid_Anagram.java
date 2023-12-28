import java.util.*;
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        Map<Character,Integer> mp1=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (mp1.containsKey(s.charAt(i))) mp1.put(s.charAt(i),mp1.get(s.charAt(i))+1);
            else mp1.put(s.charAt(i),1);
        }
        Map<Character,Integer> mp2=new HashMap<>();
        for (int i=0;i<t.length();i++){
            if (mp2.containsKey(t.charAt(i))) mp2.put(t.charAt(i),mp2.get(t.charAt(i))+1);
            else mp2.put(t.charAt(i),1);
        }
        if (!mp1.equals(mp2)) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "knee", t = "keen";
        System.out.println(isAnagram(s,t));
    }
}
