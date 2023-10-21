public class Problem_1 {
    static void sortArr(int[] arr){
        int x=-1,y=-1;
        if (arr.length<=1) {
            return;
        }
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]){
                if (x==-1){
                    x=i-1;
                    y=i;
                }
                else {
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int[] arr={10};
        sortArr(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
