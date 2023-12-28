import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Max_Freq {
    static int countFreq(int[] arr){
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> mp=new HashMap<>();
        for (int el:arr){
            if (!mp.containsKey(el)) mp.put(el,1);
            else mp.put(el,mp.get(el)+1);
        }
        int freq=0,key=0;
        for (var e:mp.entrySet()){
            if (e.getValue()>freq){
                freq=e.getValue();
                key=e.getKey();
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,4,1};
        System.out.println(countFreq(arr));
    }
}
