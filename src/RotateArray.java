public class RotateArray {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        // 1 2 3 4 5 6 => K = 3 => 4 5 6 1 2 3
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[(i + K) % A.length] = A[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 6};
        int K = 2;
        int[] result = new RotateArray().solution(A, K);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
