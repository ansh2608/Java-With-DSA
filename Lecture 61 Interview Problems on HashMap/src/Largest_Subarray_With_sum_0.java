import java.util.HashMap;

public class Largest_Subarray_With_sum_0 {
    static int largestSubArray(int[] arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int ps=0,maxLength=0;
        mp.put(0,-1);
        for (int i=0;i<arr.length;i++){
            ps+=arr[i];
            if (mp.containsKey(ps)){
                int curr=i-mp.get(ps);
                maxLength=Math.max(curr,maxLength);
            }
            else{
                mp.put(ps,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10};
        System.out.println(largestSubArray(arr));
    }
}
