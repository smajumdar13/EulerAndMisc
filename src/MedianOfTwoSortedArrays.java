import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length) {
            arr[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            arr[k++] = nums2[j++];
        }
        Arrays.sort(arr);

        double median = 0.0;

        if (arr.length % 2 != 0) {
            median = arr[arr.length/2];
        } else {
            median = (double) (arr[arr.length / 2 - 1] + arr[arr.length / 2]) /2;
        }
        System.out.println(median);
        return median;
    }

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
    }
}
