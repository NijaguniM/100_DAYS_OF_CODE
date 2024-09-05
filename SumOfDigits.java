//Find the number of trialing zeros of its factorial1235
import java.util.Scanner;
public class SumOfDigits{
    static int sumOfDigits(int n){
        int rem, sum=0;
        while(n != 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        System.out.println("The sum of the numbers "+sumOfDigits(n));
    }
}

