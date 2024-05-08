/*

4 4 4 4 4 4 4 4 4 
4 3 3 3 3 3 3 3 4 
4 3 2 2 2 2 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 1 0 1 2 3 4 
4 3 2 1 1 1 2 3 4 
4 3 2 2 2 2 2 3 4 
4 3 3 3 3 3 3 3 4 
4 4 4 4 4 4 4 4 4

*/
package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int originalN = 4;
        int n = 8;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

}
