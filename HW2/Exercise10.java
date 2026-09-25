package HW2;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= num; i++) {
            sum += 1.0/i;
        }
        System.out.println("The " + num + " th harmonic number is " + sum);
    }
}
