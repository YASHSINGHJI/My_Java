import java.util.Scanner;

public class Floor_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String x = "Enter the number to find the floor of";
        System.out.println(x);
        int num = sc.nextInt();
        System.out.println(ceiling(arr, num));
    }

    static int ceiling(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return arr[mid];
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
