package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(0 + " " + 1 + " ");
        fibonacci(3, 0, 1);
    }

    static void fibonacci(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(n - 1, b, c);

    }
}
