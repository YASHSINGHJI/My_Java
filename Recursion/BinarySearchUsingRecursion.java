package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        binarysearch(arr, 0, arr.length - 1, target);
    }

    static void binarysearch(int arr[], int start, int end, int target) {
        if (start > end) {
            System.out.println("Element not found");
            return;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            System.out.println("Element found at index " + mid);
            return;
        } else if (arr[mid] > target) {
            binarysearch(arr, start, mid - 1, target);
        } else {
            binarysearch(arr, mid + 1, end, target);
        }
    }
}
