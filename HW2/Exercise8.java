package HW2;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please provide the second number: ");
        int num2 = sc.nextInt();
        if(num1>num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int sum = 0;
        for(int i = num1; i<=num2; i++) {
            if(i%2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum " + sum);
    }
}
