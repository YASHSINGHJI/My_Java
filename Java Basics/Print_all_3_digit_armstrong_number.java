public class Print_all_3_digit_armstrong_number {
    public static void main(String[] args) {
        isArmstrong();
    }

    static void isArmstrong() {

        for (int i = 100; i <= 999; i++) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if (sum == i) {
                System.out.println(i);

            }

        }

    }
}