import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("The reversed number is " + rev);
    }

}
