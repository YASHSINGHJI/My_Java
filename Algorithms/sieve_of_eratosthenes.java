package Algorithms;

/**
 * sieve_of_eratosthenes
 */
public class sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1];
        sieve(n, prime);

    }

    static void sieve(int n, boolean[] prime) {
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = true;
                }

            }

        }
        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");

            }

        }

    }
}

// Time Complexity: O(n*log(log(n)))