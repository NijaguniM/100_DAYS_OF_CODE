
import java.util.Scanner;
 public class LargestDigit {
    static int largestDigit(int n) {
        int rem, largest = 0;
        while (n != 0) {
            rem = n % 10;
            largest = rem > largest ? rem : largest;
            n = n /10;
        }
        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Largest Digit in the number is " + largestDigit(n));
    }
}

