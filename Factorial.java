//Find the factorial of a number using recursion

import java.util.InputMismatchException;
import java.util.Scanner;
class Factorial {
    static int factorial(int n) {
        if(n<0){
            throw new ArithmeticException("Factorial not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            System.out.println(factorial(n));
        }catch (ArithmeticException  e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input\nPlease enter a valid input");
        }
    }
}