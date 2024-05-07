/* 

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/
package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int k = 4; k >= i; k--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int k = i - 5; k >= 1; k--) {
                    System.out.print(" ");
                }
                for (int j = 10 - i; j >= 1; j--) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
}
