
public class kadenAlgo {

    static int kaden(int[] arr, int n, int k) {

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;

            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }

    public static void main(String args[]) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        int k = 4;
        kaden(arr, n, k);
    }
}
