package SortingAlgos;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        cyclicSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;

            }

        }

    }
}
