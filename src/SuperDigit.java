public class SuperDigit {

    public static void main(String[] args) {
        System.out.println(superDigit("9875", 4));
    }

    public static int superDigit(String n, int k) {
        // n is concatenated k times and then sum is found
        int digit = 0;
        for ( char c: n.toCharArray()) {
            digit += Character.getNumericValue(c);
        }
        digit *= k;
        return findDigit(digit);
    }

    private static int findDigit(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return findDigit(sum);
    }
}
