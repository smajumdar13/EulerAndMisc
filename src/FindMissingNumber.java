import java.util.Arrays;

public class FindMissingNumber {
    public int solution(int[] A) {
        // Implement your solution here
        // 2 3 1 5
        int res = 0;

        if (A.length == 0) {
            return 1;
        }

        if (A.length == 1 && A[0] == 1) {
            return 2;
        }

        A = Arrays.stream(A).sorted().toArray();
        if (A[0] != 1) {
            return 1;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1]) {
                res = A[i] + 1;
            }
        }

        if (res == 0) {
            res = A[A.length - 1] + 1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        int res = new FindMissingNumber().solution(A);
        System.out.println(res);
    }


    public int solution(int X, int Y, int D) {
        // Implement your solution here
        if (X == Y) {
            return 0;
        }
        if ((Y - X) % D == 0) {
            return ((Y - X) / D);
        } else {
            return ((Y - X) / D) + 1;
        }
    }
}
