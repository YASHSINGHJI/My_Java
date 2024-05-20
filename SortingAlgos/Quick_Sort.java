package SortingAlgos;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = (s + e) / 2;
        while (s <= e) {
            if (arr[s] < arr[m]) {
                s++;
            }
            if (arr[e] > arr[m]) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }

}

// Time Complexity: O(n*logn)
