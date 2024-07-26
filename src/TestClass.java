import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calArray(a, b, n);
        }
        in.close();
    }

    private static void calArray(int a, int b, int n) {
        int temp = 0;
        int[] tempList = new int[n];

        while (temp < n) {
            tempList[temp] = (int) (a + (b * Math.pow(2, temp)));
            System.out.println(tempList[temp] + " ");
            temp++;
        }
    }
}
