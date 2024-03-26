package SortingAlgos;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 5, 1 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}