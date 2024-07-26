/*
27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int temp = 0, n = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i + 1] = temp;
            }
        }
        for (int num : nums) {
            if (num == val) {
                break;
            }
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{3,2,2,3,3,2}, 3));
    }
}
