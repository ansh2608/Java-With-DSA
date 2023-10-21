public class Problem_3 {
    static void display(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sort(int[] arr){
        int n=arr.length;
        int lo=0,mid=0,hi=n-1;
        while (mid<=hi){
            if (arr[mid]==0){
                swap(arr,mid,lo);
                mid++;
                lo++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                swap(arr,mid,hi);
                hi--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={0,2,1,2,0,0};
        sort(arr);
        display(arr);
    }
}
