package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        arr = ReverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] ReverseArray(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return ReverseArray(arr, start + 1, end - 1);
        }
        return arr;
    }
}
