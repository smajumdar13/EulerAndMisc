import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class TapeMeasure {
    public int solution(int[] A) {
        // Implement your solution here
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int reverseSum = 0;
        int temp = 0;

        for (int j : A) {
            sum += j;
        }

        for (int k = 0; k < A.length - 1; k++) {
            reverseSum += A[k];
            sum -= A[k];
            temp = Math.abs(sum - reverseSum);
            if (temp == 0) {
                continue;
            }
            if (temp < min) {
                min = temp;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }

    public static void main(String[] args) throws MustBePositiveException {
//        int[] A = {3, 1, 2, 4, 3};
////        int[] A = {1,1,2};
//        int res = new TapeMeasure().solution(A);
//        System.out.println(res);
        int year = 2024;
        int month = 8;
        int day = 13;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek().toString());

        double d = 21.23654;

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "in", "Rs."));
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + u.format(d));
        // only Java 8 return Rs. as currency locale for India
        System.out.println("India: " + i.format(d));
        System.out.println("China: " + c.format(d));
        System.out.println("France: " + f.format(d));


    }

    // test creating exception
    public static class MustBePositiveException extends Exception {
        public static void mustBePositive() {
            System.out.println("Breadth and height must be positive");
        }
    }
}
