package HW2;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating-point number: ");
        double num = sc.nextDouble();
        if(num > 0) {
            System.out.println("The number is positive.");
        }
        else if(num == 0) {
            System.out.println("The number is 0.");
        }
        else {
            System.out.println("The number is negative.");
        }
    }
}
