public class Problem_2 {
    static void negFirst(int[] arr){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            while (arr[l]<0) l++;
            while (arr[r]>0) r--;
            if (l < r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        negFirst(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
