import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of strings of letters from a to z, create a function, sum_alphabet, that returns a list of the alphabet sum of each word in the string.
The alphabet sum is the sum of the ordinal position of each of the string’s letters in the standard English alphabet ordering. So, the letter a will have a value of 1, z will have a value of 26, and so on.
As an example of the alphabet sum of a string, the string sport will have an alphabet sum of 19 + 16 + 15 + 18 + 20 = 88.
Example:
Input:
words = ["sport" , "good" , "bad"]
Output:
sum_alphabet(words) -> [88 , 41 , 7]
 */
public class SumAlphabet {
    public static int[] sum_alphabet(String[] words) {
        int[] sum = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                sum1 += words[i].charAt(j) - 96;
            }
            sum[i] = sum1;
        }
        return sum;
    }

    public static void main(String[] args) {
//        String[] words = {"sport", "good", "bad"};
//        int[] sum = sum_alphabet(words);
//        for (int j : sum) {
//            System.out.println(j);
//        }

        List<String> arr = Arrays.asList("hello", "world");
        Map<Character, String> map = arr.stream().collect(Collectors.toMap(x -> x.charAt(0), x -> x));

        System.out.println(map);
    }
}
