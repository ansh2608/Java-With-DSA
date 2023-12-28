import java.util.HashMap;
public class Two_Sum {
    public static int[] twoSum(int[] nums, int target){
        int n= nums.length;
        int[] ans={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<n;i++){
            int partner=target-nums[i];
            if (mp.containsKey(partner)) {
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        int[] ans=twoSum(num,target);
        for (int i:ans) System.out.print(ans[i]+" ");
    }
}
