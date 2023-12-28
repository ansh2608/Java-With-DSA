import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] arr){
        HashSet<Integer> st=new HashSet<>();
        int maxStreak=0;
        for (int i:arr) st.add(i);
        for (int num:st){
            if (!st.contains(num-1)) {
                int currNum=num,currStreak=1;
                while (st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[] arr={5,100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
