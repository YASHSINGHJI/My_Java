// GCD(A,B)=GCD(B%A,A)

package Algorithms;

import java.util.Scanner;

public class euclid {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The GCD of the two numbers is: " + gcd(a, b));
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
