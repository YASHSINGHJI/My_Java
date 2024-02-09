public class code_ascending {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinarySearch(arr, 5);
    }

    static void BinarySearch(int[] arr, int target) {
        int start = 0, mid = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index:" + mid);
                System.exit(0);
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        System.out.println("Element not found");
    }
}
