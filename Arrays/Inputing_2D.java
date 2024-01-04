import java.util.*;

public class Inputing_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] j = new int[p][q];
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < j[i].length; k++) {
                j[i][k] = sc.nextInt();
            }
        }
        for (int i = 0; i < j.length; i++) {
            System.out.println(Arrays.toString(j[i]));
        }
    }
}
