import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static boolean palindromeInteger(int num) {
        String number = String.valueOf(num);
        char[] arr = number.toCharArray();
        if (arr.length == 1) {
            return true;
        }
        int i = 0, j = arr.length - 1, count = 0;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            count++;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeInteger(-12321));
        System.out.println(palindromeInteger(12341));
        System.out.println(palindromeInteger(1234543210));
    }
}
