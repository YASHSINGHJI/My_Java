import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size 5: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        LinearSearch(arr, sc.nextInt());
    }

    static void LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                System.out.println("Element found at index " + i);
            }
        }
        System.out.println("Element not found");
    }
}
