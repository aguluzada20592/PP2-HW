package HW2;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int heads = 0;
        for(int i = 0 ; i < n ; i++) {
            if(Math.random() < 0.5) heads++;
        }
        System.out.println("Heads " + (double)heads/n);
        System.out.println("Tails " + (double)(n-heads)/n);
    }
}