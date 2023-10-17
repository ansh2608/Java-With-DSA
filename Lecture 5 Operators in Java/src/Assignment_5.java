public class Assignment_5 {
    public static void main(String[] args) {
        int x=65,y=80;
        int n=x^y;
        int count=0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}
