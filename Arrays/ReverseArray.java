import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 10, 6 };
        reverseArray(arr);
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("REVERSE ARRAY=" + Arrays.toString(arr));
    }
}
