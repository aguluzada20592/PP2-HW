package HW2;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide seconds: ");
        int second = sc.nextInt();
        int hours = second / 3600;
        int remainingsecond  = second % 3600;
        int minutes = remainingsecond / 60;
        int seconds = remainingsecond % 60;
        System.out.println(hours + "hour(s)" + minutes + "minute(s)" + seconds + "second(s)");
    }
}