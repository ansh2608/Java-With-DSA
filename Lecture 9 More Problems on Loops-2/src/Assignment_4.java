import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1; //variable that will check for each number starting from 1 till n
        while(num <= n){
            int count = 0;
            int i = num;
            while(i > 0){
                count++;
                i /= 10;
            }
            int val = num;
            int sum = 0;
            while(val > 0){
                int digit = val % 10;
                sum += Math.pow(digit, count);
                val /= 10;
                if(sum > val){
                    continue;
                }
            }
            if(sum == num){ //this is an armstrong number
                System.out.println(num);
            }
            num++;
        }
    }
}
