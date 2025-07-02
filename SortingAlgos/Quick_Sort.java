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

        int pivot_idx = findPivot(arr, low, high);
        quicksort(arr, low, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, high);
    }

    static int findPivot(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index j
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;

    }
}

// Time Complexity: O(n*logn)
