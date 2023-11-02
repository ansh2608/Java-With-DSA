public class Problem_4 {
    public static void main(String[] args) {
        String s1="abchba";
        int i=0,j=s1.length()-1;
        boolean flag=true;
        while (i<j){
            if (s1.charAt(i)!= s1.charAt(j)) flag=false;
            i++;
            j--;
        }
        if (flag) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
