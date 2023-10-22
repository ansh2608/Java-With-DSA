public class Recursive_BS {
    static int bs(int[] arr,int st, int end, int x){
        int mid=st+(end-st)/2;
        if (x==arr[mid]) return mid;
        else if (x<arr[mid]) return bs(arr,st,mid-1,x);
        else return bs(arr,mid+1,end,x);
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,7,15,20,24,45,55,77};
        int x=45;
        int ans=bs(arr,0,arr.length-1,x);
        System.out.println(ans);
    }
}
