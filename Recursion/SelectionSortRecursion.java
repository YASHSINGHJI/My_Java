package Recursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1 };
        selectionsort(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int[] arr, int end, int start, int max) {
        if (end == 0) {
            return;
        }
        if (arr[start] > arr[max]) {
            max = start;
        }
        if (start == end) {
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
            selectionsort(arr, end - 1, 0, 0);
        } else {
            selectionsort(arr, end, start + 1, max);
        }
    }
}