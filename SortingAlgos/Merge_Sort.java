package SortingAlgos;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 6, 2 };
        int[] sorted = mergesort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int midpoint = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, midpoint));
        int[] right = mergesort(Arrays.copyOfRange(arr, midpoint, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }
        return result;
    }
}
