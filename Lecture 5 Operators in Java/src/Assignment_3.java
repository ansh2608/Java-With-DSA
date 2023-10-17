public class Assignment_3 {
    public static void main(String[] args) {
        int x=132;
        int ans=0;
        while(x>0){
            int rem=x%10;
            ans+=rem;
            x/=10;
        }
        System.out.println(ans);
    }
}
