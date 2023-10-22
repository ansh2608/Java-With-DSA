public class Iterative_BS {
    static int bs(int[] arr,int x){
        int st=0,end=arr.length-1;
        while (st<end){
            int mid=st+(end-st)/2;
            if (arr[mid]==x) return mid;
            else if(arr[mid]>x) end=mid-1;
            else st=mid+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,7,15,20,24,45,55,77};
        int x=45;
        int ans=bs(arr,x);
        System.out.println(ans);
    }
}
