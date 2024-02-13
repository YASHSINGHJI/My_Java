import java.util.Scanner;

public class Ceiling_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find the ceiling of");
        int num = sc.nextInt();
        ceiling(arr, num);
    }

    static void ceiling(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                System.out.println("Ceiling of the number is:" + arr[mid]);
                System.exit(0);
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                System.out.println("Ceiling of the number is:" + arr[i]);
                System.exit(0);
            }
        }

    }
}
