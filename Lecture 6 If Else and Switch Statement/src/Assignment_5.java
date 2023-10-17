import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Operator (+,-,*,/) : " );

        char op=sc.next().charAt(0);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans;
        switch (op){
            case '+':
                ans=num1+num2;
                System.out.println(ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.println(ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.println(ans);
                break;
            case '/':
                ans=num1/num2;
                System.out.println(ans);
                break;
            default:
                System.out.println("INVALID");
                break;
        }
    }
}
