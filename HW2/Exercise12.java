package HW2;
import java.util.Scanner;
public class Exercise12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

        int sum = 0;
        int product = 0;
        int count = 0;

        if(n >0) {
            product = 1;
            int temp = n;
            while(temp>0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                count++;
                temp /= 10;
            }
        }
        else {
            count = 1;
        }
        double average = (double) sum / count;
        System.out.println("Sum:" + sum);
        System.out.println("Product:" + product);
        System.out.println("Average:" + average);
    }    
}
