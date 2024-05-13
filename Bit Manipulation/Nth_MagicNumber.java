import java.util.Scanner;

public class Nth_MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println(nthMagicNumber(n));
    }

    static int nthMagicNumber(int n) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            pow = pow * 5;
            if ((n & 1) == 1) {
                ans += pow;
            }
            n = n >> 1;
        }
        return ans;
    }
}
