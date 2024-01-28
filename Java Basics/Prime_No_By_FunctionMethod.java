import java.util.Scanner;

public class Prime_No_By_FunctionMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n) == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    static int isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
            else
                continue;

        }
        return c;
    }
}