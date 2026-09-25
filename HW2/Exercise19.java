package HW2;
import java.util.Scanner;
public class Exercise19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        int min = Math.min(start, end);
        int max = Math.max(start, end);

        System.out.println("Armstrong numbers between " + min + " and " + max + ":");

        for (int i = min; i <= max; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        if (num < 0) return false;

        String str = Integer.toString(num);
        int numDigits = str.length();
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        if (num == 0) return true;

        return sum == num;
    }
}
