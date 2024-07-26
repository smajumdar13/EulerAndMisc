public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        // 6 5 4 1 2 3
        // 1 2 3 4 5 6
        // 3 4 5 6 1 2
        // 2 3 4 5 6 1

        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        if (nums[right] > nums[0]) {
            return nums[0];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if ( nums[mid] > nums[mid + 1]) {
//                System.out.println(mid + 1);
                return nums[mid + 1];
            }
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 4, 5, 6, 1, 2};
        int[] nums = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(nums));
    }
}
