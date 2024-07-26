public class EvenFibonacciValuesSum {
    private int sum;

    public int sumOfEvenFibonacciNumbers(int n) {
        int a = 1;
        int b = 2;
        int i = a + b;
        sum = 2; // adding b since it's even, and i skips b
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            a = b;
            b = i;
            i = a + b;
        }
        return sum;
    }

    public static void main(String[] args) {
        EvenFibonacciValuesSum evenFibonacci = new EvenFibonacciValuesSum();
        System.out.println(evenFibonacci.sumOfEvenFibonacciNumbers(1000));
        System.out.println(evenFibonacci.sumOfEvenFibonacciNumbers(4000000));
    }
}
