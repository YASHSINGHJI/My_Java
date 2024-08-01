package SortingAlgos;

import java.util.Arrays;

public class Radix_Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 10, 9, 2, 4, 9, 7 };
        Radix(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Radix(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp) {
        if (arr == null || arr.length <= 1)
            return;
        int[] count = new int[10];
        for (int i : arr) {
            count[(i / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

}
