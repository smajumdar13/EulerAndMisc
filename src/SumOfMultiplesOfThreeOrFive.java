public class SumOfMultiplesOfThreeOrFive {
    private int sum;

    public int sumOfMultiplesOfThreeOrFive(int n) {
        for (int i = 1; i < n; i++) {
            if ( i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
