package Algorithms;

import java.util.Scanner;

/**
 * newton_raphson
 */
public class newton_raphson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the square root of: ");
        double n = sc.nextDouble();
        System.out.println(sqrt(n));
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;

        }
        return root;
    }
}