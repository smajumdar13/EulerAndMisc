import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (valMap.containsKey(target - nums[i])) {
                return new int[]{valMap.get(target - nums[i]), i};
            }
            valMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void reverseString(String[] s) {
        reverseArray(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    public static String[] reverseArray(String[] s, int i, int j) {
        String temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 18)));

        reverseString(new String[]{"a", "b", "c", "d", "e"});
    }
}

