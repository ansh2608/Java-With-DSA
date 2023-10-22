public class Problem_3 {
    static int find(int[] arr,int x){
        int n=arr.length;
        int st=0,end=n-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==x) return mid;
            else if (arr[st]==arr[mid] && arr[mid]==arr[end]){
                st++;
                end--;
            }
            else if (arr[mid]<arr[end]){
                if (x>arr[mid] && x<=arr[end]) st=mid+1;
                else end=mid-1;
            }
            else{
                if (arr[st]<=x && x<arr[mid]) end=mid-1;
                else st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,2,1};
        int ans=find(arr,2);
        System.out.println(ans);
    }
}
