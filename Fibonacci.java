// Write a program to print the fibonacci series up to a given number

import java.util.Scanner;

class Fibonacci {
    static int fibonacci(int n) {
        // base case: fib(0) = 0, fib(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // recursive case: fib(n) = fib(n-1) + fib(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
}