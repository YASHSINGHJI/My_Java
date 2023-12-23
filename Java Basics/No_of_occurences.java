import java.util.Scanner;

public class No_of_occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Enter the digit to be counted");
        int d = sc.nextInt();
        int count = 0;
        while (n != 0) {
            long rem = n % 10;
            if (rem == d)
                count++;
            n /= 10;
        }
        System.out.println("The digit " + d + " occurs " + count + " times");
    }
}
