package SortingAlgos;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 5, 1 };
        for (int i = 0; i < arr.length; i++) {
            int max = max(arr, 0, arr.length - i - 1);
            swap(arr, max, arr.length - i - 1);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int max(int arr[], int start, int end) {
        int max = start;
        int n = arr.length;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
