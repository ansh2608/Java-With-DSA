public class Problem_5 {
    static boolean isPalindrome(String s1){
        int i=0,j=s1.length()-1;
        boolean flag=true;
        while (i<j){
            if (s1.charAt(i)!= s1.charAt(j)) {
                flag=false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        String s="abcba";
        int count=0;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                if (isPalindrome(s.substring(i,j))==true) {
                    System.out.print(s.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
