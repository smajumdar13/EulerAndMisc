import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:
Input: nums = [1,2,3,4]
Output: false
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer i: nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[] {2,3,6,5,3,4,9}));
        System.out.println(containsDuplicate(new int[] {5,9,6,8,4,3,1,7,2,0}));
        System.out.println(containsDuplicate(new int[] {5,3,2,6,9,8,6,0,1,2,4,7,5}));
    }
}
