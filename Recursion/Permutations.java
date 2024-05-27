package Recursion;

public class Permutations {
    public static void main(String args[]) {
        permutation("", "ABC", 0);
    }

    static void permutation(String p, String up, int index) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i < up.length(); i++) {
            permutation(p + up.charAt(i), up.substring(0, i) + up.substring(i + 1), index + 1);
        }

    }
}
