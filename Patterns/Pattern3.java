/*        1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5

*/

package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }

            System.out.println("");

        }
        System.out.println("");

    }
}
