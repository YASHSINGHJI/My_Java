package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        sb.append(str);
        sb.reverse();
        if (str.equals(sb.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}
