// Any power is a power of 2 when it's bit form has only one 1. 

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int ans = n & (n - 1);
        System.out.println(ans == 0 ? "Yes" : "No");

    }
}

/*
 * For example suppose we have 10000000 in binary form
 * and we subtract 1 from it we get 01111111.
 * Now if we do bitwise & of these two numbers we get 0.
 * 
 */
