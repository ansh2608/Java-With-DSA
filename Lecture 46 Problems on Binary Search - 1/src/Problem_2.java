public class Problem_2 {
    static int find(int[] arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==target) return mid;
            else if (arr[mid]<arr[end]){
                if (target>arr[mid] && target<=arr[end]) st=mid+1;
                else end=mid-1;
            }
            else{
                if (arr[st]<=target && target<arr[mid]) end=mid-1;
                else st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int target=12;
        int ans=find(arr,target);
        System.out.println(ans);
    }
}
