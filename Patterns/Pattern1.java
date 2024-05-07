/*

*
**
***
****
*****
****
***
**
*

*/
package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 9; i++) {
            if (i <= 5) {
                int j = 1;
                for (; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                int j = 10 - i;
                int k = 1;
                for (; k <= j; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }

    }

}