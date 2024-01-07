public class MaximumElement_Array {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 10, 6 };
        maxElement(arr);
    }

    static void maxElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("MAX ELEMENT=" + arr[arr.length - 1]);

    }
}
