import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.addAll;
import static java.util.Collections.reverseOrder;

/*
    496. Next Greater Element I
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 */
public class NextGreaterNumber {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int m = 0;
        if (nums1 == null || nums2 == null) {
            return null;
        }
//        int i = 0;
        Map<Integer, Integer> ref = IntStream.range(0, nums2.length)
                .boxed()
                .collect(Collectors.toMap(i -> nums2[i], i -> i));


        for (int k : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (k == nums2[j] && j < nums2.length - 1) {
//                    res[m++] = nums2[j + 1] > nums2[j] ? nums2[j + 1] : -1;
                    res[m++] = ref.get(j+1) > nums2[j] ? ref.get(nums2[j]) : -1;
                } else if (k == nums2[j] && j == nums2.length - 1) {
                    res[m++] = -1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterNumber n = new NextGreaterNumber();
        int[] nums = n.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
        Arrays.stream(nums).forEach(System.out::println);
    }
}
