public class permutate2array {
    public static void main(String args[]) {
        int[] a = { 2, 4, 5, 6, 8, 9 };
        int n = 6;
        ispossible(a, n);

    }

    public static int ispossible(int[] a, int n) {
        n = a.length;
        for (int i = 1; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        return -1;
    }
}
