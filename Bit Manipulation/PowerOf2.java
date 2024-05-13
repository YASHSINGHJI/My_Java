// Any power is a power of 2 when it's bit form has only one 1. 

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
