public class Search_in_2D_array {
    public static void main(String[] args) {
        int target = 10;
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target2 = 5;
        search(arr, target2);
    }

    static void search(int[][] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at index: " + i + ", " + j);
                }
            }
        }
    }
}
