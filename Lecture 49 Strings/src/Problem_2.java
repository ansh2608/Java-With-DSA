import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        System.out.println(s);
        for (int i=0;i<s.length();i++){
            boolean flag=true;
            char ch=s.charAt(i);
            if (ch>0) continue;
            else{
                if (ch==' ') continue;
                int asc=(int)ch;
                if (asc>=97) flag=false;
                if (flag){
                    asc+=32;
                    char dh=(char)asc;
                    s.setCharAt(i,dh);
                }
                else {
                    asc-=32;
                    char dh=(char)asc;
                    s.setCharAt(i,dh);
                }
            }
        }
        System.out.println(s);
    }
}
