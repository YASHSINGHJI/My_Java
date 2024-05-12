import java.util.Scanner;

public class Find_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(find_ith_bit(n, i));

    }

    static int find_ith_bit(int n, int i) {
        int mask = 1 << i;
        return (n & mask) > 0 ? 1 : 0;
    }
}