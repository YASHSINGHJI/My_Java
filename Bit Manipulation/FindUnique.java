public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 2 };
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr) {
        int ans = 0;
        for (int n : arr) {
            ans ^= n;
        }
        return ans;
    }
}
