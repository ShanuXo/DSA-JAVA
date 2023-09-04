public class KadenAlgorithm {
    public int maxSum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        KadenAlgorithm ka = new KadenAlgorithm();
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        System.out.println(ka.maxSum(arr, n));
    }
}
