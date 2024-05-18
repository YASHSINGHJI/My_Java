package Recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1 };
        BubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr, int end, int start) {
        if (end == 0)
            return;
        if (start == end) {
            BubbleSort(arr, end - 1, 0);
        }
        if (start + 1 <= arr.length - 1 && arr[start] >= arr[start + 1]) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;
            BubbleSort(arr, end, start + 1);
        }
        if (start + 1 <= arr.length - 1 && arr[start] < arr[start + 1])
            BubbleSort(arr, end, start + 1);

    }
}
