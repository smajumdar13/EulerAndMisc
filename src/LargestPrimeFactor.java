public class LargestPrimeFactor {

    public long largestPrimeFactor(long n) {
        while (true) {
            if (factor(n) < n) {
                n /= factor(n);
            } else {
                return n;
            }
        }
    }

    private static long factor(long n) {
        if (n <= 1) {
            throw new IllegalArgumentException();
        }
        for ( long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
