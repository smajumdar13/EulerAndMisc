/*
26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int removeDupsForLeetcode(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        int k = 0, idx = 0;
        while (idx < nums.length && nums[idx] < nums[idx + 1]) {
            k++;
            idx++;
        }
        for (int i: nums) {
            System.out.println(i);
        }
        return k;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,1,2,2,3,3,4, 5});
//        removeDupsForLeetcode(new int[]{1,1,1,2,2,3,3,4});
    }
}
