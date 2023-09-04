package Array;

import java.util.Arrays;

public class insert {
    public static int[] insertArray(int[] arr, int n, int x) {
        int i;
        n = arr.length;
        int[] newarr = new int[n + 1];
        for (i = 0; i < n; i++) {
            newarr[i] = arr[i];

        }
        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 6;
        int k = 7;
        arr = insertArray(arr, n, k);
        System.out.println(Arrays.toString(arr));
    }
}
