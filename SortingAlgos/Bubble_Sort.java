package SortingAlgos;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

// Time Complexity: O(n^2)
