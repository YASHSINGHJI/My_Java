import java.util.Scanner;

public class order_agnostic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        BinarySearch(arr, target);
    }

    static void BinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = 0;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index:" + mid);
                System.exit(0);
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

    }
}
