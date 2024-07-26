import java.util.Arrays;

public class RemoveEven {
    public static void removeEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] % 2 == 0) {
                arr[i] = 0;
                count++;
            }
        }

        int[] result = new int[arr.length - count];
        int j = 0;
        for (int i: arr) {
            if (i != 0) {
                result[j] = i;
                j++;
            }
        };
        System.out.println(Arrays.toString(result));
    }


    public static void main(String[] args) {
        removeEven(new int[]{1, 2, 3, 4, 5, 9, 0});
        removeEven(new int[]{0, 20, 41});
    }

}


