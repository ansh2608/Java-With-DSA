import java.util.HashMap;
public class Valid_Anagram_One_HashMap {
    public static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (mp.containsKey(ch)) mp.put(ch,mp.get(ch)+1);
            else mp.put(ch,1);
        }
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (!mp.containsKey(ch)) return false;
            int currFreq=mp.get(ch);
            mp.put(ch,currFreq-1);
        }
        for (Integer i:mp.values()) if (i!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "knee", t = "keens";
        System.out.println(isAnagram(s,t));
    }
}
